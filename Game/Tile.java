package Game;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;

/**
 * Tile Class to create and allocate positions of individual tiles of the map.
 */
public class Tile {

    private static final double width = 21.5; // tiles width size
    private static final double height = 21.5; //tiles height size
    private float x; // tiles x co-ordinate
    private float y; // tiles y co-ordinate
    private int row; // row of the array
    private int column;  // column of the array
    private int tileType; // identifies the tile type
    private int room; //distinguishes the room

    /**
     * Tile constructor
     */
    public Tile() {
        this.x = 0;
        this.y = 0;
        this.row = 0;
        this.column = 0;
        this.tileType = 0;
        this.room = 0;
    }

    /**
     * Constructor for tile
     *
     * @param xValue this is the x value of the tile
     * @param yValue this is the y value of the tile
     * @param numberOfRows this is the number of rows in the tile is
     * @param numberOfColumns this is the number of columns down the tile is
     * @param tiletype this is the type of tile it is
     * @param roomNumber this is the rooms allocated number it belongs to
     */
    public Tile(float xValue, float yValue, int numberOfRows, int numberOfColumns, int tiletype, int roomNumber) {
        this.x = xValue;
        this.y = yValue;
        this.row = numberOfRows;
        this.column = numberOfColumns;
        this.tileType = tiletype;
        this.room = roomNumber;
    }

    /**
     * Gets the x co-ordinate
     * @return x
     */
    public float getXCoordinate() {
        return x;
    }

    /**
     * Gets the y co-ordinate
     * @return y
     */
    public float getYCoordinate() {
        return y;
    }

    /**
     * Gets the row position
     * @return row
     */
    public int getRowPosition() {
        return row;
    }
    /**
     * Gets the column position
     * @return column
     */
    public int getColumnPosition() {
        return column;
    }
    /**
     * Gets the tile type
     * @return tileType
     */
    public int getTileType() { //returns what type of tile it is 
        return tileType;
    }
    /**
     * Gets the room type
     * @return room
     */
    public int getRoom() { //returns room types
        return room;
    }
    /**
     * Shows the room's tiles
     * @return "[" + row + ", " + column + "]"
     */
    public String roomTiles() { // shows rooms tiles
        return "[" + row + ", " + column + "]";
    }
    /**
     * Creates a tile with Graphics2D
     * @param graphics this is the graphics that need to be created with Graphics2D
     */
    public void createTile(Graphics graphics) { //creates a tile in given position
        Graphics2D graphics2D = (Graphics2D) graphics;
        Rectangle2D rectangle = new Rectangle2D.Double(x, y, width, height); //Draw a square
        Color colour = new Color(0, 0, 0, 0.0f); //creates invisible border
        graphics2D.setPaint(colour);
        graphics2D.draw(rectangle);

    }
}
