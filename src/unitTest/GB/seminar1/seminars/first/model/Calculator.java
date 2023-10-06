package unitTest.GB.seminar1.seminars.first.model;

import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstiOperand = getOperand();
        int secondOpreand = getOperand();
        char operator = getOperation();
        int result = calculation(firstiOperand,secondOpreand,operator);
        System.out.println("Результат выполнение операции" + result);
    }
    public static char getOperation(){
        System.out.println("Введите операцию");
        char operation = scanner.next().charAt(0);
        return operation;
    }
    public static int getOperand(){
        System.out.println("Введите операнд");
        int operand = scanner.nextInt();
        return operand;
    }



    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+' -> result = firstOperand + secondOperand;
            case '-' -> result = firstOperand - secondOperand;
            case '*' -> result = firstOperand * secondOperand;
            case '/' -> {
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            }
            default -> throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double number) {
        if (number == 0) {
            throw new ArithmeticException("It is not possible to extract the root from 0");
        }
        if (number < 0) {
            throw new ArithmeticException("It is impossible to extract the root from negative numbers");
        }

        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        }
        while ((t - squareRoot) != 0);
        return squareRoot;

        // или просто return Math.sqrt(number);
    }


    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки
     * @return возвращает сумму покупки с учетом скидки
     */

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
//        недопустимых аргументов здесь можно расписывать очень много, думаю для начала хватить
        if (purchaseAmount == 0)  {
            throw new ArithmeticException("It is not possible to extract the root from 0");
        }
        if ((purchaseAmount < 0) || (discountAmount < 0)) {
            throw new ArithmeticException("It is impossible to extract the root from negative numbers");
        }


        return purchaseAmount - (double)discountAmount;
    }


}