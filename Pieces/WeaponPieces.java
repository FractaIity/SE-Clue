package Pieces;
import Game.Tile;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
/**
 * This is for the weapon pieces on the board
 * creates the weapon using the name + tile position on the board
 */
public class WeaponPieces {
    private String weaponName; //holds the weapon name
    private Tile position; //holds the position of the weapon on the board
    private float X_OFFSET = 6f;
    private float Y_OFFSET = 16f;
    private int S_OFFSET = 2;
    private int SQUARE = 18;
    
    /**
     * Constructor for the Weapon piece on the board
     * @param name this is the weapons name i.e Dagger
     * @param position this is the weapons position on the board
     */
    public WeaponPieces(String name, Tile position){
        this.weaponName = name;
        this.position = position;
    }
    
    /**
     * Returns the name of the weapon
     * @return weaponName
     */
    public String getName(){
        return weaponName;
    }
    
    /**
     * Returns the position of the weapon on the board
     * @return position
     */
    public Tile getPos(){
        return this.position;
    }
    
    /**
     * Used in game for moving the position of the board
     * @param pos this is the tile position to move the weapon to
     */
    public void moveWeapon(Tile pos){
        this.position = pos;
    }
    
    /**
     * Method for the weapon graphic creation
     * @param wepgraph this is the graphic to be made for the weapon
     */
    public void drawWepPiece(Graphics wepgraph) {
        Graphics2D weapon = (Graphics2D) wepgraph;
        weapon.setColor(Color.BLACK);
        
        //weapon bg
        Rectangle2D.Double rectangleBlack = new Rectangle2D.Double(position.getXCoordinate() + S_OFFSET, position.getYCoordinate() + S_OFFSET, SQUARE , SQUARE);
        weapon.fill(rectangleBlack);
        
        //weapon fg
        Rectangle2D.Double rectangleColor = new Rectangle2D.Double(position.getXCoordinate() + S_OFFSET + 2, position.getYCoordinate() + S_OFFSET + 2, SQUARE - 4 , SQUARE - 4);
        weapon.setColor(Color.lightGray);
        weapon.fill(rectangleColor);
        
        //Letter to identify weapon
        Font font = new Font("Arial", Font.BOLD, 14); //Font Comic Sans
        weapon.setFont(font);
        weapon.setColor(Color.yellow);  //Blue color
        
        weapon.drawString(weaponName.substring(0, 1),  position.getXCoordinate() + X_OFFSET, position.getYCoordinate() + Y_OFFSET);
    }
    
}
