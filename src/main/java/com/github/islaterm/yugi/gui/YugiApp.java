package com.github.islaterm.yugi.gui;

import com.github.islaterm.yugi.gamedriver.Controller;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class YugiApp extends JFrame {

  Controller controller = new Controller();

  /**
   * Constructs a new frame that is initially invisible.
   * <p>
   * This constructor sets the component's locale property to the value
   * returned by <code>JComponent.getDefaultLocale</code>.
   *
   * @throws HeadlessException if GraphicsEnvironment.isHeadless()
   *                           returns true.
   * @see GraphicsEnvironment#isHeadless
   * @see Component#setSize
   * @see Component#setVisible
   * @see JComponent#getDefaultLocale
   */
  public YugiApp() throws HeadlessException {
    this.setTitle("Yugi");
    this.setSize(720, 720);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(YugiApp::run);
  }

  private static void run() {
    YugiApp app = new YugiApp();
    app.add(new MainPanel(app));
    app.setVisible(true);
  }

  public Controller getController() {
    return controller;
  }
}
