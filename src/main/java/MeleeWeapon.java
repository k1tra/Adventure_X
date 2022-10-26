public class MeleeWeapon extends Weapon {

  public MeleeWeapon(String type, int damage){
      super(type, damage);
  }

    @Override
    public int attack() {
      return damage;
    }


}
