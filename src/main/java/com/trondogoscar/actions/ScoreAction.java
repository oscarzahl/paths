package com.trondogoscar.actions;

import com.trondogoscar.Player;

class ScoreAction implements Action {
  private int points;

  public ScoreAction(int points) {
    this.points = points;
  }

  public void execute(Player player) {
    player.addScore(points);
  }
}
