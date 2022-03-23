import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class Tablero{
    JFrame ventana; // Etiqueta para crear la ventana
    JPanel panelBotones;//Se hace el panel de botones
    ImageIcon colmena; // Crea la imagen colmena

    JLabel imagen; //Se crea la etiqueta de la iamgen
    JPanel panelImagen; //Se debe hacer el panel para que aparezco la imagen en la ventana
    JButton siguiente; //Se hace el boton 
    JButton botonSiguiente;

    Color casillas;

    public Tablero(){
        ventana = new JFrame("Mapa"); //inicializa la ventana y le da el nombre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Hace que la "x" cierre la ventana
        //agregarComponentes();
        agregarColmena();
        ventana.setPreferredSize(new Dimension(1050,750));
        ventana.setLocationRelativeTo(null);
        ventana.pack(); //Necesario para hacer la ventana 
        ventana.setVisible(true); //Hace la ventana visible 
    }
        
    public void agregarComponentes(){
    ventana.setLayout(new GridLayout(25,25)); //Se define el tamaño
    ///for para agregar paneles.
    for(int i=0;i<25*25;i++){
        JPanel panel=new JPanel();
        panel.setBackground(new Color(20,100,70));  ///se asigna un color.
        Border borde;
        borde = BorderFactory.createLineBorder(Color.black);  ///se le pone un borde.
        panel.setBorder(borde);
        ventana.add(panel); ///Se agrega el panel a la cuadricula una vez que tiene color y borde.
        
    }
    }
    public void agregarColmena(){
        colmena = new ImageIcon("imagenes/descarga.jpg"); //Crea la imagen, debe colocarse la ruta de donde se guardo
        imagen = new JLabel(colmena); //Se agrega la imagen a la ventana usando la etiqueta
        panelImagen = new JPanel();
        panelImagen.add(imagen, BorderLayout.CENTER); //Se añade la imagen en el panel y donde se quiere colocar
        ventana.add(panelImagen, BorderLayout.CENTER); //Agrega el panel a la ventana
        botonSiguiente = new JButton("Siguiente"); //Se hace la instancia para crear el nuevo boton
        panelBotones = new JPanel(); //Invoca al constructor y hace el boton
        panelBotones.setLayout(new GridLayout(18, 2)); //Da las coordenadas del boton y su tamaño, se pone en una columna y se coloca el numero de columnas
        panelBotones.add(botonSiguiente); //Agrega el boton
        ventana.add(panelBotones, BorderLayout.WEST);
    }
     
}

