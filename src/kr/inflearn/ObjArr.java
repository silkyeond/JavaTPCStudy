package kr.inflearn;

public class ObjArr {

  private int count;
  private Object[] arr;

  public ObjArr() {
    this(10);
  }

  public ObjArr(int init) {
    arr = new Object[init];
  }

  public void add(Object data) {
    arr[count++] = data;
  }

  public Object get(int index) {
    return arr[index];
  }

  public int size() {
    return count;
  }
}
