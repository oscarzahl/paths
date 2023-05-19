package com.trondogoscar;

import com.trondogoscar.actions.Action;
import java.util.List;

/**
 * Represents the class Link.
 */
public class Link {
  private String text;
  private String linkValue;
  private String action;

  /**
   * Constructs the class link.
   *
   * @param text represents text
   * @param reference represtents reference
   */
  public Link(String linkValue, String action) {
    this.linkValue = linkValue;
    this.action = action;
  }

  public String getText() {
    return text;
  }

  public String getLinkValue() {
    return linkValue;
  }

  public void addAction(Action action) {
    action.add(action);
  }

  public String getAction() {
    return action;
  }

}
