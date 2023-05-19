package com.trondogoscar;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder class for Player.
 */
public class PlayerBuilder {
  private String name;
  private int health;
  private int score;
  private int gold;
  private List<String> inventory;

  /**
   * Constructs the PlayerBuilderClass
   */
  public PlayerBuilder() {
    // Set default values
    this.name = "";
    this.health = 100;
    this.score = 0;
    this.gold = 0;
    this.inventory = new ArrayList<>();
  }

  public PlayerBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public PlayerBuilder withHealth(int health) {
    this.health = health;
    return this;
  }

  public PlayerBuilder withScore(int score) {
    this.score = score;
    return this;
  }

  public PlayerBuilder withGold(int gold) {
    this.gold = gold;
    return this;
  }

  public PlayerBuilder addToInventory(String item) {
    this.inventory.add(item);
    return this;
  }

  public Player build() {
    return new Player(name, health, score, gold);
  }
}
