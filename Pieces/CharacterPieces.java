package Pieces;
import Game.Tile;

//Found in research to diplsay char pieces
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * This class is used with characters in card for character pieces on the board
 */

/////// NEEDS EDITING FOR GRAPHICS TO IMPLEMENT VISUALLY //////////// JFX? OR LEARN SWING? LEARN ONLINE
public class CharacterPieces {
    private String characterPieceName;
    private Tile position;
    private Color colour;
    
    private int adjust =2;
    private int adjust_X=5;
    private int adjust_Y=16;
    private int ovalSize=18;
    
    /**
     * Creates character piece for the board
     * @param charName this is the characters name
     * @param colour this is the colour of the character piece
     * @param pos  this is the characters position on the board
     */
    public CharacterPieces(String charName, Tile pos,Color colour){
        this.characterPieceName = charName;
        this.position = pos;
        this.colour = colour;
    }
    
    /**
     * Gets the character name of the piece
     * @return characterPieceName
     */
    public String getCharPieceName(){
        return this.characterPieceName;
    }
    
    /**
     * Gets the tile position of the piece // will be used for validation when moving
     * @return position
     */
    public Tile getPos(){
        return position;
    }
    
    /**
     * Used for moving the character piece during a turn 
     * @param pos this is the position on the board the character will be moved to
     */
    public void moveChar(Tile pos){
        this.position = pos;
    }
    
    /**
     * This draws the character pieces on the board
     * @param charGraph this is the graphic to  be created
     */
    public void drawCharPiece(Graphics charGraph) {
        Graphics2D chars = (Graphics2D) charGraph;

        //Font for initials.
        Font font = new Font("Arial", Font.BOLD, 14);
        chars.setFont(font);

        //Oval background
        chars.setColor(Color.lightGray); 
        chars.fillOval((int) position.getXCoordinate() + adjust, (int) position.getYCoordinate() + adjust, ovalSize,ovalSize);
        
        //Oval foreground
        chars.setColor(colour);
        chars.fillOval((int) position.getXCoordinate() + adjust + 1, (int) position.getYCoordinate() + adjust + 1, ovalSize - 2,ovalSize - 2);
        
        //Draw initial onto the Oval
        chars.setColor(Color.black); 
        chars.drawString(characterPieceName.substring(0, 1), position.getXCoordinate() + adjust_X, position.getYCoordinate() + adjust_Y); //Initials.
    }
}
