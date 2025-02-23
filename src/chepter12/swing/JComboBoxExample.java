
package chepter12.swing;
import javax.swing.JFrame;
import javax.swing.JComboBox;

public class JComboBoxExample {
    public static void main(String args[]){
        
        String [] countries = {"Nigeria","Ghana","Togo","Norway",
        "belgium","USA","china"};
        JFrame frame = new JFrame("Combo box demo");
        JComboBox<String> combobox = new JComboBox<>(countries);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(combobox);
        frame.setVisible(true);
        
    }
    
}
