package Game;

/**
 * Class for the dice to be rolled randomly
 * 
 */
public class Dice {
    int dice1; //stores int for the first die
    int dice2; //stores int for the second die
    int diceroll; //stores for the diceroll
    
    /**
     * Constructor for the dice.
     */
    public Dice(){
        dice1=0;
        dice2=0;
        diceroll=0;
    }
    
    /**
     * Roll dice method which rolls the dice between 1-6 and adds the result
     * @return returns the return of the roll as an int.
     */
    public int rollDice(){
        dice1 = (int)(Math.random()*6) + 1;
        dice2 = (int)(Math.random()*6) + 1;
        diceroll = dice1 + dice2;
        System.out.println(diceroll);
        return diceroll;
        
    }
}
