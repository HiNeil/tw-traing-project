package com.fizzbuzz;

public enum SpecialNumType {

  Num3Type(3, "Fizz"),
  Num5Type(5, "Buzz"),
  Num7Type(7, "Whizz");

  private Integer number;
  private String replaceStr;

  SpecialNumType(Integer number, String replaceStr) {
    this.number = number;
    this.replaceStr = replaceStr;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getReplaceStr() {
    return replaceStr;
  }

  public void setReplaceStr(String replaceStr) {
    this.replaceStr = replaceStr;
  }

  public boolean containByNum(Integer num) {
    return String.valueOf(num).contains(String.valueOf(this.number));
  }

  public boolean divideByNum(Integer num) {
    return num % this.number == 0;
  }
}
