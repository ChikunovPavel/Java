package java_oop.create_object;

public class Notebook extends Computer {
    public Notebook(){
        System.out.println("конструктор");
    }

    public void on(){
        super.on();
        print("Norebook: i am on  моя модель: " + getName());
    }

    @Override
    public void load() {

    }
}
