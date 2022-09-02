import kr.tpc.MyUtil;

public class TPC18 {

  public static void main(String[] args) {
    // 1. Java에서 제공해주는 class들 (API, library)
    // 문자열(String)
    String str = new String("APPLE");
    System.out.println(str.toLowerCase());

    // 2. 직접 만들어서 사용하는 class들 (DTO/VO, DAO, Utilty, .. API)
    MyUtil my = new MyUtil();
    int sum = my.hap();
    System.out.println(sum);

    // 3. 다른 회사에서 만들어 놓은 class들 API
    // Gson -> json jar 파일 다운 후 실습
    /*
    Gson g = new Gson();
    BookVo vo = new BookVo("자바", 13000, "영진", 800);
    String json = g.toJson(vo);
    // {"title":"자바", "price":13000, "company":"영진", "page":800}
    System.out.println(json);
    */

  }
}
