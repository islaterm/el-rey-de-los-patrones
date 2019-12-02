package com.github.islaterm.yugi.card;

import com.github.islaterm.yugi.GameMat;
import com.github.islaterm.yugi.card.effect.IEffect;

public abstract class AbstractCard implements ICard {
  protected IEffect cardEffect;

  @Override
  public abstract void playToMat(GameMat gameMat);

  @Override
  public void useEffect() {
    cardEffect.use();
  }
}
