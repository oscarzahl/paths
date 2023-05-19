package com.trondogoscar.goal;

import com.trondogoscar.Player;

class ScoreGoal implements Goal {
  private int minimumPoints;

  public ScoreGoal(int minimumPoints) {
    this.minimumPoints = minimumPoints;
  }

  public boolean isFulfilled(Player player) {
    return player.getScore() > minimumPoints;
  }

}
