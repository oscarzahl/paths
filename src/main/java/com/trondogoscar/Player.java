package com.trondogoscar;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the class Player.
 */
public class Player {
  private String name;
  private int health;
  private int score;
  private int gold;
  private List<String> inventory;

  /**
   * Constructs the player class.
   *
   * @param name represents the name of the player
   * @param health represents the health of the player
   * @param score represents the player score
   * @param gold represents the gold of the player
   */
  public Player(String name, int health, int score, int gold) {
    this.name = name;
    this.health = health;
    this.score = score;
    this.gold = gold;
    this.inventory = new ArrayList<String>();
  }

  public String getName() {
    return name;
  }

  public void addHealth(int health) {
    health += this.health;
  }

  public int getHealth() {
    return health;
  }

  public void addScore(int points) {
    score += points;
  }

  public int getScore() {
    return score;
  }

  public void addGold(int gold) {
    gold += this.gold;
  }

  public int getGold() {
    return gold;
  }

  public void addToInventory(String item) {
    inventory.add(item);
  }

  public List<String> getInventory() {
    return inventory;
  }
}
