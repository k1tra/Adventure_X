import java.util.ArrayList;

public class Room {
    private String name;
    private String description;

    private Room north;
    private Room south;
    private Room west;
    private Room east;

    // der laves en tom liste af typen Item kaldet items
    private ArrayList<Item> itemsRoom = new ArrayList<>();

    public Room(String name, String description){
        this.name = name;
        this.description = description;
       // unnessecary to do this => this.north = this.west = this.south = this.east = null;
    }

    public void addItemRoom(Item newItem){
        itemsRoom.add(newItem);
    }
    // items kan fjernes
    public Item takeItemRoom(String itemName){
        for(Item itemRoom : itemsRoom) {
            if(itemRoom.getType().contains(itemName)){
                itemsRoom.remove(itemRoom);
                return itemRoom;
            }
        }
        return null;
    }


    // Getters
    public String getRoomName(){
        return name;
    }
    public String getRoomDescription(){
        return description;
    }
    public Room getNorth(){
        return north;
    }
    public Room getSouth(){
        return south;
    }
    public Room getWest(){
        return west;
    }
    public Room getEast(){
        return east;
    }
    // returnerer listen
    public ArrayList<Item> getWeapons(){
        return itemsRoom;
    }


    // Setters
    public void setNorth(Room north){
        this.north = north;
    }
    public void setSouth(Room south){
        this.south = south;
    }
    public void setWest(Room west){
        this.west = west;
    }
    public void setEast(Room east){
        this.east = east;
    }




}
