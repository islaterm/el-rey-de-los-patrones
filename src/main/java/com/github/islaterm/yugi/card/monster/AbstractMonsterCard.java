package com.github.islaterm.yugi.card.monster;

import com.github.islaterm.yugi.GameMat;
import com.github.islaterm.yugi.card.AbstractCard;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMonsterCard extends AbstractCard implements IMonsterCard {
  protected Set<IMonsterCard> tributes = new HashSet<>();

  @Override
  public void addTribute(IMonsterCard card) {
    this.tributes.add(card);
  }

  @Override
  public void playToMat(GameMat gameMat) {
    if (enoughSacrifices()) {
      gameMat.addMonster(this);
      tributes.forEach(gameMat::removeMonster);
    }
  }

  protected abstract boolean enoughSacrifices();
}
