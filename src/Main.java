import javax.crypto.SecretKey;

public class Main {
    public static void main(String[] args) {
        Weapon wepon= new Weapon();
        wepon.setWeaponName("UltraSonic");
        wepon.setWeaponType(weaponType.COLD);
        Boss gameBoss = new Boss();
        gameBoss.setHealth(500);
        gameBoss.setDamage(150);
        gameBoss.setWeapon(wepon);
        System.out.println(gameBoss.printInfo());

        Skeleton rayushka = new Skeleton();
        rayushka.setHealth(300);
        rayushka.setDamage(70);
        rayushka.setWeapon(wepon);
        wepon.setWeaponName("UltraSuperSonic");
        wepon.setWeaponType(weaponType.LASER);
        rayushka.setAmountOfArrows(25);

        Skeleton rayashka = new Skeleton();
        rayashka.setHealth(250);
        rayashka.setDamage(75);
        rayashka.setWeapon(wepon);
        wepon.setWeaponName("UltraSuperSonic");
        wepon.setWeaponType(weaponType.LASER);
        rayashka.setAmountOfArrows(20);

        System.out.println("\nSKELETON INFO: " +rayashka.printInfo());
        System.out.println("\nSKELETON INFO: " +rayushka.printInfo());


    }
}