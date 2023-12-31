package coreLevel2.oop.practic;

public abstract class Hero {

    private String name;
    private int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    public abstract  void attackEnemy(Enemy enemy);

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

}
