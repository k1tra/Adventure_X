import java.util.ArrayList;

public class Player {
    private int hp;
    private Room currentRoom;

    public Room getCurrentRoom() {
        return currentRoom;
    }

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
    }
}
