package com.trondogoscar.goal;

import com.trondogoscar.Player;

/**
 * Represents the player goals.
 */
public interface Goal {
  public boolean isFulfilled(Player player);
}
