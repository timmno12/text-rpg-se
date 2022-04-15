package window_mika_try;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class bennytestet {
    private JTextArea location;
    private JTextArea playerlvl;
    private JTextArea livepoints;
    private JTextArea storyfield;
    private JTextField input;
    private JPanel mainPanel;
    private String currentLocation = "Haus";
    private int currentLvl = 5;
    private int currentLivePoints = 10;

    public bennytestet(){
        location.setText("Ort: " + currentLocation);
        playerlvl.setText("LVL: " + String.valueOf(currentLvl));
        livepoints.setText("LP: " + String.valueOf(currentLivePoints));


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
        window.setContentPane(new bennytestet().mainPanel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1280, 720);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}

