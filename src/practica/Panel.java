
package practica;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;


public class Panel extends JPanel implements ActionListener{
    
    ImageIcon imagen;
    JButton botonac;
    JComboBox ciudades;
    Integer nodofin;
    Integer valorp = 0;
    Integer max = 0;
    Algoritmos algo;
    
    public Panel(){
        
        String [] palabras = {"Panama","Mexico","EE.UU.","Canada","Nicaragua",
                              "Camerun","Brasil","Nigeria","Francia","Japon",
                              "China","Chile","Egipto","España"};
        
        ciudades = new JComboBox(palabras);
        setBackground(new Color(240,221,127));
        setLayout(null);
        botonac=new JButton("Aceptar");

        ciudades.setFont(new Font("Arial",0,21));
        ciudades.setBackground(new Color(255,255,255));
        
        add(ciudades).setBounds(310,236,120,22);
        add(botonac).setBounds(310,284,120,22);
        
        botonac.addActionListener(this);    
        
    }
   
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botonac){
            
            switch((String)ciudades.getSelectedItem()){
                
                case "Panama":
                    nodofin = 2;
                    valorp = 300; 
                    break;
                case "Mexico":
                    nodofin = 3;
                    valorp = 300; 
                    break;
                case "EE.UU.":
                    nodofin = 4;
                    valorp = 300;
                    break;
                case "Canada":
                    nodofin = 5;
                    valorp = 300;
                    break;
                case "Nicaragua":
                    nodofin = 6;
                    valorp = 300;
                    break;
                case "Camerun":
                    nodofin = 7;
                    valorp = 450;
                    break;
                case "Brasil":
                    nodofin = 8;
                    valorp = 300;
                    break;
                case "Nigeria":
                    nodofin = 9;
                    valorp = 450;
                    break;
                case "Francia":
                    nodofin = 10;
                    valorp = 500;
                    break;
                case "Japon":
                    nodofin = 11;
                    valorp = 800;
                    break;    
                case "China":
                    nodofin = 12;
                    valorp = 800;
                    break; 
                case "Chile":
                    nodofin = 13;
                    valorp = 300;
                    break; 
                case "Egipto":
                    nodofin = 14;
                    valorp = 450;
                    break;     
                 case "España":
                    nodofin = 15;
                    valorp = 500;
                    break;    
            }
            
            algo = new Algoritmos();
            int maxf = algo.max(nodofin);
                        
            Frame2 f2 = new Frame2((String)ciudades.getSelectedItem(), valorp, 
                        maxf);
            f2.setVisible(true);

    
        }          
    }
    
     public void paint(Graphics g) {
        Dimension tamanio = getSize();
        imagen = new ImageIcon(getClass().getResource("/images/f1.PNG"));
        g.drawImage(imagen.getImage(), 0, 0, tamanio.width, tamanio.height,
                    null);
        setOpaque(false);
        super.paint(g);
    }
                 
}


  
    

