package Game;

import Pieces.Weapons;

/**
 * This will tie everything together for the game to be played.
 * Will roll the dice, allow users to take turns etc.
 */
public class GameController {
    //Variables to hold everything used
    private BoardLayout map = new BoardLayout(); 
    private GUI GUI;
    private Weapons weps;
    private PlayerList playerList;
    private PlayerList NPCs;
    private int noOfPlayers;
   
    /**
     * Constructor method to make the controller
     * @param pList list of players
     * @param NPCList list of NPCs using playerlist class
     * @param weps list of weapons
     * @param GUI GUI used
     */
    public GameController(PlayerList pList, PlayerList NPCList, Weapons weps, GUI GUI){
        this.playerList = pList;
        this.NPCs = NPCList;
        this.weps = weps;
        this.GUI = GUI;
    }

    /**
     * Not finished but will roll the dice and allow players to move 
     * Needs to check the boardlayout to see if a player can step to a certain tile.
     */
    public void takeTurn() {
        
    }
}
