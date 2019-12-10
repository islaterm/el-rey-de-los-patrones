package com.github.islaterm.yugi.gui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class MainPanel extends JPanel {

  /**
   * Creates a new <code>JPanel</code> with a double buffer
   * and a flow layout.
   *
   * @param app
   */
  public MainPanel(YugiApp app) {
    this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    Border margin = new EmptyBorder(10, 10, 10, 10);
    this.setBorder(new CompoundBorder(this.getBorder(), margin));
    addLabel("# of cards in deck: " + app.getController().getDeckSize());
    addLabel("# of cards in hand: " + app.getController().getHandSize());
  }

  private void addLabel(String text) {
    JLabel label = new JLabel(text);
    this.add(label);
  }
}
