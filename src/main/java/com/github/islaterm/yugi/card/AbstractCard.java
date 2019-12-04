package com.github.islaterm.yugi.card;

import com.github.islaterm.yugi.GameMat;
import com.github.islaterm.yugi.card.monster.MonsterCardState;
import com.github.islaterm.yugi.effect.IEffect;
import com.github.islaterm.yugi.visitor.IFlipCardEffect;
import com.github.islaterm.yugi.visitor.IVisitor;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractCard implements ICard {
  protected Set<IEffect> cardEffects;
  protected Set<ICard> equippedCards = new HashSet<>();
  private MonsterCardState state;
  private IFlipCardEffect flipCardVisitor;

  @Override
  public abstract void playToMat(GameMat gameMat);

  @Override
  public void useEffect() {
    cardEffects.forEach(IEffect::use);
  }

  @Override
  public void applyEquippedEffects() {
    for (ICard card : equippedCards) {
      card.useEffect();
      card.applyEquippedEffects();
    }
  }

  @Override
  public void flip() {
    this.state = MonsterCardState.ATTACK_MODE;
    accept(flipCardVisitor);
  }
}
