public class RangedWeapon extends Weapon {
    private int stock;

    public RangedWeapon(String type, int damage, int stock) {
        super(type, damage);
        this.stock = stock;
    }

    @Override
    public int attack() {
        if (stock > 0) {
            stock--;
            return damage;
        } else {
            System.out.println("You cannot shoot thin air with thin air");
            return -1;
        }
    }
}
