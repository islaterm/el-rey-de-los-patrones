package com.github.islaterm.yugi.card.monster;

import com.github.islaterm.yugi.effect.IEffect;

public class OneTributeMonsterCard extends AbstractMonsterCard {
  public OneTributeMonsterCard(IEffect effect) {
    cardEffect = effect;
  }

  @Override
  protected boolean enoughSacrifices() {
    return tributes.size() == 1;
  }
}
