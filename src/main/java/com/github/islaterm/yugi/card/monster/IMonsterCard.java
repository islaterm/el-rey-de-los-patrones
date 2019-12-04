package com.github.islaterm.yugi.card.monster;

import com.github.islaterm.yugi.card.ICard;

public interface IMonsterCard extends ICard {
  void addTribute(IMonsterCard card);
  int getAttackPoints();
  void setAttackPoints(int newAttack);
  int getDefensePoints();
  void flipCard();
  void changeToAttackMode();
  void changeToDefenseMode();
}
