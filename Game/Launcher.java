package Game;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * This is the launcher class, so what is first seen when the jar is ran.
 */
public class Launcher extends JLabel implements ActionListener {

    JLabel startLauncher;
    JFrame frame;
    JButton start;
    JButton exit;
    boolean startGame = false;

    /**
     * Launcher setup, this creates the components and and allocates all the
     * sizes, dimensions and positions for the launcher UI.
     */
    public void launchScreen() {
        setLayout(new BorderLayout());

        InputStream stream = getClass().getResourceAsStream("/resources/ClueStart.jpg");//grabs background image
        ImageIcon logo = null;
        try {
            logo = new ImageIcon(ImageIO.read(stream));
        } catch (IOException exception) { //error if it cant find it
            System.out.println("Image not found" + exception);
        }

        frame = new JFrame("Clue");//sets window title
        start = new JButton("PLAY"); //sets button label
        exit = new JButton("EXIT"); //sets button label
        startLauncher = new JLabel(logo);
        startLauncher.setVisible(true);

        JPanel grid = new JPanel(new GridLayout(1, 2));
        grid.add(start); //adds start button to 1x2 grid
        grid.add(exit); //adds exit button to 1x2 grid
        frame.add(grid, BorderLayout.PAGE_END); //formatting for button grid 
        frame.add(startLauncher, BorderLayout.PAGE_START); //positions the main screen

        //creates button listeners
        start.addActionListener(this);
        exit.addActionListener(this);

        frame.setSize(1024, 768); //sets window size
        frame.setResizable(false);//disbles scaling
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//sets scrreen to be visible
    }

    /**
     * Listens for user inputs and responds accordingly
     * @param event this is the event dependent on the button pressed i.e a quit event
     * will quit
     */
    public void actionPerformed(ActionEvent event) {
        //takes launcher input
        //if start = starts game
        if (event.getSource() == start) {
            startGame = true;
            frame.dispose();
        }
        //if exit
        if (event.getSource() == exit) {
            System.exit(0);
        }
    }
}
