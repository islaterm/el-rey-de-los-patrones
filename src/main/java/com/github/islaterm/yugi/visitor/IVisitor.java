package com.github.islaterm.yugi.visitor;

import com.github.islaterm.yugi.card.SpellCard;
import com.github.islaterm.yugi.card.monster.IMonsterCard;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public interface IVisitor {
  void visitSpellCard(SpellCard card);
  void visitMonsterCard(IMonsterCard card);
}
