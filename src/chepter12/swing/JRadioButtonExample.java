
package chepter12.swing;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
public class JRadioButtonExample {
    public static void main(String args[]){
        JFrame frame = new JFrame("Radio box demo");
        JRadioButton radioButton1 = new JRadioButton("male");
        
        JRadioButton radioButton2 = new JRadioButton("female");
        JPanel panel = new JPanel();
        panel.add(radioButton1);
        panel.add(radioButton2);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}
