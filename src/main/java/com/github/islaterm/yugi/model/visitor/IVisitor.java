package com.github.islaterm.yugi.model.visitor;

import com.github.islaterm.yugi.model.card.SpellCard;
import com.github.islaterm.yugi.model.card.monster.IMonsterCard;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public interface IVisitor {
  void visitSpellCard(SpellCard card);
  void visitMonsterCard(IMonsterCard card);
}
