package Game;
import Pieces.Weapons;
import java.io.IOException;
/**
 * Main class for Clue, used for initiation
 */
public class Main {
    private int noOfPlayers;
    private PlayerList listPlayers;
    private PlayerList NPCs;
    private GUI GUI;
    private Weapons setWeps;
    private StartGame sg;
    private GameController gc;
    
    
    /**
     * Main constructor assigns all classes needed to be used at beginning
     * @throws IOException throws exception if there is an error
     */
    public Main() throws IOException{
        this.listPlayers = new PlayerList();
        this.NPCs = new PlayerList();
        this.setWeps = new Weapons();
        this.GUI = new GUI(listPlayers, setWeps, NPCs);
        this.sg = new StartGame(GUI);
        this.gc = new GameController(listPlayers,NPCs,setWeps,GUI);
    }
    
    /**
     * Main method starts up the launcher
     * @param args instanced passed to method during runtime
     * @throws IOException throws exception if there is an error
     */
    public static void main(String[] args) throws IOException {
        Launcher launch = new Launcher();
        launch.launchScreen(); 
        while(!launch.startGame){ 
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
      Main game = new Main();
      game.start();
      game.takeTurn();
    }
    
    /**
     * Method take turn for the game controller
     */
    public void takeTurn(){
        gc.takeTurn();
    }
    
    /**
     * Start method for the startup UI
     */
    public void start() {
        noOfPlayers = sg.size();							
        this.listPlayers = new PlayerList(noOfPlayers);				
        this.NPCs = new PlayerList(6);
        sg.addPlayers(listPlayers);							
        GUI.display();
    }
}
