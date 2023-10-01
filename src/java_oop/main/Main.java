package java_oop.main;

import java_oop.create_object.Computer;

public class Main {
    public static void main(String[] args) {


        Computer.print("hello");
        Computer comp = new Computer();
        comp.reboot(false);
        comp.writeCD();

//        Tohsiba tohsiba = new ToshibaModel1();
//        tohsiba.openCD();
//        tohsiba.closeCD();
//        tohsiba.printmyModel();
//        Computer note = new Notebook();
//        Notebook note2 = new Notebook();
//
//        if (note instanceof Notebook){
//            System.out.println("так и есть");
//        }
//
//        ((Computer) note2).on();
//        note2.charge();





//        comp.setName("IBM");
//        comp.setRam(-2049);
//        comp.setHdd(-1024);


//        comp.on();
//        comp.load();
//        comp.reboot();
//        comp.off();
    }
}
