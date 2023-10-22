package coreLevel2.oop.practic;

public class Enemy implements Mortal {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        if(isAlive() && health <= damage){
            health = 0;
            System.out.println("Зомби погиб");
        }else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + " осталось " + health);
        }

    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
