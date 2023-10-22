package coreLevel2.oop.composition;

public class Runner {
    public static void main(String[] args) {

        Printable laptop = new Laptop(new Ssd(512),new Ram(16),2);
        Printable mobile = new Mobile(new Ssd(126),new Ram(8));

        printWithRandom(laptop,mobile);

    }

    public static void print(Printable... object){
        for (Printable printable : object) {
            printable.print();
            System.out.println("");

        }
    }
    public static void printWithRandom(Printable... object){
        for (Printable printable : object) {
            printable.printWithRandom();
            System.out.println("");

        }
    }


}
