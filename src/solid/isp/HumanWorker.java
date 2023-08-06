package solid.isp;

public class HumanWorker implements Worker,Eat {
    @Override
    public void work() {
        System.out.println("Человек работает");

    }

    @Override
    public void eat() {
        System.out.println("Человек ест");
    }
}
