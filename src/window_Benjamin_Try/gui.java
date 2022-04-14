package window_Benjamin_Try;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {
    public static void main(String[] args) {
        new gui();
    }
    public gui(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                try{
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                //Creating Frame
                Font font = new Font("Cascadia Code",Font.BOLD,15);
                JFrame frame = new JFrame("Adventure");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600,600);

                //Creating menubar and adding components
                JMenuBar mb = new JMenuBar();
                JMenu m1 = new JMenu("GAME");
                JMenu m2 = new JMenu("HELP");

                mb.add(m1);
                mb.add(m2);
                JMenuItem m11 = new JMenuItem("Open");
                JMenuItem m12 = new JMenuItem("Save as");
                JMenuItem m21 = new JMenuItem("No help for you");
                m1.add(m11);
                m1.add(m12);
                m2.add(m21);

                // HOW TO PUT IMAGE INTO IT
                 //ImageIcon imageIcon = new ImageIcon("test.png");
                //Image image = imageIcon.getImage();
                //Image newimg = image.getScaledInstance(300,300, Image.SCALE_SMOOTH);
                //imageIcon = new ImageIcon(newimg);

                //JLabel label2 = new JLabel();
                //label2.setIcon(imageIcon);
                //Dimension size = label2.getPreferredSize();
                //label2.setBounds(50,70,size.width,size.height);




                //Creating the panel at bottom and adding comp
                JPanel panel = new JPanel();
                panel.setBackground(Color.darkGray.darker());
                JLabel label = new JLabel("Enter Text");
                label.setFont(font);
                label.setForeground(Color.white);
                JTextField tf = new JTextField(10);
                tf.setBackground(Color.darkGray.darker());
                tf.setFont(font);
                tf.setForeground(Color.white);
                JButton send = new JButton("Send");
                send.setFont(font);
                send.setBackground(Color.darkGray.darker());
                send.setForeground(Color.white);
                JButton reset = new JButton("Reset");
                reset.setBackground(Color.darkGray.darker());
                reset.setForeground(Color.white);
                reset.setFont(font);
                panel.add(label);
                panel.add(tf);
                panel.add(send);
                panel.add(reset);

                //TEXT AREA AT THE CENTER
                JTextArea ta = new JTextArea();

                ta.setFont(font);
                ta.setEditable(false);
                ta.setForeground(Color.white);
                ta.setBackground(Color.darkGray.darker());

                //Wenn Button pressed -> rein in das Textfeld
                send.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ta.append(tf.getText() + "\n");
                    }
                });
                //Clear the textfield
                reset.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tf.setText("");
                    }
                });

                //Adding components to the frame
                frame.getContentPane().add(BorderLayout.SOUTH, panel);
                frame.getContentPane().add(BorderLayout.NORTH, mb);
                frame.getContentPane().add(BorderLayout.CENTER, ta);
                //frame.getContentPane().add(label2);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
