package com.github.islaterm.yugi.gamedriver.state;

import com.github.islaterm.yugi.gamedriver.Controller;
import jdk.jshell.spi.ExecutionControl;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class DrawPhase extends Phase {
  public DrawPhase(Controller controller) {
    super(controller);
  }

  @Override
  public void changeToMainPhase1() {
    context.setPhase(new MainPhase1(context));
  }

  @Override
  public void play() throws ExecutionControl.NotImplementedException {
    if (!context.isFirstTurn()) {
      context.drawCard();
    }
    changeToMainPhase1();
  }
}
