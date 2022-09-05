package part2;

import kr.tpc.DBConnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {

  public static void main(String[] args) {
    // Oracle, MySQL -> Driver class
    DBConnect conn = new JavaOracle();
    conn.getConnection("url", "user", "12345");

    conn = new JavaMySQL();
    conn.getConnection("url", "user2", "12345");
  }
}
