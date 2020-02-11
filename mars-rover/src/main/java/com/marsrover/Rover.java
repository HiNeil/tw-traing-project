package com.marsrover;

public class Rover {

  private final Location originalLoc;

  private final Location currentLoc;

  public Rover(int originalX, int originalY, DirectionType originalDir) {
    this.originalLoc = new Location(originalX, originalY, originalDir);
    this.currentLoc = new Location(originalX, originalY, originalDir);
  }

  public void move(CommandType command) {
    if (CommandType.Left == command) {
      this.turnLeft();
    } else if (CommandType.Right == command) {
      this.turnRight();
    } else if (CommandType.Go == command) {
      this.go();
    }
  }

  public void go() {
    if (currentLoc.getDir() == DirectionType.North) {
      this.currentLoc.addY();
    } else if (currentLoc.getDir() == DirectionType.East) {
      this.currentLoc.addX();
    } else if (currentLoc.getDir() == DirectionType.South) {
      this.currentLoc.subY();
    } else if (currentLoc.getDir() == DirectionType.West) {
      this.currentLoc.subX();
    }
  }

  public void turnLeft() {

    this.currentLoc.setLeft();
  }

  public void turnRight() {

    this.currentLoc.setRight();
  }

  public Location getOriginalLoc() {
    return originalLoc;
  }

  public Location getCurrentLoc() {
    return currentLoc;
  }
}
