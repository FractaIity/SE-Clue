package Pieces;
import Game.BoardLayout;
import Pieces.CharacterPieces;
import java.util.ArrayList;
import java.awt.Color;


public class Characters {
    private ArrayList<CharacterPieces> characters;
    private BoardLayout map = new BoardLayout();
    private final int numOfCharacters =6;
    //{"Miss Scarlett", "Colonel Mustard", "Mrs White", "Mr Green", "Mrs Peacock", "Professor Plum"};
    public Characters(){
        characters = new ArrayList<>(numOfCharacters);
    }
    
    /**
     * Creates the characters for the board //// CHANGE THE PLACES ON THE BOARD (idk the tile positions without the class for it)
     */
    public void makeCharacters(){
        characters.add(new CharacterPieces("Miss Scarlett", map.board[0][0],Color.RED));
        characters.add(new CharacterPieces("Colonel Mustard", map.board[0][0],Color.YELLOW));
        characters.add(new CharacterPieces("Mrs White", map.board[0][0],Color.WHITE));
        characters.add(new CharacterPieces("Reverend Green", map.board[0][0],Color.GREEN));
        characters.add(new CharacterPieces("Mrs Peacock", map.board[0][0],Color.MAGENTA));
        characters.add(new CharacterPieces("Professor Plum", map.board[0][0],Color.ORANGE));
    }
    
    public CharacterPieces getCharPiece(String charName){
        for (CharacterPieces cp:characters){
            if (cp.getCharPieceName().equals(charName)){
                return cp;
            }
        }
        System.out.println("No such character");
        return null;
    }
    
}
