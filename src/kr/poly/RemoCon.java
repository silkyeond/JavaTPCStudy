package kr.poly;

public interface RemoCon { // 객체생성 X ; RemoCon r = new RemoCon();

  // final static(상수) 사용 가능
  public int MAXCH = 100; // RemoCon.MAXCH
  public final static int MINCH = 1; // RemoCon.MINCH
  public void chUp();

  public void chDown();

  public void internet();

}
