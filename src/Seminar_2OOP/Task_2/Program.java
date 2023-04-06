package Seminar_2OOP.Task_2;

public class Program {
    public static void main(String[] args) {

        Human man = new Human("Bob", "husband");
        Human woman = new Human("Nelly", "wife");
        Cat cat = new Cat("Cat", "Tom");
        Dog dog = new Dog("Dog", "Bim");

        man.CallCat();
        cat.AnswerAnimals();
        woman.CallDog();
        dog.AnswerAnimals();
        woman.FeedAnimals();
        dog.animalsEats(dog);
        cat.animalsEats(dog);


    }

}