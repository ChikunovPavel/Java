package coreLevel1.task_Array;

import coreLevel1.Array;

/**
 * 2. Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающую его.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);
        ShowArray(array);
        System.out.println();
        Task1.ShowArray(array);
    }

    private static void fillArray(int[] array) {
        int index = 0;
        for (int current = 1; index < array.length ; current++) {
            if(current % 13 ==0 || current % 17 == 0 ){
                array[index] = current;
                index++;
            }

        }
    }

    public static void ShowArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");

        }
    }

}
