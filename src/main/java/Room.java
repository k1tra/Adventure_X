public class Room {
    private String name;
    private String description;

    private Room north;
    private Room south;
    private Room west;
    private Room east;

    public Room(String name, String description){
        this.name = name;
        this.description = description;
       // unnessecary to do this => this.north = this.west = this.south = this.east = null;
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
