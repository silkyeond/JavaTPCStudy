package kr.tpc;

public class MemberVo {

  private String name;

  private int age;

  private String tel;
  private String addr;
  public MemberVo() {
  }

  public MemberVo(String name, int age, String tel, String addr) {
    this.name = name;
    this.age = age;
    this.tel = tel;
    this.addr = addr;
  }

  // setter, getter method

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  @Override
  public String toString() {
    return "MemberVo [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
  }

}
