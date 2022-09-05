package part1;

import kr.bit.Book;
import kr.bit.PersonVo;

public class TPC03 {

  public static void main(String[] args) {
    // 관계를 이해하라. PDT(기본자료형, Primitive Data Type) vs UDDT (사용자정의자료형, User Defined Data Type)
    // 정수 1개를 지정하기 위한 변수를 선언하시오
    int a;
    a=10;

    // 책 한 권을 저장하기위한 변수를 선언하시오
    // Book는 실체 (instance 변수)
    // b는 객체 변수
    Book b;

    b = new Book();
    b.title = "자바";
    b.price = 15000;
    b.company = "한빛미디어";
    b.page = 700;

    System.out.println(b.title);
    System.out.println(b.price);
    System.out.println(b.company);
    System.out.println(b.page);

    PersonVo p;
    p = new PersonVo();

    p.name = "박매일";
    p.age = 40;
    p.height = 160.0f;
    p.weight = 40.6f;

    System.out.println(p.name);
    System.out.println(p.age);
    System.out.println(p.height);
    System.out.println(p.weight);
  }
}
