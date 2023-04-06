package Seminar_2OOP.Task_2;

public class Human {
    public String name;
    public String status;

    public Human(String n, String s){
        this.name = n;
        this.status = s;
    }

    public void CallCat() {
        System.out.println("Кися-Кися...");
    }

    public void CallDog() {
        System.out.println("Голос...");
    }

    public void FeedAnimals() {
        System.out.println("Кушай животное...");
    }
}