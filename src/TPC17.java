import kr.tpc.MovieVo;

public class TPC17 {

  // 영화 3편을 저장 -> 객체배열

  MovieVo[] movieVOS = new MovieVo[3];

  public static void main(String[] args) {

    int[] a = new int[5];
    a[0] = 10;
    a[1] = 20;
    a[2] = 30;
    a[3] = 40;
    a[4] = 50;

    int[] b = {10, 20, 30, 40, 50};

    int[] c = new int[]{10, 20, 30, 40, 50};

    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }

    // 영화(제목, 가격, 주인공, 등급, 시간)
    MovieVo m = new MovieVo("비트", 12000, "연기자", 12, 1.3f);
    System.out.println(m.toString());

    System.out.println("---------------------------");

    MovieVo[] marr = new MovieVo[3];

    marr[0] = new MovieVo("비트1", 12000, "연기자1", 12, 1.3f);
    marr[1] = new MovieVo("비트3", 13000, "연기자2", 11, 1.3f);
    marr[2] = new MovieVo("비트2", 11000, "연기자3", 13, 1.3f);

    System.out.println(marr[0].toString());
    System.out.println(marr[1]);
    System.out.println(marr[2]);

    System.out.println("---------------------------");

    for (int i = 0; i < marr.length; i++) {
      System.out.println(marr[i]);
    }
  }

}
