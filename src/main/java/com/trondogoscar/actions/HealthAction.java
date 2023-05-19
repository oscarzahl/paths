package com.trondogoscar.actions;

import com.trondogoscar.Player;

class HealthAction implements Action {
  private int health;

  public HealthAction(int health) {
    this.health = health;
  }

  public void execute(Player player) {
    player.addHealth(health);
  }
}
