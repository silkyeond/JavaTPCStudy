package kr.poly;

public class A extends Object{

  public A() {
    super();
  }

  public void display() {
    System.out.println("나는 A이다");
  }

  //toString
  @Override
  public String toString() {
    return "재정의 매서드 입니다";
  }
}
