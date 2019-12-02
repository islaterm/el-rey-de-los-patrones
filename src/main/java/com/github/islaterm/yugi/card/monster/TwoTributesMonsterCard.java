package com.github.islaterm.yugi.card.monster;

import com.github.islaterm.yugi.effect.IEffect;

public class TwoTributesMonsterCard extends AbstractMonsterCard {
  public TwoTributesMonsterCard(IEffect effect) {
    cardEffect = effect;
  }

  @Override
  protected boolean enoughSacrifices() {
    return tributes.size() == 2;
  }
}
