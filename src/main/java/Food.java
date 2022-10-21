public class Food extends Item {

    private int hp;



    public Food(String type, int hp) {
        super(type);
        this.hp=hp;
    }

    //GETTERS
    public int getFoodHp(){
        return hp;
    }

}


