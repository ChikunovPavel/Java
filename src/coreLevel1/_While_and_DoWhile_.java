package coreLevel1;


public class _While_and_DoWhile_ {
    public static void main(String[] args) {
        int value = 0;
//        Whiled(value);
        do {
            System.out.println(value);
            value++;
        }while(value < 10);

    }

    private static void Whiled(int value) {
        while (value > 0){
            System.out.println(value);
            value --;
        }
    }


}



