package GUI;

import setup.Spawner;
import setup.StoryTracker;
import setup.Target;
import setup.UserInputService;
import setup.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class window {
    private JTextArea location;
    private JTextArea playerlvl;
    private JTextArea lifepoints;

    private JTextArea storyfield;

    private boolean nameEntered = false;
    private boolean animalChosen = false;

    private Player player;

    private JTextField input;
    private JPanel mainPanel;
    private JButton ImageLogo;
    private String currentLocation = "Cage";
    private int currentLvl = 5;
    private int currentLivePoints = 10;

    public window(){
        location.setText("Ort: " + currentLocation);
        playerlvl.setText("LVL: " + String.valueOf(currentLvl));
        lifepoints.setText("LP: " + String.valueOf(currentLivePoints));
        StoryTracker storyTracker = new StoryTracker();
        ArrayList<Target> targets = new ArrayList<>();
        Spawner spawner = new Spawner();
        spawner.spawnObjects(storyTracker.getLocation(),targets);
        sendMessageFromBackend("What is your name, fellow Traveller?");

        player = spawner.spawnPlayer();
        input.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                int key = e.getKeyCode();
                super.keyPressed(e);
                if (key == KeyEvent.VK_ENTER) {
                    //mainTextShow.append("Playername : " + userInput.getText() + "\n");
                    if(input.getText().length() > 0) {
                        if (!nameEntered && !animalChosen) {
                            storyfield.append(">" + input.getText() + "\n");
                            player.setCharName(input.getText());
                            sendMessageFromBackend("Hello " + player.getCharName() + ". Which animal do you wanna be - \n" +
                                    "Base: Attack: 7, Defense: 7, Dodge: 6\n" +
                                    "Mouse: Attack: 9, Defense: 10, Dodge: 1\n" +
                                    "Squirrel: Attack: 10, Defense: 5, Dodge: 5\n" +
                                    "Frog: Attack: 7, Defense: 3, Dodge: 10\n" +
                                    "Enter the animal:");
                            nameEntered = true;
                            input.setText("");
                        } else if (nameEntered && !animalChosen) {
                            storyfield.append(">" + input.getText() + "\n");
                            UserInputService.userSetup(input, storyfield, player);
                            animalChosen = true;

                        } else {
                            UserInputService.receiveUserInput(input, storyfield, storyTracker.getLocation(), targets);
                        }
                    }

                }

            }
        });
    }
    public void sendMessageFromBackend(String message){
        storyfield.append("God: " + message + "\n");
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Textadventure");
        window.setResizable(false);
        window.setContentPane(new window().mainPanel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1280, 720);
        window.setLocationRelativeTo(null);
        window.setVisible(true);


    }
    //für Custom stuff wie buttondesign
    private void createUIComponents() {
        //Scalierung des Bildest
        ImageIcon bigcatCard = new ImageIcon("src/GUI/resources/firstCard.png");
        Image catImage = bigcatCard.getImage();
        Image newCatImg = catImage.getScaledInstance(180,250,Image.SCALE_SMOOTH);
        ImageIcon smolCatCard = new ImageIcon(newCatImg);
        //Macht auf den button das Kartenbild
        ImageLogo = new JButton(new ImageIcon("src/GUI/resources/kartenIcon.png"));

        //Neues Label für die erste karte
        JLabel card1 = new JLabel();
        card1.setIcon(smolCatCard);
        card1.setHorizontalAlignment(JLabel.LEFT);
        card1.setBackground(Color.black);
        JFrame cardFrame = new JFrame("Your collected Cards");
        cardFrame.setSize(800,500);
        cardFrame.setResizable(false);
        cardFrame.add(card1);
        cardFrame.setLocationRelativeTo(null);
        cardFrame.setVisible(false);
        cardFrame.getContentPane().setBackground(Color.black);

        ImageLogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wenn auf den Button geklickt wird, wird die cardframe visible
                cardFrame.setVisible(true);

            }
        });

    }
}

