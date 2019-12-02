package com.github.islaterm.yugi.card;

import com.github.islaterm.yugi.GameMat;
import com.github.islaterm.yugi.card.effect.Effect;
import org.jetbrains.annotations.NotNull;

public class SpellCard extends AbstractCard {
  public SpellCard(Effect effect) {
    cardEffect = effect;
  }

  @Override
  public void playToMat(@NotNull GameMat gameMat) {
    gameMat.addSpell(this);
  }
}
