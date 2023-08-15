package java_oop.main;

public class ToshibaModel1 extends Tohsiba implements Tablet, Phone {
    @Override
    public void call() {
        System.out.println("Звонит");
    }

    @Override
    public void Screen() {
        System.out.println("Серфинг");
    }

    @Override
    public void openCD() {
        System.out.println("OpenCD ToshibaModel1 override ");

    }

    @Override
    public void closeCD() {
        System.out.println("CloseCD  ToshibaModel1 override ");
    }
}
