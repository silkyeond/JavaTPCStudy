package part2;

import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {

  public static void main(String[] args) {
    Animal ani = new Dog();
    // cat() ----- 재정의(override) ------> eat()
//    Animal a = new Animal();
//    a.eat();
//    upcasting(부모의 역할로 사용 -> 명령을 내리는쪽)
    ani.eat(); // eat{?} -> eat{개}(다형성 보장 x)
    ani.move();

    ani = new Cat();
    ani.eat(); // eat{?} -> eat{고}
    ani.move();
    ((Cat) ani).night();
  }
}
