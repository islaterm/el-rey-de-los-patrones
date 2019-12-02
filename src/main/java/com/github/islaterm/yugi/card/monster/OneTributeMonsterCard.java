package com.github.islaterm.yugi.card.monster;

public class OneTributeMonsterCard extends AbstractMonsterCard {
  @Override
  protected boolean enoughSacrifices() {
    return tributes.size() == 1;
  }
}
