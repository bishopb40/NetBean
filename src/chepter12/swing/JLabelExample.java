
package chepter12.swing;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
public class JLabelExample {
    public static void main(String args[]){
        JFrame frame = new JFrame("Label Demo");
        
        JLabel label = new JLabel("learning java is fun", SwingConstants.CENTER);
        
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        
        
        
    }
    
}
