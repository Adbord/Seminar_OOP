package Task_2;



public class Program {
    public static void main(String[] args) {

        Human man = new Human("Bob", "husband");
        Human woman = new Human("Helly", "wife");
        Televisor samsung = new Televisor("SmartTV");
        Cat cat = new Cat("Tom");

        man.QueryHuman();
        if (woman.AnswerHuman()) {
            samsung.StartTV();
            samsung.SwitchingСhannels();
            samsung.StopTV();
        } else {
            man.SleepHuman();
        }

        man.CallCat();
        cat.AnswerCat();
        woman.FeedCat();
        cat.CatEats();
        //cat.Exit.Cat();


    }

}