package coreLevel1.task_If_else_switch;
/**
 * 2. Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.
 */




public class Task2 {
    public static void main(String[] args) {
//        912312
        int value =912313;
        boolean test = value % 10 == 3;
        if(test){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
