
package chepter12.swing;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
public class JCheckBox {
    public static void main(String args[]){
        JFrame frame = new JFrame("Check box demo");
        JCheckBox checkbox = new JCheckBox("Accept Term and conditions");
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(checkbox);
        frame.setVisible(true);
    }   
        
    }

