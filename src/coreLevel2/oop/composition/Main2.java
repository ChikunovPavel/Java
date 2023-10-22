package coreLevel2.oop.composition;

public class Main2 {
    public static void main(String[] args) {
//        new Laptop();
        double value = 2.4;
        int intvalue = (int )value;

        Computer laptop = new Laptop(new Ssd(512),new Ram(16),2);
//        laptop.load();
        System.out.println();
        Computer mobile = new Mobile(new Ssd(126),new Ram(8));
//        mobile.load();
        Laptop laptop1 = new Laptop(new Ssd(1000), new Ram(32), 4);

//        loadComp(laptop,mobile);
        printInformation(new Computer[] {laptop,mobile,laptop1});
   }

   public static void printInformation(Computer[] computers){
       for (Computer computer : computers) {
           computer.print();
           if(computer instanceof Laptop){
//               ((Laptop) computer).open();
               Laptop laptop = (Laptop) computer;
               laptop.open();
           }
       }
   }

   public static void loadComp(Computer... computers){
        for (Computer computer: computers){
            computer.load();
        }
   }
}
