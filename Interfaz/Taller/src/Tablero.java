import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tablero implements ActionListener{
    JFrame ventana; // Etiqueta para crear la ventana
    JLabel casillas [][] = new JLabel[25][25];
    JLabel casillaJLabel;

    JButton botonSiguiente;
    JPanel panelBotones;

    JLabel c0,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11; 
    Color base, base2;

    public Tablero(){
        ventana = new JFrame("Mapa"); //inicializa la ventana y le da el nombre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Hace que la "x" cierre la ventana
        agregarComponentes();
        agregarMapa();
        ventana.pack(); //Necesario para hacer la ventana 
        ventana.setVisible(true); //Hace la ventana visible 
    }
        
    public void agregarComponentes(){
    ventana.setLayout(new GridLayout(25,25)); //Se define el tamaño
    ///for para agregar paneles.
    for (int j=0;j<25;j++){
        for(int i=0;i<25;i++){
            JLabel casillaJLabel = new JLabel();
            //casillaJLabel.setBackground(new Color(20,100,70));  ///se asigna un color.
            Border borde;
            borde = BorderFactory.createLineBorder(Color.black);  ///se le pone un borde.
           //casillaJLabel.setText("("+j+","+i+")");
            casillaJLabel.setBorder(borde);
            casillas[i][j] = casillaJLabel;
            ventana.add(casillaJLabel); ///Se agrega el panel a la cuadricula una vez que tiene color y borde.
        }    
    }
    }
    public void agregarMapa(){
        //se agrega la base al mapa 
        base=new Color(255, 204, 0); base2=new Color(102, 51, 0);//Definicion del color de las casillas de la base
        c0= new JLabel(""); c1= new JLabel(""); c2= new JLabel(""); c3= new JLabel(""); c4= new JLabel(""); c5= new JLabel("");
        c6= new JLabel(""); c7= new JLabel(""); c8= new JLabel(""); c9= new JLabel("");c10= new JLabel(""); c11= new JLabel("");
        c0.setOpaque(true); c1.setOpaque(true); c2.setOpaque(true); c3.setOpaque(true); c4.setOpaque(true); c5.setOpaque(true);
        c6.setOpaque(true); c7.setOpaque(true); c8.setOpaque(true);c9.setOpaque(true);c10.setOpaque(true);c11.setOpaque(true);
        c0.setBackground(base2); c1.setBackground(base); c2.setBackground(base); c3.setBackground(base2); c4.setBackground(base); c10.setBackground(base);
        c5.setBackground(base2); c6.setBackground(base); c7.setBackground(base2); c8.setBackground(base); c9.setBackground(base2); c11.setBackground(base2);
        ventana.add(c0); ventana.add(c2); ventana.add(c3);ventana.add(c4);ventana.add(c5); ventana.add(c6);ventana.add(c7);
        ventana.add(c8); ventana.add(c9); ventana.add(c10);ventana.add(c11); ventana.add(c1);

        //Se agrega el boton
        botonSiguiente = new JButton("Siguiente");
        botonSiguiente.setBackground(new Color(0,0,0));
        botonSiguiente.addActionListener(this);
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 1));
        panelBotones.add(botonSiguiente);
        ventana.add(panelBotones, BorderLayout.CENTER);
    }

    @Override //Se tiene para la implementación de las acciones del boton
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
