package com.trondogoscar.goal;

import com.trondogoscar.Player;

class GoldGoal implements Goal {
  private int minimumGold;

  public GoldGoal(int minimumGold) {
    this.minimumGold = minimumGold;
  }

  public boolean isFulfilled(Player player) {
    return player.getGold() > minimumGold;
  }

}
