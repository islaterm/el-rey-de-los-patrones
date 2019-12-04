package com.github.islaterm.yugi.visitor;

import com.github.islaterm.yugi.card.SpellCard;
import com.github.islaterm.yugi.card.monster.IMonsterCard;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class ChangeAttackEffect implements IVisitor {

  private int amountToChange;

  public ChangeAttackEffect(int amountToChange) {
    this.amountToChange = amountToChange;
  }

  @Override
  public void visitSpellCard(SpellCard card) {

  }

  @Override
  public void visitMonsterCard(IMonsterCard card) {
    card.setAttackPoints(card.getAttackPoints() + amountToChange);
  }
}
