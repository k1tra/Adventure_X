public enum AttackCommand {
    NO_WEAPON_EQUIPPED("No weapon equipped"),
    NO_ENEMY("No enemy"),
    NO_ENEMY_NAME("No enemy name"),
    NO_AMMO("No ammo"),
    Succesful("You have attacked the enemy. The enemy attacks back");

    private String value;

    AttackCommand(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}