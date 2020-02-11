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
    Rover rover = new Rover(x, y, dir);
    //Then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
    assertEquals(dir, rover.getCurrentDir());
  }

  @Test
  void should_add_y_when_move_north() {
    //Given
    String dir = "N";
    Rover rover = new Rover(x, y, dir);
    //When
    rover.go();
    //Then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals(y + 1, rover.getCurrentY());
    assertEquals(x, rover.getCurrentX());
    assertEquals(dir, rover.getCurrentDir());
  }

  @Test
  void should_add_x_when_move_east() {
    //Given
    String dir = "E";
    Rover rover = new Rover(x, y, dir);
    //When
    rover.go();
    //Then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals(x + 1, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
    assertEquals(dir, rover.getCurrentDir());
  }

  @Test
  void should_subtract_y_when_move_south() {
    //Given
    String dir = "S";
    Rover rover = new Rover(x, y, dir);
    //When
    rover.go();
    //Then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals(y - 1, rover.getCurrentY());
    assertEquals(x, rover.getCurrentX());
    assertEquals(dir, rover.getCurrentDir());
  }

  @Test
  void should_subtract_x_when_move_west() {
    //Given
    String dir = "W";
    Rover rover = new Rover(x, y, dir);
    //When
    rover.go();
    //Then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals(x - 1, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
    assertEquals(dir, rover.getCurrentDir());
  }

  @Test
  void should_face_north_when_turn_left_from_east() {
    //given
    String dir = "E";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.turnLeft();
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals("N", rover.getCurrentDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
  }

  @Test
  void should_face_west_when_turn_left_from_north() {
    //given
    String dir = "N";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.turnLeft();
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals("W", rover.getCurrentDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
  }

  @Test
  void should_face_south_when_turn_left_from_west() {
    //given
    String dir = "W";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.turnLeft();
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals("S", rover.getCurrentDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
  }

  @Test
  void should_face_east_when_turn_left_from_south() {
    //given
    String dir = "S";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.turnLeft();
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals("E", rover.getCurrentDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
  }

  @Test
  void should_face_north_when_turn_right_from_west() {
    //given
    String dir = "W";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.turnRight();
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals("N", rover.getCurrentDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
  }

  @Test
  void should_face_west_when_turn_right_from_south() {
    //given
    String dir = "S";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.turnRight();
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals("W", rover.getCurrentDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
  }

  @Test
  void should_face_south_when_turn_right_from_east() {
    //given
    String dir = "E";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.turnRight();
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals("S", rover.getCurrentDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
  }

  @Test
  void should_face_east_when_turn_left_from_north() {
    //given
    String dir = "N";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.turnRight();
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals("E", rover.getCurrentDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
  }

  @Test
  void should_move_when_revieved_command_M() {
    //given
    String dir = "N";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.move("M");
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals(y + 1, rover.getCurrentY());
    assertEquals(x, rover.getCurrentX());
    assertEquals(dir, rover.getCurrentDir());
  }

  @Test
  void should_turn_left_when_revieved_command_L() {
    //given
    String dir = "N";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.move("L");
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals("W", rover.getCurrentDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
  }

  @Test
  void should_turn_right_when_revieved_command_R() {
    //given
    String dir = "N";
    Rover rover = new Rover(x, y, dir);
    //when
    rover.move("R");
    //then
    assertEquals(x, rover.getOriginalX());
    assertEquals(y, rover.getOriginalY());
    assertEquals(dir, rover.getOriginalDir());
    assertEquals("E", rover.getCurrentDir());
    assertEquals(x, rover.getCurrentX());
    assertEquals(y, rover.getCurrentY());
  }
}
