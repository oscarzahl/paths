package com.trondogoscar.actions;

import com.trondogoscar.Player;

class InventoryAction implements Action {
  private String item;

  public InventoryAction(String item) {
    this.item = item;
  }

  public void execute(Player player) {
    player.addToInventory(item);
  }
}
