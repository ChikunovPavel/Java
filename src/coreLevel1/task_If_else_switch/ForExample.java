package coreLevel1.task_If_else_switch;

public class ForExample {
    public static void main(String[] args) {
        for (int value = 10; value > 0 ; value--) {
            if(value ==5){
                continue;
//                break;
            }
            System.out.println(value);

        }


//       инициализация; условие; действие с переменной
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println(i);
//
//        }
    }

    private static void fori() {
        int value = 10;
        for (; ; ){
            System.out.print(value);
        }
    }
}
