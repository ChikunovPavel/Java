package coreLevel2.oop.composition;

public class  Laptop extends Computer{

    private int weight;
// блоки инициализации
//    {
//        System.out.println("init block laptop");
//    }
//
//    static {
//        System.out.println("static block laptop");
//    }
    public Laptop(Ssd ssd, Ram ram,int weight) {
        super(ssd, ram);
        this.weight = weight;


    }

//    public Laptop(){
//        System.out.println("laptop comp");
//    }


    @Override
    public void print() {
        super.print();
        System.out.println("!!!");
    }

    public void open(){
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void load() {
        System.out.println("load");
    }
}
