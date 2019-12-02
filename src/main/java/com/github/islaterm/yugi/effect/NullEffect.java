package com.github.islaterm.yugi.effect;

public class NullEffect implements IEffect {
  private static IEffect instance;

  private NullEffect() {
  }

  @Override
  public void use() {
    System.out.println("No hago nada :D");
  }

  public static IEffect getInstance() {
    if (instance == null) {
      instance = new NullEffect();
    }
    return instance;
  }
}
