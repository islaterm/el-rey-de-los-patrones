package com.github.islaterm.yugi.model.card;

import com.github.islaterm.yugi.model.GameMat;
import com.github.islaterm.yugi.model.effect.IEffect;
import com.github.islaterm.yugi.model.visitor.IVisitor;

import java.util.Set;

public class SpellCard extends AbstractCard {
  public SpellCard(Set<IEffect> effect) {
    cardEffects = effect;
  }

  @Override
  public void playToMat(GameMat gameMat) {
    gameMat.addSpell(this);
  }

  @Override
  public void accept(IVisitor visitor) {
    visitor.visitSpellCard(this);
  }
}
