package Game;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import Pieces.WeaponPieces;
import Pieces.Weapons;
/**
 * Class for the Map UI frame
 */
public class MapPanel extends JPanel{
    
    	public BufferedImage dice1, dice2, clueMap; 
        public Weapons weapons;
        public ArrayList<PlayerInfo> arrayPlayers;
        public ArrayList<PlayerInfo> arrayNPCs;
        public ArrayList<WeaponPieces> arrayWeps;
        public PlayerList players;
        public PlayerList NPC;
        
        /**
         * Constructor for the map panel, this finds the image and sets its dims to the size of the board
         * @param players list of players
         * @param NPCs list of NPCs
         * @param weapons list of weapons
         * @throws IOException throws exception if there is an error
         */
	public MapPanel(PlayerList players,PlayerList NPCs, Weapons weapons ) throws IOException{	
		this.weapons = weapons;
		this.players = players;
		this.NPC = NPCs;
                this.arrayPlayers = players.getPlayerList();
                this.arrayNPCs = NPCs.getPlayerList();
                this.arrayWeps = weapons.getWeaponList();
                try{
                clueMap = ImageIO.read(this.getClass().getResource("/resources/Board.png")); }
                catch(IOException e){
                    System.out.println("Image not found" + e);
                }
                //InputStream stream = getClass().getResourceAsStream("/resources/Board.png");
                setPreferredSize(new Dimension(clueMap.getHeight(), clueMap.getWidth()));
        }
        
        /**
         * Method that adds the visual components to the map i.e players, NPCs, weapons
         * @param graphic this is graphic that needs to be painted i.e the dagger weapon
         */
        @Override
        public void paintComponent(Graphics graphic) {
        super.paintComponent(graphic);
        Graphics2D Board2D = (Graphics2D) graphic;
        Board2D.drawImage(clueMap, 0, 0, clueMap.getHeight(), clueMap.getWidth(), this);
        
        for(WeaponPieces w: arrayWeps) {
        	w.drawWepPiece(Board2D);
        }
        for(PlayerInfo player: arrayPlayers) {
        	player.getCharPiece().drawCharPiece(Board2D);
        }
        for(PlayerInfo NPCs: arrayNPCs) {
        	NPCs.getCharPiece().drawCharPiece(Board2D);
        }
	}
        
        /**
         * Assigns the pieces for the board
         * @param players list of players
         * @param NPCs list of NPCs
         * @param weapons list of weapons
         */
        public void setPieces(PlayerList players,PlayerList NPCs, Weapons weapons ) {
		this.weapons = weapons;
		this.players = players;
		this.NPC = NPCs;
	}
}