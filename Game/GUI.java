package Game;
import Pieces.Weapons;
import java.awt.*;
import java.io.IOException;
import java.util.Random;
import javax.swing.*;
/**
 * The hub for GUI's all GUI's are handled and organised here for the main game.
 */
public class GUI {

    private JFrame screen;
    private static final int windowWidth = 1000; //sets screen width
    private static final int windowHeight = 1100; //sets screen height

    private MapPanel map;
    private Console console;
    private ControlPanel buttons;
    private Random rand = new Random();

    /**
     * Constructor to set up all the UI
     * @param listPlayers list of players
     * @param weapons list of weapons
     * @param NPCs list of NPCs
     * @throws IOException throws exception if there is an error
     */
    public GUI(PlayerList listPlayers, Weapons weapons, PlayerList NPCs) throws IOException {
        screen = new JFrame();
        JPanel mainPanel = new JPanel();
        map = new MapPanel(listPlayers, NPCs, weapons);
        buttons = new ControlPanel();
        console = new Console();

        screen.setBackground(Color.BLACK); //sets screen bg black
        map.setBackground(Color.BLACK);        //sets map bg black
        console.setBackground(Color.BLACK);// sets console bg black
        buttons.setBackground(Color.BLACK); //sets buttons bg black

        mainPanel.add(console); //adds output console to main panel
        mainPanel.add(map); //adds the board to the main panel
        mainPanel.setPreferredSize(new Dimension(1000, 720)); //sets dims for mainpanel
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

        screen.setTitle("Clue"); //creates window title
        screen.add(mainPanel);//add main panel to the frame
        screen.setSize(windowWidth, windowHeight); //sets frame size to fit the window  
        screen.add(mainPanel, BorderLayout.LINE_START);//formats positioning of mainpanel in the frame
        screen.add(buttons, BorderLayout.PAGE_END);//adds the buttons to the frame
        screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//exits on close
        screen.setLocationRelativeTo(null);
        screen.setResizable(false);//disables window scale
        screen.setVisible(true);//makes window visible
    }

    /**
     * Prompts an input dialog to enter number of players. 
     * @return the number of players
     */
    public String getPlayerCount() {
        String playerCount = JOptionPane.showInputDialog("Please enter the number of players (between 2-6)");
        return playerCount;
    }

    /**
     * Updates the display of the map
     */
    public void display() {
        map.repaint();
    }

    /**
     * Displays string input into the console
     * @param string contains information based on the turn
     */
    public void displayString(String string) {
        console.updateConsole(string);
    }

}
