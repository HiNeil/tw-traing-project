package com.marsrover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DirectionTypeTest {

  @Test
  void should_get_North_direction_when_East_get_left() {

    //when
    DirectionType left = DirectionType.East.getLeft();
    //then
    assertEquals(left, DirectionType.North);
  }

  @Test
  void should_get_West_direction_when_North_get_left() {

    //when
    DirectionType left = DirectionType.North.getLeft();
    //then
    assertEquals(left, DirectionType.West);
  }

  @Test
  void should_get_South_direction_when_West_get_left() {

    //when
    DirectionType left = DirectionType.West.getLeft();
    //then
    assertEquals(left, DirectionType.South);
  }

  @Test
  void should_get_East_direction_when_South_get_left() {

    //when
    DirectionType left = DirectionType.South.getLeft();
    //then
    assertEquals(left, DirectionType.East);
  }

  @Test
  void should_get_North_direction_when_West_get_right() {

    //when
    DirectionType right = DirectionType.West.getRight();
    //then
    assertEquals(right, DirectionType.North);
  }

  @Test
  void should_get_West_direction_when_South_get_right() {

    //when
    DirectionType right = DirectionType.South.getRight();
    //then
    assertEquals(right, DirectionType.West);
  }

  @Test
  void should_get_South_direction_when_East_get_right() {

    //when
    DirectionType right = DirectionType.East.getRight();
    //then
    assertEquals(right, DirectionType.South);
  }

  @Test
  void should_get_East_direction_when_North_get_right() {

    //when
    DirectionType right = DirectionType.North.getRight();
    //then
    assertEquals(right, DirectionType.East);
  }
}