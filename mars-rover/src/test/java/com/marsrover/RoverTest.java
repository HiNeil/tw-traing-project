package com.marsrover;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoverTest {

  int x = 5;
  int y = 7;

  @Test
  void should_set_the_location_and_direction_when_the_location_and_direction_supplied() {
    //Given
    String dir = "N";
    //When
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //Then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
    assertEquals(dir, rover.getCurrentLoc().getDir());
  }

  @Test
  void should_add_y_when_move_north() {
    //Given
    String dir = "N";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //When
    rover.go();
    //Then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals(y + 1, rover.getCurrentLoc().getY());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(dir, rover.getCurrentLoc().getDir());
  }

  @Test
  void should_add_x_when_move_east() {
    //Given
    String dir = "E";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //When
    rover.go();
    //Then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals(x + 1, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
    assertEquals(dir, rover.getCurrentLoc().getDir());
  }

  @Test
  void should_subtract_y_when_move_south() {
    //Given
    String dir = "S";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //When
    rover.go();
    //Then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals(y - 1, rover.getCurrentLoc().getY());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(dir, rover.getCurrentLoc().getDir());
  }

  @Test
  void should_subtract_x_when_move_west() {
    //Given
    String dir = "W";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //When
    rover.go();
    //Then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals(x - 1, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
    assertEquals(dir, rover.getCurrentLoc().getDir());
  }

  @Test
  void should_face_north_when_turn_left_from_east() {
    //given
    String dir = "E";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.turnLeft();
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals("N", rover.getCurrentLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
  }

  @Test
  void should_face_west_when_turn_left_from_north() {
    //given
    String dir = "N";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.turnLeft();
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals("W", rover.getCurrentLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
  }

  @Test
  void should_face_south_when_turn_left_from_west() {
    //given
    String dir = "W";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.turnLeft();
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals("S", rover.getCurrentLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
  }

  @Test
  void should_face_east_when_turn_left_from_south() {
    //given
    String dir = "S";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.turnLeft();
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals("E", rover.getCurrentLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
  }

  @Test
  void should_face_north_when_turn_right_from_west() {
    //given
    String dir = "W";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.turnRight();
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals("N", rover.getCurrentLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
  }

  @Test
  void should_face_west_when_turn_right_from_south() {
    //given
    String dir = "S";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.turnRight();
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals("W", rover.getCurrentLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
  }

  @Test
  void should_face_south_when_turn_right_from_east() {
    //given
    String dir = "E";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.turnRight();
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals("S", rover.getCurrentLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
  }

  @Test
  void should_face_east_when_turn_left_from_north() {
    //given
    String dir = "N";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.turnRight();
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals("E", rover.getCurrentLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
  }

  @Test
  void should_move_when_revieved_command_M() {
    //given
    String dir = "N";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.move(CommandType.getByCommand("M"));
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals(y + 1, rover.getCurrentLoc().getY());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(dir, rover.getCurrentLoc().getDir());
  }

  @Test
  void should_turn_left_when_revieved_command_L() {
    //given
    String dir = "N";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.move(CommandType.getByCommand("L"));
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals("W", rover.getCurrentLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
  }

  @Test
  void should_turn_right_when_revieved_command_R() {
    //given
    String dir = "N";
    Rover rover = new Rover(x, y, DirectionType.getDir(dir));
    //when
    rover.move(CommandType.getByCommand("R"));
    //then
    assertEquals(x, rover.getOriginalLoc().getX());
    assertEquals(y, rover.getOriginalLoc().getY());
    assertEquals(dir, rover.getOriginalLoc().getDir());
    assertEquals("E", rover.getCurrentLoc().getDir());
    assertEquals(x, rover.getCurrentLoc().getX());
    assertEquals(y, rover.getCurrentLoc().getY());
  }
}
