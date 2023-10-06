package coreLevel2.Introduction.oop.lesson1;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.printState();
//
//
        Computer computer1 = new Computer(400);
        computer1.printState();


        Computer computer2 = new Computer(2000,32);
//        computer2.printState();
//        computer2.load(true);

        computer2.purn();


    }


}
