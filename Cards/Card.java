package Cards;

import java.util.ArrayList;

public class Card {
    private String cardName;
    private String cardType;
    public static String[] weapons = {"Spanner", "Candlestick", "Lead Pipe", "Rope", "Revolver", "Dagger"};
    public static String[] characters = {"Miss Scarlett", "Colonel Mustard", "Mrs White", "Reverend Green", "Mrs Peacock", "Professor Plum"};
    public static String[] rooms = {"Kitchen", "Hall", "Conservatory", "Dining Room", "Cellar", "Billiard Room", "Library", "Lounge", "Study"};
    
    /**
     * Initialising the cards / Assigning card names + types
     * @param name this is the name of the card
     * @param type this is the card type i.e weapon
     */
    public Card(String name, String type ){
        this.cardName = name; 
        this.cardType = type;
    }
   
    
    /**
     * Gets the name of the card to identify it
     * @return cardName
     */
    public String getCardName(){
        return this.cardName;
    }
    
    /**
     * Gets the type of the card e.g Weapon/Character/Room
     * @return cardType
     */
    public String getCardType(){
        return this.cardType;
    }
    
    /**
     * Returns the card in string format
     * @return Card type: " + this.cardType + " card name:" + this.cardName
     */
    public String cardToString(){
        return ("Card type: " + this.cardType + " card name:" + this.cardName);
    }
    
}
