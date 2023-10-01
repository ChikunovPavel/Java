package sorted;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        System.out.println("Imperarive");//task1
        int[] array = {2, 4, 5, 6, 7, 3, 2, 4, 1, 1, 9, 5, 3};
        bubble(array);

        System.out.println("Declarative");//task2
        Arrays.sort(array);
        for (int values : array){
            System.out.print(values + ", ");
        }

    }



    public static void bubble(int[] array){
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
    }
}
