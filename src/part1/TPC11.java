package part1;

import kr.tpc.BookVo;

public class TPC11 {

  public static void main(String[] args) {
    // 책 한권을 저장하기 위해서 [객체를 생성]하시오
    BookVo b = new BookVo();
    b.title = "파이썬";
    b.price = 16000;
    b.company = "에이콘";
    b.page = 700;

    System.out.println(b.title);
    System.out.println(b.price);
    System.out.println(b.company);
    System.out.println(b.page);

    BookVo b1 = new BookVo();
    b1.title = "오라클";
    b1.price = 16000;
    b1.company = "이지스퍼블리싱";
    b1.page = 560;

    System.out.println(b1.title);
    System.out.println(b1.price);
    System.out.println(b1.company);
    System.out.println(b1.page);
  }
}
