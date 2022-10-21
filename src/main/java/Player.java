import java.util.ArrayList;

public class Player {
    private int hp;
    private Room currentRoom;

    public Player(int hp){
        this.hp = hp;
    }

    // inventory arraylist
    ArrayList<Item> itemsInventory = new ArrayList<>();

    public void pickUpItem(String type){
        Item itemToPickUp = currentRoom.takeItemRoom(type);
        if(itemToPickUp==null){
            System.out.println("That item does not exist!");
            return;
        }
        itemsInventory.add(itemToPickUp);
        System.out.println("You have picked up "+itemToPickUp.getType());
    }
    public void lookAtInventory(){
        System.out.println("This is what you have in your stash ");
        for(Item item: itemsInventory){
            System.out.println(item.getType()+" , ");
        }
    }

    public void lookAround(){
        System.out.print("You look around and this is what you see: "+currentRoom.getRoomDescription());
        System.out.print("There is a ");
        for(Item item: currentRoom.getWeapons()){
            System.out.print(item.getType()+" , ");
        }
        System.out.println("");
    }

    // getters
    public Room getCurrentRoom() {
        return currentRoom;
    }
    public int getHealth(){
        return hp;
    }

    // setters
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void movePlayer(String way) {
        Room nextRoom;
        switch (way) {
            case "north":
                nextRoom = currentRoom.getNorth();
                break;
            case "south":
                nextRoom = currentRoom.getSouth();
                break;
            case "east":
                nextRoom = currentRoom.getEast();
                break;
            case "west":
                nextRoom = currentRoom.getWest();
                break;
            default:
                System.out.println("You cannot move that way");
                return;
        }
        if (nextRoom == null) {
            System.out.println("You cannot move this way");
            return;
        }
        currentRoom = nextRoom;
        System.out.println("You are now in "+currentRoom.getRoomName());
    }
}
