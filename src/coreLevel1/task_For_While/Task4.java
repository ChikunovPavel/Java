package coreLevel1.task_For_While;
/**
 * 4. Написать программу, определяющую, является ли введённое
 *    целое число простым, т.е. делится без остатка только на 1 и само
 *    на себя.
 */
public class Task4 {
    public static void main(String[] args) {
        int num = 3;
       boolean result = isSimple(num);
        System.out.println(result);
    }
    public static boolean isSimple(int num){
        boolean result = true;
            for (int i = 2; i < num; i++) {
                if(num % i == 0){
                    return false;
            }
        }

        return result;
    }
}



