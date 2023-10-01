package coreLevel1;


/**
* Написать программу, вычисляющую факториал введённого
* пользователем целого числа.
*/

public class Recursion {
    public static void main(String[] args) {
        int factorial = Factorial(6);
        System.out.println(factorial);

    }
    public static int Factorial(int value){
        if(value == 1){
            return 1;
        }
        return value * Factorial(value -1);
    }
}
