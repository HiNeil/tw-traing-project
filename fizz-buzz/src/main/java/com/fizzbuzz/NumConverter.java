package com.fizzbuzz;

import static com.fizzbuzz.SpecialNumType.Num3Type;
import static com.fizzbuzz.SpecialNumType.Num5Type;
import static com.fizzbuzz.SpecialNumType.Num7Type;

public class NumConverter {

  public String convert(int number) {

    StringBuffer result = applyRule7(number);
    if (result.length() == 0) {
      result = applyRule6(number);
    }
    if (result.length() == 0) {
      result = applyRule5(number);
    }
    if (result.length() == 0) {
      result = applyBaseRule(number, null);
    }
    return result.toString();
  }

  private StringBuffer applyBaseRule(int number, SpecialNumType skipType) {

    SpecialNumType[] allType = SpecialNumType.values();
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < allType.length; i++) {
      if (allType[i] == skipType) {
        continue;
      }
      if (allType[i].divideByNum(number)) {
        sb.append(allType[i].getReplaceStr());
      }
    }
    if (sb.length() == 0) {
      sb.append(number);
    }
    return sb;
  }

  private StringBuffer applyRule5(int number) {

    StringBuffer sb = new StringBuffer();
    if (Num3Type.containByNum(number)) {
      sb.append(Num3Type.getReplaceStr());
    }
    return sb;
  }

  private StringBuffer applyRule6(int number) {

    StringBuffer sb = new StringBuffer();
    if (Num5Type.containByNum(number)) {
      sb = applyBaseRule(number, Num3Type);
    }
    return sb;
  }

  private StringBuffer applyRule7(int number) {

    StringBuffer sb = new StringBuffer();
    if (Num7Type.containByNum(number)) {
      sb = applyRule5(number);
      if (sb.length() == 0) {
        sb = applyBaseRule(number, Num5Type);
      }
    }
    return sb;
  }
}
