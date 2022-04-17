package window_mika_try;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainWindow {


    private JPanel mainPanel;
    private JTextField userInput;
    private JTextArea mainTextShow;
    private JTextArea locationField;
    private JTextArea playerlvlField;
    private int playerLvl;
    private int livePoints;
    private JTextArea WeaponLifePointsField;


    public MainWindow() {

        locationField.setText("Start");
        playerlvlField.setText(String.valueOf(playerLvl));
        WeaponLifePointsField.setText(String.valueOf(livePoints));

        userInput.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                super.keyPressed(e);
                if (key == KeyEvent.VK_ENTER) {
                    //mainTextShow.append("Playername : " + userInput.getText() + "\n");
                    UserInputService.receiveUserInput(userInput, mainTextShow);


                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("window_mika_try");
        window.setResizable(false);
        window.setContentPane(new MainWindow().mainPanel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);


    }


}
