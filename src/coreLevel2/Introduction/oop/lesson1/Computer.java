package coreLevel2.Introduction.oop.lesson1;

public class Computer {
    private int ssd  = 512;
    private int ram ;

    private static int counter = 0;

    public Computer(){
        System.out.println("я был создан");
    }

    Computer(int newSsd){
        ssd = newSsd;
    }

    public Computer(int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;
        counter ++;

    }

    public static int getCounter(){
        return counter;
    }



    void load(boolean open){
        System.out.println("я загрузился");
        if(open ){
            System.out.println("я открыл крышку");
        }
    }
    void load(){
        System.out.println("я загрузился");
    }
    void printState(){
        System.out.println("new Pc");
        System.out.println("ssd: " + ssd);
        System.out.println("ram: " + ram);
    }

    void purn(){

    }







}
