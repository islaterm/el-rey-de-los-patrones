package com.github.islaterm.yugi.effect;

import com.github.islaterm.yugi.card.ICard;

public abstract class AbstractEffect implements IEffect {
  protected ICard equippedTo;
  @Override
  public void use() {
    System.out.println("Soy un efecto owo");
  }
}
