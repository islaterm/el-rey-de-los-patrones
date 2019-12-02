package com.github.islaterm.yugi.card.effect;

public class NullEffect implements IEffect {
  @Override
  public void use() {
    System.out.println("No hago nada :D");
  }
}
