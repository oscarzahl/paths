package com.trondogoscar;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the class Passage.
 */
public class Passage {
  private String title;
  private String content;
  private List<Link> links;

  /**
   * Constructs the class passage.
   *
   * @param title represents the title
   * @param content represents the content
   */
  public Passage(String title, String content) {
    this.title = title;
    this.content = content;
    this.links = new ArrayList<Link>();
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  /**
   * Adds a link to the list links.
   *
   * @param link represents the link.
   * @return returns true or false depending on if the method works.
   *
   */
  public boolean addLink(Link link) {
    boolean result = false;
    if (links.contains(link)) {
      result = false;
    } else {
      links.add(link);
      result = true;
    }
    return result;
  }

  public List<Link> getLinks() {
    return links;
  }

  public boolean hasLinks() {
    return !links.isEmpty();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(title).append("\n");
    sb.append(content).append("\n");
    for (Link link : links) {
      sb.append(link.getText()).append(" - ").append(link.getLinkValue()).append("\n");
    }
    return sb.toString();
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Passage passage = (Passage) object;
    return title.equals(passage.title) && content.equals(passage.content)
        && links.equals(passage.links);
  }

  /**
   * Gives user a hashcode.
   */
  public int hashCode() {
    int result = title.hashCode();
    result = 31 * result + content.hashCode();
    result = 31 * result + links.hashCode();
    return result;
  }
}
