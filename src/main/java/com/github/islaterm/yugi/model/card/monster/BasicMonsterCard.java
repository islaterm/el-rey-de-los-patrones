package com.github.islaterm.yugi.model.card.monster;

import com.github.islaterm.yugi.model.effect.IEffect;

import java.util.Set;

public class BasicMonsterCard extends AbstractMonsterCard {
  public BasicMonsterCard(Set<IEffect> effect) {
    cardEffects = effect;
  }

  @Override
  protected boolean enoughSacrifices() {
    return tributes.isEmpty();
  }
}
