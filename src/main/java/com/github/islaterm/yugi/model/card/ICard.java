package com.github.islaterm.yugi.model.card;

import com.github.islaterm.yugi.model.GameMat;
import com.github.islaterm.yugi.model.visitor.IVisitor;

/**
 * Common interface for all playable cards of the game.
 */
public interface ICard {
  void playToMat(GameMat gameMat);

  void useEffect();

  void applyEquippedEffects();

  void accept(IVisitor visitor);

  void flip();
}
