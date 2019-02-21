public abstract class Fighter extends Player {

    private Weapon weapon;

    public Fighter(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon= weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
