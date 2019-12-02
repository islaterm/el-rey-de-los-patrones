package com.github.islaterm.yugi.card.monster;

public class TwoTributesMonsterCard extends AbstractMonsterCard {
  @Override
  protected boolean enoughSacrifices() {
    return tributes.size() == 2;
  }
}
