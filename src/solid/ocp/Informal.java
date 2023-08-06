package solid.ocp;

public class Informal implements Greet {
    @Override
    public void greet() {
        System.out.println("Привет, друг!");
    }
}
