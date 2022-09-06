package kr.inflearn;

public class IntArr {
  private int count;
  private int[] arr;

  public IntArr(int init) {
    arr = new int[init];
  }

  public void add(int data) {
    arr[count++] = data;
  }

  public int get(int index) {
    return arr[index];
  }

  public int size() {
    return count;
  }
}
