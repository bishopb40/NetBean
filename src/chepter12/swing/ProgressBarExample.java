
package chepter12.swing;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class ProgressBarExample {
    public static void main(String args[]){
        JFrame frame = new JFrame("Progress Bar demo");
        
        JProgressBar progressBar = new JProgressBar(0,100);
        progressBar.setValue(40);
        
        progressBar.setStringPainted(true);
        frame.add(progressBar);
        frame.setSize(2000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
    }
}
