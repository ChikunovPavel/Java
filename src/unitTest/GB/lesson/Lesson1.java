package unitTest.GB.lesson;



public class Lesson1 {
    public static void main(String[] args) {

        System.out.printf("Result operation: %s\n", Calculation(2,2,'+'));
        System.out.printf("Result operation: %s\n", Calculation(4,2,'-'));
        System.out.printf("Result operation: %s\n", Calculation(8,2,'/'));
        System.out.printf("Result operation: %s\n", Calculation(3,2,'*'));

    }
    public static int Calculation(int firstOperand,int secondOperand,char operator){
        int result = 0;

        switch (operator){
            case '+' -> result = firstOperand + secondOperand;
            case '-' -> result = firstOperand - secondOperand;
            case '*' -> result = firstOperand * secondOperand;
            case '/' -> result = firstOperand / secondOperand;
        }
        return result;
    }
}


