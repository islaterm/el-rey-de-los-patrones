package com.github.islaterm.yugi;

import com.github.islaterm.yugi.card.ICard;
import com.github.islaterm.yugi.card.monster.IMonsterCard;

import java.util.HashSet;
import java.util.Set;

public class GameMat {
  private Set<ICard>
      monsterZone = new HashSet<>(),
      spellZone = new HashSet<>();

  public void addMonster(ICard monsterCard) {
    monsterZone.add(monsterCard);
  }

  public void addSpell(ICard spellCard) {
    spellZone.add(spellCard);
  }

  public void removeMonster(IMonsterCard card) {
    monsterZone.remove(card);
  }
}
