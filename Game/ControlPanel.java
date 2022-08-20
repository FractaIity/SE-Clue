package Game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

/**
 * Control panel class for player controls is all here
 */
public class ControlPanel extends JPanel {

    private static JLabel movesRemaining = new JLabel(""); // label for number of moves remaining
    private static JButton button1;
    private final LinkedList<String> commandStore = new LinkedList<>(); //linkedlist to store commands temporarily

    /**
     * ControlPanel setup, this creates the components and and allocates all the
     * sizes, dimensions and positions for the control panel.
     */
    public ControlPanel() {
        //makes panels
        JPanel containerPanel = new JPanel();
        JPanel menuPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        containerPanel.setPreferredSize(new Dimension(1000, 480)); //sets dims of containerpanel
        menuPanel.setPreferredSize(new Dimension(600, 240));// sets dims for menupanel
        buttonPanel.setPreferredSize(new Dimension(300, 240));//sets dims for button panel

        //allocates panels
        containerPanel.add(menuPanel);
        containerPanel.add(buttonPanel);
        containerPanel.setBackground(Color.BLACK);
        menuPanel.setBackground(Color.BLACK);
        buttonPanel.setBackground(Color.BLACK);

        //formats panels
        add(containerPanel);
        setPreferredSize(new Dimension(1980, 420));
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        menuPanel.setLayout(new GridLayout(1, 7));
        buttonPanel.setLayout(new GridLayout(3, 3));
        //makes buttons
        JButton buttonQuit = new JButton("Quit");
        JButton buttonRoll = new JButton("Roll");
        JButton buttonLog = new JButton("Log");
        JButton buttonHelp = new JButton("Help");
        JButton buttonNotes = new JButton("Notes");
        JButton buttonQuestion = new JButton("Question");
        JButton buttonAccusation = new JButton("Accuse");
        JButton buttonEndTurn = new JButton("End Turn");
        JButton buttonBlank = new JButton("");
        JButton buttonBlank2 = new JButton("");
        JButton buttonBlank3 = new JButton("");
        JButton buttonBlank4 = new JButton("");
        JButton buttonUp = new JButton("Up");
        JButton buttonDown = new JButton("Down");
        JButton buttonLeft = new JButton("Left");
        JButton buttonRight = new JButton("Right");

        //orders buttons by placing chronologically in a grid
        menuPanel.add(buttonQuit);
        menuPanel.add(buttonHelp);
        menuPanel.add(buttonLog);
        menuPanel.add(buttonNotes);
        menuPanel.add(buttonQuestion);
        menuPanel.add(buttonAccusation);
        menuPanel.add(buttonRoll);
        buttonPanel.add(buttonBlank);
        buttonPanel.add(buttonUp);
        buttonPanel.add(buttonBlank3);
        buttonPanel.add(buttonLeft);
        buttonPanel.add(buttonEndTurn);
        buttonPanel.add(buttonRight);
        buttonPanel.add(buttonBlank2);
        buttonPanel.add(buttonDown);
        buttonPanel.add(buttonBlank4);

        /**
         * Button Handler
         */
        buttonEndTurn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonEndTurn.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonNotes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonNotes.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonAccusation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonAccusation.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonQuestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonQuestion.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonLog.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonHelp.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonQuit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonQuit.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonRoll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonRoll.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonUp.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonDown.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonLeft.getText());

                    commandStore.notify();
                }

            }
        });
        /**
         * Button Handler
         */
        buttonRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                synchronized (commandStore) {
                    commandStore.add(buttonRight.getText());

                    commandStore.notify();
                }

            }
        });

        class AddActionListener implements ActionListener {

            /**
             * Listens for user inputs and responds accordingly
             *
             * @param event
             */
            public void actionPerformed(ActionEvent event) {

                synchronized (commandStore) {
                    commandStore.add(button1.getText());

                    commandStore.notify();
                }
            }

        }
    }

    /**
     * A method that takes in a string of information from the button names and
     * uses them as an output.
     * @return A string from buttons label
     */
    public String getCommand() {
        String command;
        synchronized (commandStore) {
            while (commandStore.isEmpty()) {
                try {
                    commandStore.wait();
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }

            command = commandStore.pop();
        }

        return command;
    }
}
