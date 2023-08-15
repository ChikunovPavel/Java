package java_oop.main;

import java_oop.create_object.Computer;

public class Notebook extends Computer {
    public void charge(){
        System.out.println("заряжается");
    }

    public void on(){
        super.on();
        print("Notebook: i am on  моя модель: " + getName());
    }

    @Override
    public void load() {

    }
}
