
package chepter12.swing;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class JTabbedpaneExample {
    public static void main(String args[]){
        JFrame frame = new JFrame("Tabbed Pane Example demo");
        JTabbedPane tabPane = new JTabbedPane();
        JLabel label = new JLabel("content 1");
        JLabel label2 = new JLabel("content 2");
        
        JPanel panel = new JPanel();
        JPanel pane2 = new JPanel();
        
        panel.add(label);
        pane2.add(label2);
        tabPane.addTab("tAP 1", panel);
        tabPane.addTab("tAP 2", pane2);
        
        frame.add(tabPane);
        frame.setSize(2000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
        
        
        
        
    }
}
