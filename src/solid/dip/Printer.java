package solid.dip;

public class Printer implements Print {
    @Override
    public void print(String text) {
        System.out.println(text);
    }

}
