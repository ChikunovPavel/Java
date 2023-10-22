package coreLevel2.oop.composition;

public abstract  class  Computer implements Printable {
    private Ssd ssd ;
    private Ram ram ;

//    {
//        System.out.println("init block computer");
//    }
//
//    static {
//        System.out.println("static block computer");
//    }

    public Computer(Ssd ssd,Ram ram) {
        super();
        this.ssd = ssd;
        this.ram = ram;
    }

//    public Computer(){
//        System.out.println("Constructor");
//    }



//    public void load(){
//        System.out.println("я загрузился");
//    }
    @Override
    public  void print(){
//        System.out.println("ssd" + ssd.getValue() + "ram" + getRam());
    }
public abstract void load();
    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
