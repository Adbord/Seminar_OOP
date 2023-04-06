package Seminar_2OOP.Task_2;

public abstract class Animals {
    protected String typeAnimals;

    protected void SetTypeAnimals(String t) {
        this.typeAnimals = t;
    }

    // котик откликается
    public abstract void AnswerAnimals();

}