package com.github.islaterm.yugi.model;

import com.github.islaterm.yugi.model.card.ICard;
import com.github.islaterm.yugi.model.card.SpellCard;
import com.github.islaterm.yugi.model.effect.NullEffect;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class Player {
  private List<ICard>
      deck = new ArrayList<>(),
      hand = new ArrayList<>();

  public Player() {
    for (int i = 0; i < 50; i++) {
      deck.add(new SpellCard(Set.of(NullEffect.getInstance())));
    }
    for (int i = 0; i < 7; i++) {
      hand.add(new SpellCard(Set.of(NullEffect.getInstance())));
    }
  }

  public List<ICard> getDeck() {
    return List.copyOf(deck);
  }

  public List<ICard> getHand() {
    return List.copyOf(hand);
  }

  public void drawCard() {
    hand.add(deck.get(0));
    deck.remove(0);
  }
}
