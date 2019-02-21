package enemies;

import interfaces.ICharacter;
import interfaces.IWeapon;
import itemTypes.Weapon;

public class Orc extends Enemy implements IWeapon {

    private Weapon weapon;

    public Orc(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(ICharacter character){
        int damage = this.weapon.getDamage();
        character.isAttacked(damage);
    }
}
