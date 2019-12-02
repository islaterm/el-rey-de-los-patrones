package com.github.islaterm.yugi.card.monster;

import com.github.islaterm.yugi.card.ICard;

public interface IMonsterCard extends ICard {
  void addTribute(IMonsterCard card);
}
