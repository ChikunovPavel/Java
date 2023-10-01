package coreLevel1.task_Array;

/**
 * 1. Написать программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1,3,45,6,7,23,45,6,2,6};
        ShowArray(array);
        ShowAnd(array);
        reverse(array);
    }

    public static void reverse(int[] array){
        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    public static void ShowArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }public static void ShowAnd(int[] array){

        for (int i : array) {
            System.out.print(i + " ");

        }
        System.out.println();
    }


}


