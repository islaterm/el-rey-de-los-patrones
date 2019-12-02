package com.github.islaterm.yugi.card;

import com.github.islaterm.yugi.GameMat;

/**
 * Common interface for all playable cards of the game.
 */
public interface ICard {
  void playToMat(GameMat gameMat);

  void useEffect();
}
