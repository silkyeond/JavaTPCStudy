package part2;

import java.util.ArrayList;
import kr.inflearn.ObjArr;
import kr.tpc.A;
import kr.tpc.B;

public class TPC37 {
  public static void main(String[] args) {

    ArrayList arr = new ArrayList(5); // Object[], (배열의 길이에 제약이 없다 --> ArrayList)
    arr.add(new A());
    arr.add(new B());
    arr.add(new A());
    arr.add(new A());
    arr.add(new B());
    arr.add(new B());
    arr.add(new A());
    arr.add(new B());
    arr.add(new A());
    arr.add(new B());

    for (int i = 0; i < arr.size(); i++) {
      Object o = arr.get(i);
      if (o instanceof A) {
        ((A) o).go();
      } else {
        ((B) o).go();
      }
    }
  }
}
