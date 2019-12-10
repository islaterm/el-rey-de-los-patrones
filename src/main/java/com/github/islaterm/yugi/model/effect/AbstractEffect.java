package com.github.islaterm.yugi.model.effect;

import com.github.islaterm.yugi.model.card.ICard;

public abstract class AbstractEffect implements IEffect {
  protected ICard equippedTo;
  @Override
  public void use() {
    System.out.println("Soy un efecto owo");
  }
}
