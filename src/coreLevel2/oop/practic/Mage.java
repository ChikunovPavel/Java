package coreLevel2.oop.practic;

public class Mage extends Hero{
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " колдует" + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
