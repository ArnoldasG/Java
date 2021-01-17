package main.java.Lessons.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Method {

    public static void main(String[] args) {
        List<String> alph = new ArrayList<>();
        alph.add("A");
        alph.add("B");
        System.out.println(alphaList(alph));


    }

  public static List alphaList(List<String> alphabet) {

      Collections.reverse(alphabet);
      return alphabet;
  }
}
