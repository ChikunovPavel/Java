package solid.dip;

public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Hello, world!");
        File file = new File("Hello Teacher");
        Printer myPrinter = new Printer();

        myPrinter.print(myText.getText());
        myPrinter.print(file.getText());
    }
}
