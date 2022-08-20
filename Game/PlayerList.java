package Game;
import Pieces.CharacterPieces;
import java.awt.Color;
import java.util.ArrayList;


/**
 * This class is used to hold the playerlist of the players in game
 * Holds array of playerinfos
 */
public class PlayerList {
    private ArrayList<PlayerInfo> playerList;
    private int maxPlayers=6;
    private int numPlayers;
    private BoardLayout map = new BoardLayout();
    
    /**
     * Constructor method.
     */
    public PlayerList(){
        playerList = new ArrayList<PlayerInfo>(maxPlayers);
    }
    
    /**
     * Returns the ArrayList of players
     * Used in other methods
     * @return playerList
     */
    public ArrayList<PlayerInfo> getPlayerList(){
        return playerList;
    }
    /**
     * Changes number of players.
     * @param numOfPlayers this is the number of players in the game
     */
    public PlayerList(int numOfPlayers){
        this.numPlayers = numOfPlayers;
        playerList = new ArrayList<PlayerInfo>(numPlayers);
    }
    
    /**
     * Adds a playerInfo to the playerList.
     * @param playerName this is the players username
     * @param charChoice this is the players character choice
     */
    public void addPlayers(String playerName, int charChoice){
        playerList.add(new PlayerInfo(playerName,charChoice));
    }
    
    /**
     * Assigns character pieces based on the choice by the player.
     * @param players this is a pointer to identify the player
     */
    public void givePieces(int players){
        int pick = playerList.get(players).getCharPick();
        
        //Tile layout needs editing once we know positions
        if(pick==1){
            playerList.get(players).setChar(new CharacterPieces("Miss Scarlett",map.board[0][0],Color.magenta));
        } else if(pick==2){
            playerList.get(players).setChar(new CharacterPieces("Colonel Mustard", map.board[0][0],Color.YELLOW));
        } else if(pick==3){
            playerList.get(players).setChar(new CharacterPieces("Mrs White", map.board[0][0],Color.WHITE));
        } else if(pick==4){
            playerList.get(players).setChar(new CharacterPieces("Reverend Green", map.board[0][0],Color.GREEN));
        } else if(pick==5){
            playerList.get(players).setChar(new CharacterPieces("Mrs Peacock", map.board[0][0],Color.MAGENTA));
        } else if(pick==6){
            playerList.get(players).setChar(new CharacterPieces("Professor Plum", map.board[0][0],Color.ORANGE));
        } else{
            System.out.print("Invalid input");
        }
    }
        
    }
    

