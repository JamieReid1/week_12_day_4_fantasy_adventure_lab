import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian conan;
    Weapon sword;

    @Before
    public void before(){
        sword = new Weapon("Excalibur");
        conan = new Barbarian("Conan Doyle", sword);
    }

    @Test
    public void hasName(){
        assertEquals("Conan Doyle", conan.getName());
    }

    @Test
    public void canSetName(){
        conan.setName("Cuthbert");
        assertEquals("Cuthbert", conan.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, conan.getHealth());
    }

    @Test
    public void canSetHealth(){
        conan.setHealth(45);
        assertEquals(45, conan.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(sword, conan.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        Weapon spoon = new Weapon("Timothy");
        conan.setWeapon(spoon);
        assertEquals(spoon, conan.getWeapon());
    }


}
