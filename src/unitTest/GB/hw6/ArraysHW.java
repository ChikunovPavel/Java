package unitTest.GB.hw6;

import java.util.Scanner;

public class ArraysHW {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] array = new int[]{12,231,34,823,7,33,45,32,426,6};
        int[] array2 = new int[]{12,231,34,824,7,33,45,32,426,6};


        int average = value(array);
        int average2 = value(array2);


        System.out.println(average);
        System.out.println(average2);


        compare(average, average2);


    }

    public static int  value(int[] array){
        int sum = 0 ;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length ;
    }


    public static String compare(int average,int average2){
        String result = " ";
        if(average == average2){
             System.out.println( result = "Средние значения равны");
        }else if (average < average2) {
            System.out.println( result = "Второй список имеет большее среднее значение");
        } else {
            System.out.println( result = "Первый список имеет большее среднее значение");
        }
        return result;
    }








}
