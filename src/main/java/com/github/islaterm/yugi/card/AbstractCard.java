package com.github.islaterm.yugi.card;

import com.github.islaterm.yugi.GameMat;
import com.github.islaterm.yugi.effect.IEffect;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractCard implements ICard {
  protected IEffect cardEffect;
  protected Set<ICard> equippedCards = new HashSet<>();

  @Override
  public abstract void playToMat(GameMat gameMat);

  @Override
  public void useEffect() {
    cardEffect.use();
  }

  @Override
  public void applyEquippedEffects() {
    for (ICard card : equippedCards) {
      card.useEffect();
      card.applyEquippedEffects();
    }
  }
}
