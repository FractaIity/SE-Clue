package Game;
import Cards.Card;
import java.util.ArrayList;
import java.util.List;
import Pieces.CharacterPieces;

/**
 * This class is for the player information, holds the player name + their cards + if they have rolled + if they have suggested etc
 */
public class PlayerInfo {
    //Variables needed - This may change as project goes on
    String playerName; //Name of the player
    int playerNumber; //What order the players are made
    ArrayList<Card> playerHand; //the list of cards that the player has
    boolean hasRolled; //if the player has rolled
    boolean hasSuggested; //if the player has made a suggestion
    String playerWeapon; //this is the player's weapon card
    String playerCharacter; //this is the player's character card
    String playerRoom; //this is the player's room card
    boolean isNPC; //if player is an NPC
    boolean isAlive = true; //if they are alive
    int movesLeft; //moves left from dice roll
    int charPick; // choice of character piece
    CharacterPieces charPiece; //sets the character piece

    /**
     * Constructor for PlayerInfo
     * @param playerName Takes players name
     * @param charPick  Takes the character piece the player picks
     */
    public PlayerInfo(String playerName, int charPick){
     this.playerName = playerName; //player name
     this.charPick = charPick;
     this.playerHand = new ArrayList<>();
     this.hasRolled = false;
     this.hasSuggested = false;
     this.charPiece = null;
    }
    
    /**
     * Returns a players cards in string format
     * @return cardString
     */
    public String cardsToString(){
        String cardString="";
        for (Card c : playerHand){
            cardString = cardString + c.cardToString() + ", ";
        }
        return cardString;
    }
    
    /**
     * Gets the character piece pick
     * @return charPick
     */
    public int getCharPick(){
        return this.charPick;
    }
    
    /**
     * Gives the player the character piece
     * @param charPiece this is the character piece
     */
    public void setChar(CharacterPieces charPiece){
        this.charPiece = charPiece;
    }
    
    /**
     * Gets this players character piece to be able to be moved
     * @return CharacterPiece
     */
    public CharacterPieces getCharPiece(){
        return this.charPiece;
    }
    /**
     * Adds a card to the players hand
     * @param c card to add to hand
     */
    public void addCard(Card c){
        this.playerHand.add(c);
    }
    /**
     * Returns the list of cards the player holds
     * @return playerHand 
     */
    public ArrayList<Card> getCards(){
        return this.playerHand;
    }
    
    /**
     * Returns boolean to check if the player has rolled
     * @return boolean if the player has rolled
     */
    public boolean getHasRolled(){
        return this.hasRolled;
    }
    
    /**
     * Resets hasRolled for after a player has rolled
     */
    public void resetRoll(){
        hasRolled = false;
    }
    
    /**
     * Changes the hasRolled once a player rolls
     */
    public void rolled(){
        hasRolled = true;
    }
    
    /**
     * Gives a player moves based on their dice roll
     * @param moves  this is the number of moves
     */
    public void giveMoves(int moves){
        movesLeft=moves;
    }
    
    /**
     * Used to subtract from moves once a player moves
     */
    public void moveTaken(){
        movesLeft--;
    }
    
    /**
     * Gets the number of moves left
     * @return movesLeft
     */
    public int getMovesLeft(){
        return this.movesLeft;
    }
    
    /**
     * Checks if a player has suggested
     * @return hasSuggested
     */
    public boolean getHasSuggested(){
        return this.hasSuggested;
    }
    /**
     * Checks if a player is alive
     * @return isAlive
     */
    public boolean getIsAlive(){
        return this.isAlive;
    }
    
    /**
     * Gets if a player is an NPC or real player
     * @return isNPC
     */
    public boolean getIsNPC(){
        return this.isNPC;
    }
    
    /**
     * Returns the name of the player // NOT THE CHARACTER CARD THEY HAVE
     * @return playerName
     */
    public String getPlayerName(){
        return this.playerName;
    }
    
    /**
     * Returns the player number of the character i.e player 1, player 2 
     * @return playerNumber
     */
    public int getPlayerNum(){
        return this.playerNumber;
    }
    


}
