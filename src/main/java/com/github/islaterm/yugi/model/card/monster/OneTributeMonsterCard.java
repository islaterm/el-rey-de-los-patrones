package com.github.islaterm.yugi.model.card.monster;

import com.github.islaterm.yugi.model.effect.IEffect;

import java.util.Set;

public class OneTributeMonsterCard extends AbstractMonsterCard {
  public OneTributeMonsterCard(Set<IEffect> effect) {
    cardEffects = effect;
  }

  @Override
  protected boolean enoughSacrifices() {
    return tributes.size() == 1;
  }
}
