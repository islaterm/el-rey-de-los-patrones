package com.github.islaterm.yugi.card;

import com.github.islaterm.yugi.GameMat;

public abstract class AbstractCard implements ICard {
  @Override
  public abstract void playToMat(GameMat gameMat);
}
