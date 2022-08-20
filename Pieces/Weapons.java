package Pieces;
import Game.BoardLayout;
import java.util.ArrayList;
import Pieces.WeaponPieces;
        
public class Weapons {
    private ArrayList<WeaponPieces>  weapons = new ArrayList<>();
    private BoardLayout map = new BoardLayout();
    
    public Weapons(){
        makeWeapons();
    }
    
    //EDIT POSITION OF THESE WHEN WE KNOW BOARD LAYOUT
    public void makeWeapons(){
        weapons.add(new WeaponPieces("Spanner", map.board[0][0] ));
        weapons.add(new WeaponPieces("Candlestick", map.board[0][0] ));
        weapons.add(new WeaponPieces("Lead Pipe", map.board[0][0] ));
        weapons.add(new WeaponPieces("Rope", map.board[0][0] ));
        weapons.add(new WeaponPieces("Revolver", map.board[0][0] ));
        weapons.add(new WeaponPieces("Dagger", map.board[0][0] ));
    }
    
    public ArrayList<WeaponPieces> getWeaponList(){
        return this.weapons;
    }
    
    public WeaponPieces getWeapon(String weapon){
        for (WeaponPieces wp: weapons){
            if (wp.getName().equals(weapon)){
                return wp;
            }
        }
        System.out.println("Weapon not found");
        return null;
    }
}
