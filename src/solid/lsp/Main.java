package solid.lsp;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,10);
        Square square = new Square(10);

        System.out.println(rect.getArea());
        System.out.println(square.getArea());
    }
}
