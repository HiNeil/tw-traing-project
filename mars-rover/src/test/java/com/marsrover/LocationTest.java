package com.marsrover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LocationTest {

  int x = 2;
  int y = 6;
  DirectionType dir = DirectionType.North;

  @Test
  void should_add_x_when_call_addX() {
    //given
    Location location = new Location(x, y, dir);
    //when
    location.addX();
    //then
    assertEquals(x + 1, location.getX());
    assertEquals(y, location.getY());
    assertEquals(dir, location.getDir());
  }

  @Test
  void should_sub_x_when_call_subX() {
    //given
    Location location = new Location(x, y, dir);
    //when
    location.subX();
    //then
    assertEquals(x - 1, location.getX());
    assertEquals(y, location.getY());
    assertEquals(dir, location.getDir());
  }

  @Test
  void should_add_y_when_call_addY() {
    //given
    Location location = new Location(x, y, dir);
    //when
    location.addY();
    //then
    assertEquals(x, location.getX());
    assertEquals(y + 1, location.getY());
    assertEquals(dir, location.getDir());
  }

  @Test
  void should_sub_y_when_call_subY() {
    //given
    Location location = new Location(x, y, dir);
    //when
    location.subY();
    //then
    assertEquals(x, location.getX());
    assertEquals(y - 1, location.getY());
    assertEquals(dir, location.getDir());
  }

  @Test
  void should_set_to_left_when_call_setLeft() {
    //given
    Location location = new Location(x, y, dir);
    //when
    location.setLeft();
    //then
    assertEquals(x, location.getX());
    assertEquals(y, location.getY());
    assertEquals(DirectionType.West, location.getDir());
  }

  @Test
  void should_set_to_right_when_call_setRight() {
    //given
    Location location = new Location(x, y, dir);
    //when
    location.setRight();
    //then
    assertEquals(x, location.getX());
    assertEquals(y, location.getY());
    assertEquals(DirectionType.East, location.getDir());
  }
}