package Task_2;

public class Cat {
    public String name;

    public Cat(String n) {
        this.name = n;
    }



    // котик откликается
    public void AnswerCat() {
        System.out.println("Мяу-мяу...");
    }

    // котик кушает
    public void CatEats() {
        System.out.println("Ням-Ням...");
    }

    // котик нежится
     public  void CatExit(){
         System.out.println("Мур-мур...");
     }

}