package coreLevel1;

public class Array2 {
    public static void main(String[] args) {
        int [][] values = new int[3][];
        values[0] = new int[5];
        values[1] = new int[2];
        values[2]= new int[1];
        print(values);
    }


    private static void arrayss() {
        int[] array = {1,2,3,45,5,6,7,3};
        int[][] arrays = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        print(arrays);
    }

    private static void print(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int[] ints = arrays[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");

            }
            System.out.println();

        }
    }
}
