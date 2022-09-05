package part1;

public class TPC09 {

  public static void main(String[] args) {
    int a = 56;
    int b = 40;
    // a+b=?
    // int v = sum(a, b);
    TPC09 tcp = new TPC09();
    int v = tcp.sum(a, b);
    System.out.println(v);
  }

  public int sum(int a, int b) {
    int v = a + b;
    return v;
  }
}
