public class Boss extends GameEntity {

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return ("HEALTH: " + getHealth() + "\nDAMAGE: " + getDamage() +
                "\nWEAPON TYPE: " + weapon.getWeaponType() + "\nWEAPON NAME: " + weapon.getWeaponName());
    }
}
