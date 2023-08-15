package java_oop.create_object;

public class CDrom {
    private String name;
    private double speed;
    private boolean cdWriteble;

    public void openCD(){
        System.out.println("Открыт CD");
    }public void writeCD(){
        System.out.println("Пишет CD");
    }public void closeCD(){
        System.out.println("Закрыт CD");
    }public void readCD(){
        System.out.println("Читает CD");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isCdWriteble() {
        return cdWriteble;
    }

    public void setCdWriteble(boolean cdWriteble) {
        this.cdWriteble = cdWriteble;
    }
}
