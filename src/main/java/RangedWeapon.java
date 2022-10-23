public class RangedWeapon extends Weapon{
    private int stock;

    public RangedWeapon(String type, int damage, int stock){
        super(type,damage);
        this.stock=stock;
    }
}
