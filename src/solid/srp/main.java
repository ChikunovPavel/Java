package solid.srp;

public class main {
    public static void main(String[] args) {
        Book book = new Book("Властелин Колец", "Толкин");
        Print print = new Print();
        Save save = new Save();
        save.save(book);
        print.print(book);
    }
}
