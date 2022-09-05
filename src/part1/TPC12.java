package part1;

import kr.tpc.BookVo;

public class TPC12 {

  public static void main(String[] args) {
    // 생성자 -> 생성 + 초기화 -> 중복정의 가능
    BookVo b1 = new BookVo();
    // b1.title = "오라클";

    System.out.println(b1.title);
    System.out.println(b1.price);
    System.out.println(b1.company);
    System.out.println(b1.page);

    BookVo b2 = new BookVo();

    System.out.println(b2.title);
    System.out.println(b2.price);
    System.out.println(b2.company);
    System.out.println(b2.page);

    BookVo b3 = new BookVo("Python", 18000, "대림", 920);

    System.out.println(b3.title);
    System.out.println(b3.price);
    System.out.println(b3.company);
    System.out.println(b3.page);
  }
}
