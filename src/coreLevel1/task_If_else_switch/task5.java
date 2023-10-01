package coreLevel1.task_If_else_switch;

/**
 * 1. Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.
 */

public class task5 {
    public static void main(String[] args) {
        int num =22;
        int num2 = 11;
        int end = number(num,num2);
        System.out.println(end);

    }
    public static int number(int num,int num2){
     if(num > num2){
         return num;
     }
         return num2;

    }


}
