package solid.isp;

public class Main {
    public static void main(String[] args) {
        RobotWorker robot = new RobotWorker();
        HumanWorker human = new HumanWorker();

        robot.work();

        human.work();
        human.eat();


    }
}
