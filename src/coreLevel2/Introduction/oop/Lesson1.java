package coreLevel2.Introduction.oop;

public class Lesson1 {
    public static void main(String[] args) {
     int value = 10;
     int [] values = {value,2,4,5,6};
     printArray(values);
    }

    private static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);

        }
    }
}
