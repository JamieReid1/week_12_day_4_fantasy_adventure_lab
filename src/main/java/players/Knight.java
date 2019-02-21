package players;


import characterTypes.Fighter;
import interfaces.ICharacter;
import interfaces.IWeapon;
import itemTypes.Weapon;

public class Knight extends Fighter {

    public Knight(String name, Weapon weapon) {
        super(name, weapon);
    }

}
