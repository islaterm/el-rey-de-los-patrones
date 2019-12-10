package com.github.islaterm.yugi.model.card.monster;

import com.github.islaterm.yugi.model.card.ICard;

public interface IMonsterCard extends ICard {
  void addTribute(IMonsterCard card);
  int getAttackPoints();
  void setAttackPoints(int newAttack);
  int getDefensePoints();
  void flipCard();
  void changeToAttackMode();
  void changeToDefenseMode();
}
