package coreLevel1.task_For_While;
/**
 * Написать программу, вычисляющую факториал введённого
 * пользователем целого числа.
 */

public class task1 {
    public static void main(String[] args) {
        int value = 5;

        int sum = factorial(value);
        int sum1 = factor(value);
        System.out.println(sum);
        System.out.println(sum1);
    }

    public static int factor(int num){
        int result = 1;
        int i = 1;
        while(i <= num){
            result*=i;
            i++;
        }
        return result;
    }

    private static int factorial(int num) {
        int result =1;
        for (int i = 1; i <= num ; i++) {
            result *= i;
        }
         return result;
    }
}
