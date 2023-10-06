package coreLevel2.Introduction.oop.composition;

public class Runer {
    public static void main(String[] args) {
        Ram ram = new Ram(1000);
        Ssd ssd = new Ssd(512);
        Computer computer = new Computer(ram,ssd);
        computer.printState();

    }
}
