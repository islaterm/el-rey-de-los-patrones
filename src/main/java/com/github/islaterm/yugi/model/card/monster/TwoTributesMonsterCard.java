package com.github.islaterm.yugi.model.card.monster;

import com.github.islaterm.yugi.model.effect.IEffect;

import java.util.Set;

public class TwoTributesMonsterCard extends AbstractMonsterCard {
  public TwoTributesMonsterCard(Set<IEffect> effect) {
    cardEffects = effect;
  }

  @Override
  protected boolean enoughSacrifices() {
    return tributes.size() == 2;
  }
}
