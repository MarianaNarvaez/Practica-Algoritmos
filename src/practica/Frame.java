
package practica;
import java.util.Scanner;
import javax.swing.JFrame;

public class Frame extends JFrame {  
    
    public Frame(){
        
     setSize(700,440);
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Panel Panel = new Panel();
     
     add(Panel);   
    }   
}
