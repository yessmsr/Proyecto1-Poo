import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class Tablero{
    JFrame ventana; // Etiqueta para crear la ventana
    JLabel casillas [][] = new JLabel[25][25];
    JLabel casillaJLabel;


    public Tablero(){
        ventana = new JFrame("Mapa"); //inicializa la ventana y le da el nombre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Hace que la "x" cierre la ventana
        agregarComponentes();
        ventana.setPreferredSize(new Dimension(1050,750));
        ventana.setLocationRelativeTo(null);
        ventana.pack(); //Necesario para hacer la ventana 
        ventana.setVisible(true); //Hace la ventana visible 
    }
        
    public void agregarComponentes(){
    ventana.setLayout(new GridLayout(25,25)); //Se define el tamaÃ±o
    ///for para agregar paneles.
    for (int j=0;j<24;j++){
        for(int i=0;i<25;i++){
            JLabel casillaJLabel = new JLabel();
            casillaJLabel.setBackground(new Color(20,100,70));  ///se asigna un color.
            Border borde;
            borde = BorderFactory.createLineBorder(Color.black);  ///se le pone un borde.
            casillaJLabel.setBorder(borde);
            casillas[i][j] = casillaJLabel;
            ventana.add(casillaJLabel); ///Se agrega el panel a la cuadricula una vez que tiene color y borde.
        }    
        }
    }
     
}

