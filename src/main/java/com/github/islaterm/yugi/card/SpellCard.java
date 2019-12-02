package com.github.islaterm.yugi.card;

import com.github.islaterm.yugi.GameMat;
import org.jetbrains.annotations.NotNull;

public class SpellCard extends AbstractCard {
  @Override
  public void playToMat(@NotNull GameMat gameMat) {
    gameMat.addSpell(this);
  }
}
