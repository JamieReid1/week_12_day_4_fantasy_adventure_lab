package itemTypes;

public class Weapon {

    private String type;
    private int damage;
    private int durability;

    public Weapon(String type, int damage, int durability) {
        this.type = type;
        this.damage = damage;
        this.durability = durability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

}
