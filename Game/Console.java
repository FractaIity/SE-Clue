package Game;
import java.awt.*;
import javax.swing.*;
/**
 * Class for the console which is used for game instructions.
 */
public class Console extends JPanel {
    private static final int width = 24;
    private static final int height = 30;  
    private JTextArea consoleOutput = new JTextArea("", height, width);

    /**
     * Creates the console for player visualisation of whats happening.
     */
    public Console() {
        JScrollPane textBox = new JScrollPane(consoleOutput); //creates scroll pane for console output text
        setPreferredSize(new Dimension(320, 580)); //sets scrollpane dims
        consoleOutput.setEditable(false); //disables editing of text
        consoleOutput.setLineWrap(true); //makes text wrap         
        consoleOutput.setMaximumSize(consoleOutput.getPreferredSize());
        add(textBox);
    }

    /**
     * Updates the console text output for player
     * @param output this is the output to the console
     */
    public void updateConsole(String output) {
        consoleOutput.append(output + "\n"); // adds string on the end after line break
        consoleOutput.setCaretPosition(consoleOutput.getDocument().getLength()); //auto scroll
    }

    /**
     * Clears the console
     */
    public void clearConsole(){
        consoleOutput.setText("");
    }


}