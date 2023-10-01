package coreLevel1.task_For_While;

/**
 * 5. Написать программу, которая проходит циклом по английскому
 *    алфавиту, начиная с буквы ‘b’, и выводит каждую букву до тех пор,
 *    пока не встретит гласную (т.е. вывести согласные на консоль).
 */

public class Task5 {
    public static void main(String[] args) {
        alphabet();
        char value = 'd';
        System.out.println((int) value);

    }
    public static void alphabet(){
        for (char i = 'b'; !isVowel(i)  ; i++) {
            System.out.println(i);
        }
    }
    public static boolean isVowel(char value){
        return value == 'a' || value == 'e' || value == 'y' || value == 'u' || value == 'i' || value == '0';
    }
}
