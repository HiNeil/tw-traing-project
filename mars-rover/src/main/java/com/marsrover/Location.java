package com.marsrover;

import java.time.LocalDate;

public class Location {

  private int x;
  private int y;
  private DirectionType dir;

  public Location(int x, int y, DirectionType dir) {
    this.x = x;
    this.y = y;
    this.dir = dir;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public DirectionType getDir() {
    return dir;
  }

  public void addX() {
    this.x++;
  }

  public void subX() {
    this.x--;
  }

  public void addY() {
    this.y++;
  }

  public void subY() {
    this.y--;
  }

  public void setRight() {
    this.dir = this.dir.getRight();
  }

  public void setLeft() {
    this.dir = this.dir.getLeft();
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    return sb.append("x->").append(this.x).append(",").append("y->").append(this.y).append(",")
        .append("dir->").append(this.dir.getDesc()).toString();
  }
}
