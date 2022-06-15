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
    private String charName;

    private JTextField input;
    private JPanel mainPanel;
    private JButton ImageLogo;
    private String currentLocation = "???";
    private int currentLvl = 5;
    private int currentLivePoints = 100;

    public window(){
        location.setText("Location: "+currentLocation);
        playerlvl.setText("LVL: " + String.valueOf(currentLvl));
        lifepoints.setText("LP: " + String.valueOf(currentLivePoints));
        StoryTracker storyTracker = new StoryTracker();
        ArrayList<Target> targets = new ArrayList<>();
        Spawner spawner = new Spawner();
        spawner.spawnObjects(storyTracker.getLocation(),targets);
        sendMessageFromBackend("What is your name, fellow Traveller?");


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
                            charName = input.getText();
                            sendMessageFromBackend("Hello " + charName + ". Which animal do you wanna be - \n" +
                                    "Base: Attack: 7, Defense: 7, Dodge: 6\n" +
                                    "Mouse: Attack: 9, Defense: 10, Dodge: 1\n" +
                                    "Squirrel: Attack: 10, Defense: 5, Dodge: 5\n" +
                                    "Frog: Attack: 7, Defense: 3, Dodge: 10\n" +
                                    "Enter the animal:");
                            nameEntered = true;
                            input.setText("");
                        } else if (nameEntered && !animalChosen) {
                            while (input.getText().equalsIgnoreCase("Base") || input.getText().equalsIgnoreCase("Mouse") || input.getText().equalsIgnoreCase("Squirrel") || input.getText().equalsIgnoreCase("Frog")){
                                storyfield.append(">" + input.getText() + "\n");
                                player = spawner.spawnPlayer(input.getText());
                                player.setCharName(input.getText());
                                storyfield.append("You've choosen the " + player.getChosenClass() + "/" + player.getAnimal() + "! Now the Story can begin!\n You wake up to the rattling cage right next to you. Your head aches. It’s dark but you can tell the " + player.getAnimal().toLowerCase() + " in the other cage is your little sister.\n");
                                location.setText("Location: " + storyTracker.getLocation());

                                input.setText("");
                                animalChosen = true;
                            }
                        } else {
                            UserInputService.receiveUserInput(input, storyfield, storyTracker,location, targets,player);
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
        //Scalierung des 1.Bildes
        ImageIcon bigcatCard = new ImageIcon("src/GUI/resources/firstCard.png");
        Image catImage = bigcatCard.getImage();
        Image newCatImg = catImage.getScaledInstance(180,250,Image.SCALE_SMOOTH);
        ImageIcon smolCatCard = new ImageIcon(newCatImg);
        //Macht auf den button das Kartenbild
        ImageLogo = new JButton(new ImageIcon("src/GUI/resources/kartenIcon.png"));

        //Second Image
        ImageIcon lionCat = new ImageIcon("src/GUI/resources/secondCard.png");
        Image lionCatImage = lionCat.getImage();
        Image newlionCat = lionCatImage.getScaledInstance(180,250,Image.SCALE_SMOOTH);
        ImageIcon smolshinyCard = new ImageIcon(newlionCat);

        //Neues Label für die erste karte
        JLabel card1 = new JLabel();
        card1.setIcon(smolshinyCard);
        card1.setHorizontalAlignment(JLabel.LEFT);
        card1.setBackground(Color.black);
        JLabel card2 = new JLabel();
        card2.setIcon(smolCatCard);
        card2.setHorizontalAlignment(JLabel.RIGHT);
        card2.setBackground(Color.black);
        JFrame cardFrame = new JFrame("Your collected Cards");
        cardFrame.setLayout(new FlowLayout(FlowLayout.LEFT, 10,100));
        cardFrame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        cardFrame.setSize(800,500);
        cardFrame.setResizable(false);
        card1.setVisible(false);
        card2.setVisible(false);
        cardFrame.add(card1);
        cardFrame.add(card2);
        cardFrame.setLocationRelativeTo(null);
        cardFrame.setVisible(false);
        cardFrame.getContentPane().setBackground(Color.black);

        //"Achievement list"
        String[] achievementNames = {"lion", "cat"};


        ImageLogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // player.getAchievements()[0][1] = "1"; //this is a way to change if achievement is unlocked
                for (int i = 0; i < player.getAchievements().length; i++) {
                    for (int j = 0; j < 2; j++) {
                        if(player.getAchievements()[i][j].equalsIgnoreCase("lion") && player.getAchievements()[i][j+1] == "1"){ //only Cat Achievement
                           System.out.println(player.getAchievements()[i][j] + " - " + player.getAchievements()[i][j+1]);
                            card1.setVisible(true);
                            }
                        if(player.getAchievements()[i][j].equalsIgnoreCase("cat") && player.getAchievements()[i][j+1] == "1"){
                            System.out.println(player.getAchievements()[i][j] + " - " + player.getAchievements()[i][j+1]);
                            card2.setVisible((true));
                        }
                        }

                    }


                cardFrame.setVisible(true);


            }
        });

    }
}

