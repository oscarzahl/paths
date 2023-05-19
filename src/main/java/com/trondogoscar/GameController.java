package com.trondogoscar;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GameController {
  private Map<String, Passage> passages;
  private Passage currentPassage;

  public GameController(Path fileName) throws IOException {
    FileHandling fileHandling = new FileHandling();
    List<Passage> passageList = fileHandling.readPassages(fileName);
    passages = new HashMap<>();
    for (Passage passage : passageList) {
      passages.put(passage.getTitle(), passage);
    }
    currentPassage = passageList.get(0);
  }

  public void play() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println(currentPassage.getContent());
      System.out.println("Links:");
      for (Link link : currentPassage.getLinks()) {
        System.out.println(link.getLinkValue() + " -> " + link.getAction());
      }
      System.out.print("Enter link: ");
      String linkValue = scanner.nextLine();
      boolean validLink = false;
      for (Link link : currentPassage.getLinks()) {
        if (link.getLinkValue().equals(linkValue)) {
          currentPassage = passages.get(link.getAction());
          validLink = true;
          break;
        }
      }
      if (!validLink) {
        System.out.println("Invalid link.");
      }
    }
  }
}
