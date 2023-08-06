package patern.Iterator;

public class DeveloperRunner {
    public static void main(String[] args) {


        String[] skills = {"java_oop", "Spring", "Hibernate", "Gradle", "MySQL"};
        Developer javaDeveloper = new Developer("Петр  Петров", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
