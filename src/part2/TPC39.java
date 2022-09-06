package part2;

public class TPC39 {
  public static void main(String[] args) {

    int a = 1;
    Integer b = new Integer(1); // Boxing
    System.out.println(b.intValue()); // 1
    System.out.println(b.toString()); // "1"

    Object[] obj = new Object[3];
    // 1, 2, 3
    /*obj[0] = new Integer(1);
    obj[1] = new Integer(2);
    obj[2] = new Integer(3);*/

    obj[0] = 1;
    obj[1] = 2;
    obj[2] = 3;

    System.out.println(obj[0].toString());
    System.out.println(obj[1].toString());
    System.out.println(obj[2].toString());

    // "100" + "100" = 200
    String x = "100";
    String y = "100";
    //    System.out.println(x+y); // "100100"
    int v1 = Integer.parseInt(x);
    int v2 = Integer.parseInt(y);
    System.out.println(v1 + v2);

    // 100 + 100 = "100100"
    //    String s1 = Integer.toString(v1);  // toString() - 대상 값이 null이면 NPE발생, Object에 담긴 값이 String이 아니어도 출력
    //    String s2 = Integer.toString(v2);
    String s1 = String.valueOf(v1);  //String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어 반환
    String s2 = String.valueOf(v2);
    System.out.println(s1 + s2);
    // 따라서 NPE를 발생시기지 않으려면 String.valueOf()를 사용하는 것이 좋다
  }
}
