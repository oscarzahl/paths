package com.trondogoscar.goal;

import com.trondogoscar.Player;
import java.util.List;

class InventoryGoal implements Goal {
  private List<String> mandatoryItems;

  public InventoryGoal(List<String> mandatoryItems) {
    this.mandatoryItems = mandatoryItems;
  }


  public boolean isFulfilled(Player player) {
    return player.getInventory().containsAll(mandatoryItems);
  }

}
