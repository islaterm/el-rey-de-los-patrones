package com.github.islaterm.yugi.card;

import com.github.islaterm.yugi.GameMat;
import com.github.islaterm.yugi.effect.IEffect;
import com.github.islaterm.yugi.visitor.IVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class SpellCard extends AbstractCard {
  public SpellCard(Set<IEffect> effect) {
    cardEffects = effect;
  }

  @Override
  public void playToMat(@NotNull GameMat gameMat) {
    gameMat.addSpell(this);
  }

  @Override
  public void accept(IVisitor visitor) {
    visitor.visitSpellCard(this);
  }
}
