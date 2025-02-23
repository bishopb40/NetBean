
package chepter12.swing;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class MenuBarItemExample {
    public static void main(String args[]){
        JFrame frame = new JFrame("Menu Bar Item demo");
        JMenuBar menubar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("edit");
        JMenu menu3 = new JMenu("view");
        JMenu menu4 = new JMenu("Navigate");
        JMenu menu5 = new JMenu("Source");
        
        JMenuItem newproject = new JMenuItem("New Project..");
        JMenuItem newfile = new JMenuItem("newFile..");
        
        menu1.add(newproject);
        menu1.add(newfile);
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);
        menubar.add(menu5);
       frame.setJMenuBar(menubar);
       
       frame.setSize(2000,1000);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
}
