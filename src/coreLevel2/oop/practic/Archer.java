package coreLevel2.oop.practic;

public class Archer extends Hero{
    public Archer(String name, int damage) {
        super(name, damage);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стреляет" + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
