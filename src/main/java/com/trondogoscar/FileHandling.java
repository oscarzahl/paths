package com.trondogoscar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents a file handler for Passages. Responsible for reading and writing passages to and from
 * a file.
 */
public class FileHandling {

  /**
   * Reads passages from a file.
   *
   * @param fileName The name of the file to read from
   * @return The passages read from the file
   * @throws IOException if an I/O error occurs
   */
  public List<Passage> readPassages(Path fileName) throws IOException {
    List<Passage> passages = new ArrayList<>();

    String text = Files.readString(fileName);
    passages = parsePassages(text);

    return passages;
  }

  /**
   * Responsible for parsing multiple passages.
   *
   * @param text The text to parse
   * @return The passage parsed from the text
   */
  private List<Passage> parsePassages(String text) {
    List<Passage> passages = new ArrayList<>();
    Scanner inputScanner = new Scanner(text);
    inputScanner.useDelimiter("::");

    while (inputScanner.hasNext()) {
      String passageText = inputScanner.next();
      Passage passage = parsePassageContent(passageText);
      passages.add(passage);
    }

    return passages;
  }

  /**
   * Responsible for parsing the passage content.
   *
   * @param passageText The text to parse
   * @return The passages parsed from the text
   */
  private Passage parsePassageContent(String passageText) {
    String[] lines = passageText.split("\\r?\\n");
    String titleOfPassage = lines[0];
    String content = lines[1];
    Passage passage = new Passage(titleOfPassage, content);

    if (lines.length >= 3) {
      for (int i = 2; i < lines.length; i++) {
        String linkText = lines[i];
        Link link = parseLink(linkText);
        passage.addLink(link);
      }
    }

    return passage;
  }

  /**
   * Parses a link from a String.
   *
   * @param linkText The text to parseS
   * @return The link parsed from the text
   */
  private Link parseLink(String linkText) {
    int startOfReference = linkText.indexOf('(');
    int endOfReference = linkText.indexOf(')');
    String linkValue = linkText.substring(1, startOfReference - 1);
    String action = linkText.substring(startOfReference + 1, endOfReference);
    Link link = new Link(linkValue, action);
    return link;
  }
}
