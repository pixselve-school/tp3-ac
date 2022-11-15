package utils;

import java.util.HashSet;

public class Grid {
  private final int taille;
  private HashSet<Pair> queens;

  public Grid(int taille) {
    this.taille = taille;
    queens = new HashSet<>();
  }

  public void addQueen(int i, int j) {
    queens.add(new Pair(i, j));
  }

  @Override
  public String toString() {
    StringBuilder horizontalLine = new StringBuilder();
    // vertical line
    horizontalLine.append("-".repeat(this.taille * 2 + 1));

    StringBuilder result = new StringBuilder();
    result.append(horizontalLine);
    result.append('\n');
    for (int line = 0; line < this.taille; line++) {
      for (int column = 0; column < this.taille; column++) {
        result.append('|');
        if (queens.contains(new Pair(line, column))) {
          result.append('Q');
        } else {
          result.append(' ');
        }
      }
      result.append('|');
      result.append('\n');
      result.append(horizontalLine);
      result.append('\n');
    }
    return result.toString();
  }
}