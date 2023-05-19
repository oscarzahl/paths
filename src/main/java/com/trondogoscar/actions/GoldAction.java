package com.trondogoscar.actions;


import com.trondogoscar.Player;

class GoldAction implements Action {

  private int gold;

  public GoldAction(int gold) {
    this.gold = gold;
  }

  public void execute(Player player) {
    player.addGold(gold);
  }

}
