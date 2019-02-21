package enemies;

import interfaces.ICharacter;

public abstract class Enemy implements ICharacter {

    String name;
    int health;

    public Enemy(String name, int health){
        this.name = name;
        this.health = health;
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

    public void isAttacked(int damage){
        this.health -= damage;
    }

}
