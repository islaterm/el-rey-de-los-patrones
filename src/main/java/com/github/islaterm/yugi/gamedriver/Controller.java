package com.github.islaterm.yugi.gamedriver;

import com.github.islaterm.yugi.gamedriver.state.DrawPhase;
import com.github.islaterm.yugi.gamedriver.state.Phase;
import com.github.islaterm.yugi.model.Player;

import static jdk.jshell.spi.ExecutionControl.NotImplementedException;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class Controller {
  private Player player = new Player();
  private Phase phase = new DrawPhase(this);
  private boolean firstTurn = true;

  public int getHandSize() {
    return player.getHand().size();
  }

  public int getDeckSize() {
    return player.getDeck().size();
  }

  public void setPhase(Phase phase) {
    this.phase = phase;
  }

  public void playPhase() throws NotImplementedException {
    phase.play();
  }

  public boolean isFirstTurn() {
    return firstTurn;
  }

  public void drawCard() {
    player.drawCard();
  }
}
