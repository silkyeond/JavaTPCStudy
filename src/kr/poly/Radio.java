package kr.poly;

public class Radio implements RemoCon {

  @Override
  public void chUp() {
    System.out.println("Redio 채널이 올라간다");
  }

  @Override
  public void chDown() {
    System.out.println("Redio 채널이 내려간다");
  }

  @Override
  public void internet() {
    System.out.println("Redio는 인터넷이 지원되지 않는다");
  }
}
