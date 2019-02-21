package characterTypes;

import interfaces.ICharacter;
import interfaces.IWeapon;
import itemTypes.Weapon;
import players.Player;

public abstract class Fighter extends Player implements IWeapon {

    private Weapon weapon;

    public Fighter(String name, Weapon weapon) {
        super(name);
        this.weapon= weapon;
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
