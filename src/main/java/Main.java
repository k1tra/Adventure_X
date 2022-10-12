public class Main {
    public static void main(String[] args){

        Adventure adventure = new Adventure();
        adventure.createMap();
        UserInterface ui = new UserInterface(adventure);
        ui.start();

    }
}
