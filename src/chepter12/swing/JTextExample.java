
package chepter12.swing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


public class JTextExample {
    public static void main(String args[]){
        JFrame frame = new JFrame("Text Area demo");
        JTextArea textarea = new JTextArea(5,20);
        JLabel label = new JLabel("message");
        JPanel  panel = new JPanel();
        JScrollPane scrollpane = new JScrollPane(textarea);
        
        panel.setBackground(Color.BLUE);
        panel.add(label);
        panel.add(scrollpane);
        frame.add(panel);
        frame.setSize(2000,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        

        
        
        
        
    }
}
