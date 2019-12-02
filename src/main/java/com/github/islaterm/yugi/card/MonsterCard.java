package com.github.islaterm.yugi.card;

import com.github.islaterm.yugi.GameMat;
import org.jetbrains.annotations.NotNull;

public class MonsterCard extends AbstractCard {

  @Override
  public void playtoMath(@NotNull GameMat gameMat) {
    gameMat.addMonster(this);
  }
}
