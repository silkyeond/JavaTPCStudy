package part2;

import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {

  public static void main(String[] args) {
    // Dog, Cat --> animal
    Dog d = new Dog();
    d.eat();

    Cat c = new Cat();
    c.eat();

    // Dog.java(X), Dog.class(O)

    // Animal <--- Dog.calss, Cat.class

    /*
    Animal animal = new Dog();
    animal.eat();

    animal = new Cat();
    animal.eat();
    */
  }

}
