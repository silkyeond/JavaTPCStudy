package part2;

import kr.poly.A;

public class TPC28 {

  public static void main(String[] args) {

    A a = new A();
    a.display();
    System.out.println(a); // Object --> toString() : kr.poly.A@5e265ba4

    Object o = new A(); // upcasting
    ((A) o).display();
    System.out.println(o.toString());
  }
}
