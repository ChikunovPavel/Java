package coreLevel1.task_For_While;

/**
 * Имеется число посчитать сумму цифр данного числа
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 12345;
        int result = sum(value);
        int result2 = sumfor(value);
        System.out.println(result);
        System.out.println(result2);
    }
    public static int sum(int num){
        int result = 0;
        int current = num;
        while(current != 0){
            result+= current % 10;
            current /= 10;
        }
        return result;
    }
    public static int sumfor(int num){
        int result = 0;
        int curent = num;
        for (int i = num; num != 0 ; num/= 10) {
            result+= curent % 10;
            curent /= 10;

        }
        return result;
    }

}
