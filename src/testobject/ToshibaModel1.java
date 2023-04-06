package testobject;

public class ToshibaModel1 extends Toshiba implements Planshet, Phone {

    @Override
    public void openCD() {
        System.out.println("ToshibaModel1 overrided openCD");
    }

    @Override
    public void closeCD() {
        super.printMyModel();
        System.out.println("ToshibaModel1 overrided closeCD");
    }

    @Override
    public void navigateByScreen() {
        System.out.println("Navigate by screen");
    }

    @Override
    public void call() {
        System.out.println("call");
    }
}
