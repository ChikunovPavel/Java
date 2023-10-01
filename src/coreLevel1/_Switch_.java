package coreLevel1;

public class _Switch_ {
    public static void main(String[] args) {
//        byte,short,int,char,String,enum

        int value =2;
        int chr  = switch (value) {
            case 1 -> '1';
            case 2,3,4 -> '2';
            default -> '0';
        };

//        измен
        switch (value) {
            case 1 -> System.out.println("value == 1");
            case 2, 3, 4 -> System.out.println("value == 2,3,4");
            case 28 -> System.out.println("value == 28");
            case 10 -> System.out.println("value == 10");
            default -> System.out.println("not this value");
        }


        switch (value){
            case 1:
            System.out.println("value == 1");
            break;
            case 2:
            case 3:
            case 4:
            System.out.println("value == 2,3,4");
            break;
            case 28:
            System.out.println("value == 28");
            break;
            case 10:
            System.out.println("value == 10");
            break;
            default:
                System.out.println("not this value");

        }
    }
}
