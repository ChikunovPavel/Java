package coreLevel1.task_For_While;
/**
 * 3. В 1626 году индейцы продали Манхэттен за 24$.
 * Написать программу, которая высчитывает сумму,
 * получившуюся в текущем году, если бы индейцы положили эти
 * деньги в банк под 5% годовых.
 */

public class Task3 {
    public static void main(String[] args) {
        int year = 1626;
        int num = 24;
        double persent = 5;
        sum(year,num);

    }
    public static double sum(int year,double sourceSum){
        double result = sourceSum;
        for ( year = year + 1; year <=  2020 ; year++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println(year + ":" + result);


        }
        return  result;
    }

}
