package chepter12.swing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JPanelExample {

    public static void main(String args[]) {
        JFrame frame = new JFrame("Panel Demo");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter your name");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("click me");

        panel.add(label);
        panel.add(textField);        
        panel.add(button);
        panel.setBackground(Color.BLUE);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
    }
}
