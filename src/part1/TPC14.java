package part1;

import kr.tpc.MemberVo;

public class TPC14 {

  public static void main(String[] args) {
    MemberVo m = new MemberVo();

    m.setName("홍길동");
    m.setAge(50);
    m.setTel("010-1111-1111");
    m.setAddr("서울");

    System.out.println(m.getName());
    System.out.println(m.getAge());
    System.out.println(m.getTel());
    System.out.println(m.getAddr());

    /*
    m.name = "홍길동";
    m.age = 50;
    m.tel = "010-1111-1111";
    m.addr = "서울";

    System.out.println(m.name);
    System.out.println(m.age);
    System.out.println(m.tel);
    System.out.println(m.addr);
    */
  }

}
