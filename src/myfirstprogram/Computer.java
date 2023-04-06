package myfirstprogram;

public class Computer {

    public String name;

    public int ram;

    public int hdd;

    public double weight;

   public Computer(){
//       System.out.println("Computer: конструктор");

   }


   public Computer(String name, int ram, int hdd, double weight){
      this.name = name;
      this.ram = ram;
      this.hdd = hdd;
      this.weight = weight;
}



    public void on(){
        print("я включился. Моя модель: "+getName());
    }

    public void off() {
        print("я выключился ");
    }

    public void load() {
     print("я загружаюсь. Мой обьем жесткого диска равен : "+getHdd()+" Гб");
    }

    protected void print(String str) {

       System.out.println(str);
    }


    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getHdd(){
        return hdd;
    }

    public void setHdd(int newHdd){
        if (newHdd>0) {
            hdd = newHdd;
        }else {
            System.out.println("Переданное значение "+newHdd+" не может быть отрицательным");
        }
        ram = newHdd;
    }

}