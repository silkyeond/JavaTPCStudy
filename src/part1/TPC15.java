package part1;

import kr.tpc.MemberVo;

public class TPC15 {

  public static void main(String[] args) {
    MemberVo m = new MemberVo("홍길동", 40, "010-1111-1111", "서울");
    // setter method - X

    System.out.println(m.toString());
    MemberVo m1 = new MemberVo();
    m1.setName("나길동");
    m1.setAge(24);
    m1.setAddr("광주");
    m1.setTel("010-2222-2222");

    System.out.println(m1);
  }
}
