package coreLevel1.task_Array;

/**
 * 4. Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */

public class Task4 {
    public static void main(String[] args) {
        //             0 1 2 3 4 5 6 7
        int[] array = {3,6,9,8,4,6,1,4};
        System.out.println("min " + min(array));
        System.out.println("max " + max(array));
        System.out.println("sum " + sum(array));

    }
    public static int min(int[] array){
        int min = array[0];
        int minindex = 0;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
                minindex = i;
            }
        }
        return minindex;
    }
    public static int max(int[] array){
        int max = array[0];
        int maxindex = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
                maxindex = i;
            }
        }
        return maxindex;
    }

    public static int sum(int[] array) {
        int min = min(array);
        int max = max(array);
        if(min > max){
            int temp = min;
            min = max;
            max = temp;
        }
        int result = 0;
        for (int i = min +1;  i < max ; i++) {
            result+= array[i];
        }
        return result;
    }
    }





