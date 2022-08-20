package Game;
import Cards.Card;
import java.util.ArrayList;

/**
 * Used for starting/setting up the game
 * Gets number of players
 * Assigns players to characterpieces based on pick
 */
public class StartGame {
    private GUI GUI;
    private ArrayList<Card> cards= new ArrayList<>();
    
    /**
     * Constructor
     * @param GUI this is the Graphical user interface
     */
    public StartGame(GUI GUI){
        this.GUI = GUI;
    }
    
    /**
     * Checks if input is a number
     * @param str this is a string
     * @return true or false
     */
    public static boolean isNum(String str) {
        if (str.equals("")) {
            return false;}
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;}
        return true;
    }
    
    /**
     * Checks size of the players playing
     * @return number of players
     */
    public int size() {
        String size; //Holds the size of the players
        GUI.displayString("Enter the number of players");
        //Ensures choice is within the [min, max] range
        do {
            //Checks if size contains numbers only
            do {
                size = GUI.getPlayerCount();
                GUI.displayString(size);
                if (!isNum(size)) { //Error message
                    GUI.displayString("\'" + size + "\'" + " is not an integer.....");}
            } while (!isNum(size));

            if (Integer.parseInt(size) < 2 || Integer.parseInt(size) > 6) { //Error message
                GUI.displayString("Enter a valid integer between [2 - 6].....");
            }
        } while (Integer.parseInt(size) < 2 || Integer.parseInt(size) > 6);

        return Integer.parseInt(size);
    }

    void addPlayers(PlayerList listPlayers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
