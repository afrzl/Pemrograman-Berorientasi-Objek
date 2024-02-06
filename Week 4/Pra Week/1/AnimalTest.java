/**
 * AnimalTest
 */
public class AnimalTest {

  public static void main(String[] args) {
    Animal[] animals = new Animal[3];
    animals[0] = new Cat("kucingku");
    animals[1] = new Dog("anjingku");
    animals[2] = new BigDog("anjing besarku");

    for (Animal animal : animals) {
      animal.greets();
    }

    Dog dog = new Dog("anjing tetanggaku");
    dog.greets(dog);

    BigDog bigDog = new BigDog("anjing besar tetanggaku");
    bigDog.greets(bigDog);
    bigDog.greets(dog);
  }
}
