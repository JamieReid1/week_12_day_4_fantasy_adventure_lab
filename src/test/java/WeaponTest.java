import itemTypes.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Bow and Arrow", 23, 100000);
    }

    @Test
    public void hasType(){
        assertEquals("Bow and Arrow", weapon.getType());
    }

    @Test
    public void canSetType(){
        weapon.setType("Gun");
        assertEquals("Gun", weapon.getType());
    }

    @Test
    public void hasDamage(){
        assertEquals(23, weapon.getDamage());
    }

    @Test
    public void canSetDamage(){
        weapon.setDamage(20);
        assertEquals(20, weapon.getDamage());
    }

    @Test
    public void hasDurability(){
        assertEquals(100000, weapon.getDurability());
    }

    @Test
    public void canSetDurability(){
        weapon.setDurability(20);
        assertEquals(20, weapon.getDurability());
    }



}
