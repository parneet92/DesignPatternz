public abstract class Character {

    WeaponBehavior weapon;

    abstract void fight();

    void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weapon = weaponBehavior;
    }
}
