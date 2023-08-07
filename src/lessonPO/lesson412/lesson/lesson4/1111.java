//package LessonPO.lesson412.lesson.lesson4;
//
//// Класс "Calculator"
// class Calculator {
//    public double add(double a, double b) {
//        return a + b;
//    }
//
//    public double subtract(double a, double b) {
//        return a - b;
//    }
//
//    public double multiply(double a, double b) {
//        return a * b;
//    }
//
//    public double divide(double a, double b) {
//        if (b != 0) {
//            return a / b;
//        } else {
//            throw new ArithmeticException("Cannot divide by zero.");
//        }
//    }
//}
//
//// Класс "UserInterface"
// class UserInterface {
//    private Calculator calculator;
//
//    public UserInterface() {
//        calculator = new Calculator();
//    }
//
//    public void start() {
//        double num1 = getUserInput("Enter the first number: ");
//        double num2 = getUserInput("Enter the second number: ");
//        char operator = getOperator();
//
//        double result = performOperation(num1, num2, operator);
//
//        displayResult(result);
//    }
//
//    private double getUserInput(String message) {
//// Здесь можно реализовать логику для получения числового ввода от пользователя
//    }
//
//    private char getOperator() {
//// Здесь можно реализовать логику для получения оператора от пользователя
//    }
//
//    private double performOperation(double num1, double num2, char operator) {
//// Здесь вызываются методы калькулятора для выполнения операций
//    }
//
//    private void displayResult(double result) {
//// Здесь можно реализовать логику для отображения результата пользователю
//    }
//}
//
//// Класс "Main"
//// class Main {
////    public static void main(String[] args) {
////        UserInterface userInterface = new UserInterface();
////        userInterface.start();
////    }
//}