package coreLevel1.task_If_else_switch;
/**
 * 1. Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
 */


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

public class Task1 {
    public static void main(String[] args) {
        int month = 4;
        if (month == 1 || month == 2 || month == 12 ){
            System.out.println("это зима");
        }else if (month >= 3 && month <= 5 ){
            System.out.println("это весна");
        }else if (month == 6 || month == 7 || month == 8 ){
            System.out.println("это лето");
        }else if (month == 9 || month == 10 || month == 11 ){
            System.out.println("это осень");
        }else{
            System.out.println("в году только 12 месяцев");
        }


////        task1
//        int month = 13;
//       switch (month){
//           case 1:
//           case 2:
//           case 12:
//               System.out.println("это зима");
//               break;
//           case 3:
//           case 4:
//           case 5:
//               System.out.println("это весна");
//               break;
//           case 6:
//           case 7:
//           case 8:
//               System.out.println("это лето");
//               break;
//           case 9:
//           case 10:
//           case 11:
//               System.out.println("это осень");
//               break;
//           default:
//               System.out.println("в году только 12 месяцев");
//
//       }
    }


}
