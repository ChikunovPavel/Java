package coreLevel1.task_If_else_switch;

/**
 * 4. Написать программу, которая считывает год, введённый пользователем, и определяет,
 *    является ли этот год високосным.
 *    Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100,
 *    то этот год не високосный, за исключением годов, делящихся на 400.
 *    Например:
 *    1992 - високосный
 *    1900 - не високосный
 *    2000 – високосный
 */

public class Task4 {
    public static void main(String[] args) {

        int year = 1900;
        Year(year);


    }
    public static boolean Year(int year){
        return year % 400 == 0 || (year % 4 ==0 && year % 100 != 0);
//            return true;
//        }else {
//            return false;
//        }
    }

}
