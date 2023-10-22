package coreLevel2.oop.practic;

public class Warrior extends Hero{


    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " бьет" + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
