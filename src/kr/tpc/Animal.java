package kr.tpc;

public class Animal extends Object{ // extend Object -> 최상위 클래스

  // Dog, Cat --> eat()
  public void eat() {
    System.out.println("?"); // 포괄적, 추상적
  }

  public Animal() {
    super(); // new Object();
  }

}
