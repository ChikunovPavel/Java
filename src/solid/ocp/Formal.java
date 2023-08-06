package solid.ocp;

public class Formal implements  Greet {
    @Override
    public void greet() {
        System.out.println("Добро пожаловать, уважаемый гость!");
    }
}
