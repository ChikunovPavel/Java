package coreLevel2.staticRuner;

import coreLevel2.Introduction.oop.lesson1.Computer;

public class StaticRun {
    public static void main(String[] args) {

        new Computer(1,1);
        new Computer(1,1);
        new Computer(1,1);
        new Computer(1,1);
        Computer computer = new Computer(1,1);
        Computer computer2 = new Computer(1,1);
        System.out.println(Computer.getCounter());

        Class<? extends Computer> clazz = computer.getClass();
        Class<? extends Computer> clazz2 = computer2.getClass();
        System.out.println(clazz == clazz2);
        System.out.println(computer == computer2);

    }
}
