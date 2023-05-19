package com.trondogoscar.goal;

import com.trondogoscar.Player;

class HealthGoal implements Goal {
  private int minimumHealth;

  public HealthGoal(int minimumHealth) {
    this.minimumHealth = minimumHealth;
  }

  public boolean isFulfilled(Player player) {
    return player.getHealth() > minimumHealth;
  }

}
