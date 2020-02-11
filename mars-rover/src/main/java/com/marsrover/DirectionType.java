package com.marsrover;

public enum DirectionType {

  East("E"), North("N"), West("W"), South("S");


  private String desc;

  DirectionType(String desc) {
    this.desc = desc;
  }

  public String getDesc() {
    return desc;
  }

  public DirectionType getLeft() {

    DirectionType[] dirs = DirectionType.values();
    for (int i = 0; i < dirs.length; i++) {
      if (i == 3) {
        return dirs[0];
      } else if (dirs[i] == this) {
        return dirs[i + 1];
      }
    }
    throw new RuntimeException("Can not get left for direction:" + this.name());
  }

  public DirectionType getRight() {
    DirectionType[] dirs = DirectionType.values();
    for (int i = dirs.length - 1; i > -1; i--) {
      if (i == 0) {
        return dirs[dirs.length - 1];
      } else if (dirs[i] == this) {
        return dirs[i - 1];
      }
    }
    throw new RuntimeException("Can not get right for direction:" + this.name());
  }

  public static DirectionType getDir(String desc) {
    for (DirectionType dir : DirectionType.values()) {
      if (dir.getDesc().equals(desc)) {
        return dir;
      }
    }
    throw new RuntimeException("Can not get direction type from direction:" + desc);
  }
}
