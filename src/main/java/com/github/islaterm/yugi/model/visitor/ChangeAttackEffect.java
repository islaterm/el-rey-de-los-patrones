package com.github.islaterm.yugi.model.visitor;

import com.github.islaterm.yugi.model.card.SpellCard;
import com.github.islaterm.yugi.model.card.monster.IMonsterCard;

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
