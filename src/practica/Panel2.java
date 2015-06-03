package practica;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;

public class Panel2 extends JPanel implements ActionListener{
    
    JLabel texto = new JLabel();
    JLabel texto1 = new JLabel();
    JLabel texto2 = new JLabel();
    JLabel tganancia = new JLabel(); 
    
    JButton botongan;
    ImageIcon fondo2;
    
    Integer max;
    Integer totalcobro;
    Integer ganancia;
    Integer envio;
    
    public int Panel2(int mas){
        max=mas;
        return envio;
    } 
    
    public Panel2(String str, int valorp, int maxf){
        
        setLayout(null);
        max = maxf;
        envio = valorp * max;
        totalcobro = max * 1000;
        botongan = new JButton("Conocer ganancia");
         
        texto.setText("La capacidad maxima de flores que puede");
        texto1.setText("llegar a "+ str +" es de  " + max + " tallos y el costo" );
        texto2.setText("devengado por estos es de:  "+totalcobro+"$");
         
        texto1.setFont(new Font("Arial",0,22));
        texto1.setForeground(Color.WHITE);
        texto.setFont(new Font("Arial",0,22));         texto.setForeground(Color.WHITE);
        texto2.setFont(new Font("Arial",0,22));
        texto2.setForeground(Color.WHITE);
        
        botongan.setFont(new Font("Arial",0,17));
        
        add(texto).setBounds(20,160,680,30);
        add(texto1).setBounds(20,190,680,30);
        add(texto2).setBounds(20,220,680,30);
        add(botongan).setBounds(24,294,180,33);
        
        botongan.addActionListener(this); 
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botongan){
         ganancia = totalcobro - envio;     
         tganancia.setText("La ganancia total obtenida fue de: "+ ganancia+"$");
         JOptionPane.showMessageDialog(null,tganancia ,"Ganancia",
                                      JOptionPane.INFORMATION_MESSAGE);

        }          
    }
    
    public void paint(Graphics g) {
        Dimension tamanio = getSize();
        fondo2 = new ImageIcon(getClass().getResource("/images/g.PNG"));
        g.drawImage(fondo2.getImage(),0,0, tamanio.width,tamanio.height,null);
        setOpaque(false);
        super.paint(g);
    }
   
}
