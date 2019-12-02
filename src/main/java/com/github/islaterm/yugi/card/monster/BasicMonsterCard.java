package com.github.islaterm.yugi.card.monster;

import com.github.islaterm.yugi.effect.IEffect;

public class BasicMonsterCard extends AbstractMonsterCard {
  public BasicMonsterCard(IEffect effect) {
    cardEffect = effect;
  }

  @Override
  protected boolean enoughSacrifices() {
    return tributes.isEmpty();
  }
}
