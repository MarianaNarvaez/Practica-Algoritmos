package practica;
import javax.swing.JFrame;

public class Frame2 extends JFrame{
        
    public Frame2(String str, int valorp, int maxf){


     setResizable(false);
     setSize(700,440);
     setLocationRelativeTo(null);
     
     Panel2 Panel2 = new Panel2(str, valorp, maxf);
     add(Panel2);   
    } 
}
