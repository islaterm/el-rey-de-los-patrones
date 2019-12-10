package com.github.islaterm.yugi.gamedriver.state;

import com.github.islaterm.yugi.gamedriver.Controller;

import static jdk.jshell.spi.ExecutionControl.NotImplementedException;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class Phase {
  protected final Controller context;

  public Phase(Controller controller) {
    this.context = controller;
  }

  public void changeToDrawPhase() throws NotImplementedException {
    throw new NotImplementedException("Yo no debería hacer esto");
  }

  public void changeToMainPhase1() throws NotImplementedException {
    throw new NotImplementedException("Yo no debería hacer esto");
  }

  public void play() throws NotImplementedException {
    throw new NotImplementedException("Yo no debería hacer esto");
  }
}
