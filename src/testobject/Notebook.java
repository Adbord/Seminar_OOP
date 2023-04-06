package testobject;

import myfirstprogram.Computer;
public class Notebook extends Computer{
    public Notebook() {
        super();
    }

    public  Notebook(String name) {
   //     super(name);
    }

    public Notebook(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight);
    }
    @Override
    public void on(){
        super.on();
        print("Notebook: я включился. Моя модель: "+getName());
    }
      @Override
    public void load() {

      }
}
