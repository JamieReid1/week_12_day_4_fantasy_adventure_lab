import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf gimily;
    Weapon axe;

    @Before
    public void before(){

        axe = new Weapon("Axe");
        gimily = new Dwarf("Gimily", axe);

    }

    @Test
    public void hasName(){
        assertEquals("Gimily", gimily.getName());
    }

    @Test
    public void canSetName(){
        gimily.setName("Papa Smurf");
        assertEquals("Papa Smurf", gimily.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, gimily.getHealth());
    }

    @Test
    public void canSetHealth(){
        gimily.setHealth(90);
        assertEquals(90, gimily.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(axe, gimily.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        Weapon hammer = new Weapon("Hammer");
        gimily.setWeapon(hammer);
        assertEquals(hammer, gimily.getWeapon());
    }

}
