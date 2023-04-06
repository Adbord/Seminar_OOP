package testobject;

import myfirstprogram.Computer;

//import testobject.Notebook;
//import testobject.Computer;
public class MyFirstProgram {

    public static void main(String[] args) {
//       Computer notebook = new Notebook("IBM");
//       doSmth(notebook);
////       notebook.on();

        Toshiba toshiba = new ToshibaModel1();
        toshiba.openCD();
        toshiba.closeCD();


   }

   public static void doSmth(Computer comp) {
        comp.on();

   }
}
