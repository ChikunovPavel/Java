package coreLevel1;

public class Array {
    public static void main(String[] args) {
        int [] value = new int[10];
//        System.out.println(value[1]);
        value[4] = 9;
        value[6] = 12;
        for (int i = 0; i < value.length; i++) {
            System.out.println(i + ":" + value[i]);

        }

    }

    private static void test() {
        int[] array = {1, 2, 3, 4, 56};
        System.out.println(array[2]);

        array[2] = 18;
        System.out.println(array[2]);
    }


}
