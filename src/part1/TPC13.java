package part1;

import kr.tpc.BookDto;

public class TPC13 {

  public static void main(String[] args) {
    // 책 -> class (BookDTO) -> 객체 -> 인스턴스
    String title = "스프링";
    int price = 25000;
    String company = "게이밍";
    int page = 890;

    BookDto dto; // dto(Object : 객체)
    dto = new BookDto(title, price, company, page); // dto (Instance : 인스턴스)

    bookPrint(dto);
  }

  public static void bookPrint(BookDto dto) {
    System.out.println(dto.title);
    System.out.println(dto.price);
    System.out.println(dto.company);
    System.out.println(dto.page);
  }
}