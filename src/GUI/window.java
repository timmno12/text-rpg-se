package GUI;

import setup.UserInputService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class window {
    private JTextArea location;
    private JTextArea playerlvl;
    private JTextArea lifepoints;
    private JTextArea storyfield;
    private JTextField input;
    private JPanel mainPanel;
    private JButton ImageLogo;
    private String currentLocation = "Haus";
    private int currentLvl = 5;
    private int currentLivePoints = 10;

    public window(){
        location.setText("Ort: " + currentLocation);
        playerlvl.setText("LVL: " + String.valueOf(currentLvl));
        lifepoints.setText("LP: " + String.valueOf(currentLivePoints));


        input.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                super.keyPressed(e);
                if (key == KeyEvent.VK_ENTER) {
                    //mainTextShow.append("Playername : " + userInput.getText() + "\n");
                    if(input.getText().length() > 0) {
                        UserInputService.receiveUserInput(input, storyfield);
                    }


                }

            }
        });
    }


    public static void main(String[] args) {
        JFrame window = new JFrame("Benny hat Spaß");
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

