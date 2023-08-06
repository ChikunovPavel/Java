package java_oop.create_object;

public class Computer {
//свойства объекта - характеристика (поля или аргументы)
    private String name;
    private int ram;
    private int hdd;
    private double weight;
    //констурктор
    public Computer(){
       on(); // метод который будет автоматический загужаться при создании обоъекта
    };

//    public Computer(String name,int ram,int hdd,double weight){
//        this.name = name;
//        this.ram = ram;
//        this.hdd = hdd;
//        this.weight = weight;
//    }



    //getter and setter
    public String getName(){
        return name;
    }
    public int getRam(){
        return ram;
    }
    public int getHdd(){
        return hdd;
    }

    public void setName(String newName){
        name = newName;
    }
    public void setRam(int newRam){
        if(newRam > 0) {
            ram = newRam;
        }else{
            System.out.println("Значение "+newRam+" не может быть отрицательное");
        }
    }
    public void setHdd(int newHdd){
        if(newHdd > 0) {
            ram = newHdd;
        }else{
            System.out.println("Значение "+newHdd+" не может быть отрицательное");
        }
    }



//    поведение объекта (действия)
    public void on(){
        print("i am on  моя модель: " + name);
    }
    public void off(){
        print("i am off");

    }
    public void load(){
        print("i am load. обьем оперативки " + ram + " GB");
    }

    public void reboot(){
        print("This is PC rebooting");
    }

    // икапсуляция System.out.printl()
    private void print(String str){
        System.out.println(str);
    }
}
