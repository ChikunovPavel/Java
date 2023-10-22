package coreLevel2.oop.composition;

import java.util.Random;

public interface Printable {

    String SOME_VALUE ="Example";
    Random RANDOM = new Random();

    default void printWithRandom(){
        Random random = new Random();
        System.out.println(random.nextInt());
        print();
    }

    void print();

    private int generateRandome(){
        return RANDOM.nextInt();
    }

}
