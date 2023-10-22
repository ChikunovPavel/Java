package coreLevel2.oop.composition;

public class Mobile extends Computer{

    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println(" я телефон и работаю ");
    }

}
