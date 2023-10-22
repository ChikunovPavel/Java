package coreLevel2.oop.composition;

public class Main {
    public static void main(String[] args) {
        Ram ram = new Ram(16);
        Ssd ssd = new Ssd(1000);
//        Computer computer =new Computer(ssd, ram);
//        computer.load();
        double sin = Math.sin(2.5);


//        Laptop laptop = new Laptop(new Ssd(250), new Ram(512),2);
        Laptop laptop = new Laptop(new Ssd(512),new Ram(16),2);
        laptop.open();
        laptop.load();

//        Class<? extends Laptop> aClass = laptop.getClass();
        System.out.println(laptop);
    }
}
