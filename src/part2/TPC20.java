package part2;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

  public static void main(String[] args) {

    Dog d = new Dog(); // 부모 = 자식, 자식 -> 부모 : 자동 형변환(Object Casting)
    d.eat(); // ? -> 개처럼 먹다

    // Animal 부모클래스를 사용하지 않음
    Cat c = new Cat();
    c.eat();
    c.night();

    // Dog.class, Cat.class
    Animal ani = new Dog(); // upcasting(자동형변환)
    ani.eat(); // ? -> 개처럼 먹다

    ani = new Cat();
    ani.eat(); // ? -> 고양이처럼 먹다

    // ani.night();
    ((Cat) ani).night(); // 밤에 눈에서 빛이난다 -> downcasting(강제형변환)
  }
}
