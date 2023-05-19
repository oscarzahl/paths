package com.trondogoscar;

import com.trondogoscar.goal.Goal;
import java.util.List;

/**
 * Represents the class Game.
 */
public class Game {
  private Player player;
  private Story story;
  private List<Goal> goals;

  /**
   * Constructs the player class.
   *
   * @param player represents the player
   * @param story represents the story
   * @param goals represents the goals
   */
  public Game(Player player, Story story, List<Goal> goals) {
    this.player = player;
    this.story = story;
    this.goals = goals;
  }

  public Player getPlayer() {
    return player;
  }

  public Story getStory() {
    return story;
  }

  public List<Goal> getGoals() {
    return goals;
  }

  public Passage begin() {
    return story.getOpeningPassage();
  }

  public Passage go(Link link) {
    return story.getPassage(link);
  }
}
