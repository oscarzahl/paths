package com.trondogoscar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents the class Story.
 */
public class Story {
  private String title;
  private Map<Link, Passage> passages;
  private Passage openingPassage;

  /**
   * Constructs the class story.
   *
   * @param title represents the title of the story
   * @param openingPassage represents the opening passage of the story
   */
  public Story(String title, Passage openingPassage) {
    this.title = title;
    this.openingPassage = openingPassage;
    passages = new HashMap<Link, Passage>();
  }

  public String getTitle() {
    return title;
  }

  public Passage getOpeningPassage() {
    return openingPassage;
  }

  public void addPassage(Passage passage) {
    passages.put(new Link(passage.getTitle(), passage.getTitle()), passage);
  }

  public Passage getPassage(Link link) {
    return passages.get(link);
  }

  public Collection<Passage> getPassages() {
    return passages.values();
  }

  public void removePassage(Link link) {
    passages.remove(link);
  }

  /**
   * Returns the broken links.
   *
   * @return a list of broken links
   */
  public List<Link> getBrokenLinks() {
    List<Link> brokenLinks = new ArrayList<Link>();
    for (Passage passage : passages.values()) {
      for (Link link : passage.getLinks()) {
        if (!passages.containsKey(link)) {
          brokenLinks.add(link);
        }
      }
    }
    return brokenLinks;
  }
}
