public class Weapon extends Item {
    private int damage;
    // private int durability? evt. lav det sådan at det mister durability med en andel af den skade player modtager.
    public Weapon(String type, int damage){
        super(type);
        this.damage = damage;
    }
    //GETTERS
 /*   public String getWeaponName() { LADER TIL AT VÆRE OVERFLØDIG --- BRUG GETTER FRA ITEMKLASSEN
        return type;
    }*/

    public int getWeaponDamage(){
        return damage;
    }

}




