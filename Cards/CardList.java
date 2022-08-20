package Cards;

import java.util.ArrayList;

public class CardList {
    public String[] weapons = {"Spanner", "Candlestick", "Lead Pipe", "Rope", "Revolver", "Dagger"};
    public String[] characters = {"Miss Scarlett", "Colonel Mustard", "Mrs White", "Reverend Green", "Mrs Peacock", "Professor Plum"};
    public String[] rooms = {"Kitchen", "Hall", "Conservatory", "Dining Room", "Cellar", "Billiard Room", "Library", "Lounge", "Study"};
    public ArrayList<Card> cardList; //Holds list of all cards
    public ArrayList<Card> weaponList; //Holds list of weapon cards
    public ArrayList<Card> characterList; //holds list of character cards
    public ArrayList<Card> roomList; //holds list of room cards
    
    /**
     * Constructor creating the Array Lists for each type of card possible.
     */
    public CardList(){
        cardList = new ArrayList<>();
        weaponList = new ArrayList<>();
        characterList = new ArrayList<>();
        roomList = new ArrayList<>();
    }
    
    /**
     * Creates entire list of cards to use + types
     * Combines all the lists of cards into one card list simply named cardList.
     * When assigning cards to plays do a for loop + Use getCardType method + remove from list once it is dealt.
     */
    public void createCardList(){
       addWeapons();
       addCharacters();
       addRooms();
       //Unifying the lists
       cardList.addAll(weaponList);
       cardList.addAll(characterList);
       cardList.addAll(roomList);
       }
       
    /**
     * Creates the Array List of weapons.
     */
    public void addWeapons(){
        for (int i=0; i<=weapons.length-1 ;i++){
            Card c = new Card(weapons[i],"Weapon");
            weaponList.add(c);
            System.out.println("Added card: "+ weapons[i]+ " type: weapon");
        }
    }
   
    /**
     * Creates the Array list of characters.
     */
    public void addCharacters(){
    for (int j=0; j<=characters.length-1 ;j++){
            Card c1 = new Card(characters[j],"Character");
            characterList.add(c1);
            System.out.println("Added card: "+ characters[j]+ " type: Character");
        }
    }
    
    /**
     * Creates the Array List of rooms.
     */
    public void addRooms(){
    for (int k=0; k<=rooms.length-1 ;k++){
            Card c2 = new Card(rooms[k],"Room");
            roomList.add(c2);
            System.out.println("Added card: "+ rooms[k]+ " type: room");
        }
    }
    
    
    /**
     * Gets the length of the card list. -- Used for testing
     * @return cardList.size() the size of the card list 
     */
    public int getCardListLength(){
        return cardList.size();
    }
        /**
     * Returns the Array list of the cards
     * @return The Arraylist cardList 
     */
    public ArrayList<Card> getCardList(){
        return cardList;
    }
    
        /**
     * Used to remove from a card list
     * @param c card input to remove
     */
    public void removeCardFromList(Card c){
        cardList.remove(c);
    }
    
}
