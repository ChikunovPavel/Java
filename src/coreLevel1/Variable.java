package coreLevel1;

public class Variable {
    public static void main(String[] args) {
        double value = 5.3;
        int value2 = 3;
        double sum = value - (double)value2;//явное приведение типов
//        int sum = value % value2;
        boolean test = value != 0;
        boolean test2 = value2 > 0;

        System.out.println(sum);

//    int value = 5;
//    int value2 = 3;
//    int sum = value % value2;
//        System.out.println(sum);

//        int value = 5;
//        value += 25;
//        value++;//инкремент
//        value--;//декремент
//        System.out.println(value);

    }

}
