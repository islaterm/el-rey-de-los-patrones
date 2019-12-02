package com.github.islaterm.yugi.card.monster;

public class BasicMonsterCard extends AbstractMonsterCard {

  @Override
  protected boolean enoughSacrifices() {
    return tributes.isEmpty();
  }
}
