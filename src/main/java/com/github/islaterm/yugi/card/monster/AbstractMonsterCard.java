package com.github.islaterm.yugi.card.monster;

import com.github.islaterm.yugi.GameMat;
import com.github.islaterm.yugi.card.AbstractCard;
import com.github.islaterm.yugi.visitor.IVisitor;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMonsterCard extends AbstractCard implements IMonsterCard {
  protected Set<IMonsterCard> tributes = new HashSet<>();
  private int attackPoints, defensePoints;
  private MonsterCardState state;

  @Override
  public void addTribute(IMonsterCard card) {
    this.tributes.add(card);
  }

  @Override
  public void playToMat(GameMat gameMat) {
    if (enoughSacrifices()) {
      gameMat.addMonster(this);
      tributes.forEach(gameMat::removeMonster);
    }
  }
  
  

  @Override
  public int getAttackPoints() {
    return attackPoints;
  }

  @Override
  public void setAttackPoints(int newAttack) {
    attackPoints = newAttack;
  }

  @Override
  public void accept(IVisitor visitor) {
    visitor.visitMonsterCard(this);
  }

  @Override
  public int getDefensePoints() {
    return defensePoints;
  }

  @Override
  public void flipCard() {
    if (this.state == MonsterCardState.FACE_DOWN) {
      this.state = MonsterCardState.ATTACK_MODE;
    }
  }

  @Override
  public void changeToAttackMode() {

  }

  @Override
  public void changeToDefenseMode() {

  }

  protected abstract boolean enoughSacrifices();
}
