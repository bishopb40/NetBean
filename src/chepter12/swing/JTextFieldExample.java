
package chepter12.swing;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldExample {
    public static void main(String args[]){
        JFrame frame = new JFrame("Button Demo");
        JTextField textfield = new JTextField(10);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(textfield);
        frame.setVisible(true);
    }
    
}
