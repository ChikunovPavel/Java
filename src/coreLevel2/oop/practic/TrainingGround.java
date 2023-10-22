package coreLevel2.oop.practic;

public class TrainingGround {
    public static void main(String[] args) {
        Hero archer = new Archer("Robin",20);
        Hero mage = new Mage("Merlin",11);
        Hero warrior = new Warrior("Achilles",30);
        Enemy enemy = new Enemy(" Зомби",100);
        attack(enemy,warrior,mage,archer);
    }

    public static void attack(Enemy enemy,Hero... hero){
        while (enemy.isAlive()){
            for (Hero hero1 : hero) {
                if(enemy.isAlive()) {
                    hero1.attackEnemy(enemy);
                }
            }
        }
    }
}
