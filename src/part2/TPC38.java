package part2;

import java.util.ArrayList;
import java.util.List;
import kr.tpc.BookDto;

public class TPC38 {
  public static void main(String[] args) {

    List<BookDto> list = new ArrayList<BookDto>(1); //Object[] --> BookDto[]
    list.add(new BookDto("자바", 12000, "이지스", 600));
    list.add(new BookDto("C언어", 17000, "에이콘", 700));
    list.add(new BookDto("Python", 15000, "이지스", 690));

    for (int i = 0; i < list.size(); i++) {
//      Object o = list.get(i);
      BookDto vo = list.get(i);
      System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
    }
  }
}
