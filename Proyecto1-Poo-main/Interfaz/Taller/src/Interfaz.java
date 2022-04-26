import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz implements ActionListener{
    JFrame ventana; // Etiqueta para crear la ventana
    static JLabel casillas [][] = new JLabel[30][30];
    static JLabel casillaJLabel;
    static JLabel recurso1; static JLabel recurso2;static JLabel recurso3;
    static JLabel recurso4;static JLabel recurso5;static JLabel recurso6;
    static JLabel recurso7;static JLabel recurso8;static JLabel amenaza1;static JLabel amenaza2;
    static JLabel amenaza3;static JLabel amenaza4;static JLabel amenaza5;
    static JLabel amenaza6;static JLabel amenaza7;static JLabel recurso9;JLabel recurso10;
    JLabel ob1, ob2, ob3, ob4, ob5, ob6, ob7; //objetos
    static JLabel abejaDef1;static JLabel abejaDef2;static JLabel abejaDef3;
    static JLabel abeja4;static JLabel abeja5;static JLabel abeja6;
    JButton botonSiguiente, botonObjetos;
    JPanel panelBotones, panelBotones1;
    JLabel c0,c1,c2,c3; 
    Color base, base2;

    public Interfaz(JLabel recurso12){
        ventana = new JFrame("Mapa"); //inicializa la ventana y le da el nombre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        agregarComponentes();
        agregarMapa();
        ventana.getContentPane().setBackground(new Color(204, 255, 230));
        ventana.pack(); //Necesario para hacer la ventana 
        ventana.setVisible(true); 
    }
    public void agregarComponentes(){
    ventana.setLayout(new GridLayout(30,25)); //Se define el tamaño
    for (int j=0;j<30;j++){
        for(int i=0;i<25;i++){
            JLabel casillaJLabel = new JLabel();
            Border borde;
            borde = BorderFactory.createLineBorder(Color.black);  ///se le pone un borde.
            casillaJLabel.setBorder(borde);
            casillaJLabel.setFont(new Font("Serif", Font.PLAIN, 19));
            casillas[i][j] = casillaJLabel;
            ventana.add(casillaJLabel); ///Se agrega el panel a la cuadricula una vez que tiene color y borde.
        } 
    }
    }
    public void agregarMapa(){
        base=new Color(255, 204, 0); base2=new Color(102, 51, 0);//Definicion del color de las casillas de la base
        c0= new JLabel(""); c1= new JLabel(""); c2= new JLabel(""); 
        c3= new JLabel("");
        c0.setOpaque(true); c1.setOpaque(true); c2.setOpaque(true);
        c3.setOpaque(true);
        c0.setBackground(base2); c1.setBackground(base); c2.setBackground(base); c3.setBackground(base2); 
        ventana.add(c0); ventana.add(c2); ventana.add(c3);
        //Se agregan los obstaculos
        casillas[6][20].setText("   🚫");casillas[6][20].setForeground(Color.red);
        casillas[7][20].setText("   🚫");casillas[7][20].setForeground(Color.red);
        casillas[7][21].setText("   🚫");casillas[7][21].setForeground(Color.red);
        casillas[8][21].setText("   🚫");casillas[8][21].setForeground(Color.red); ob1=casillas[8][21];
        casillas[6][5].setText("   🚫");casillas[6][5].setForeground(Color.red);
        casillas[6][6].setText("   🚫");casillas[6][6].setForeground(Color.red);
        casillas[7][6].setText("   🚫");casillas[7][6].setForeground(Color.red);
        casillas[5][5].setText("   🚫");casillas[5][5].setForeground(Color.red); ob2=casillas[5][5];
        casillas[18][0].setText("   🚫");casillas[18][0].setForeground(Color.red);
        casillas[18][1].setText("   🚫");casillas[18][1].setForeground(Color.red);
        casillas[19][1].setText("   🚫");casillas[19][1].setForeground(Color.red);
        casillas[17][0].setText("   🚫");casillas[17][0].setForeground(Color.red); ob3=casillas[17][0];
        casillas[4][28].setText("   🚫");casillas[4][28].setForeground(Color.red);
        casillas[3][28].setText("   🚫");casillas[3][28].setForeground(Color.red);
        casillas[3][27].setText("   🚫");casillas[3][27].setForeground(Color.red);
        casillas[2][27].setText("   🚫");casillas[2][27].setForeground(Color.red); ob4=casillas[2][27];
        casillas[8][1].setText("   🚫");casillas[8][1].setForeground(Color.red);
        casillas[7][1].setText("   🚫");casillas[7][1].setForeground(Color.red);
        casillas[7][0].setText("   🚫");casillas[7][0].setForeground(Color.red);
        casillas[6][0].setText("   🚫");casillas[6][0].setForeground(Color.red); ob5=casillas[6][0];
        casillas[23][15].setText("   🚫");casillas[23][15].setForeground(Color.red);
        casillas[22][15].setText("   🚫");casillas[22][15].setForeground(Color.red);
        casillas[22][14].setText("   🚫");casillas[22][14].setForeground(Color.red);
        casillas[21][14].setText("   🚫");casillas[21][14].setForeground(Color.red); ob6=casillas[21][14];
        casillas[24][29].setText("   🚫");casillas[24][29].setForeground(Color.red);
        casillas[23][29].setText("   🚫");casillas[23][29].setForeground(Color.red);
        casillas[23][28].setText("   🚫");casillas[23][28].setForeground(Color.red);
        casillas[22][28].setText("   🚫");casillas[22][28].setForeground(Color.red); ob7=casillas[22][28];
        //Se agrega el boton
        panelBotones1 = new JPanel();
        panelBotones1.setLayout(new GridLayout(1, 1));
        botonObjetos = new JButton("💡");
        botonObjetos.setBackground(new Color(0, 204, 153));
        botonObjetos.addActionListener(this);
        panelBotones1.add(botonObjetos);
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 1));
        botonSiguiente = new JButton("←");
        botonSiguiente.addActionListener(this);
        panelBotones.add(botonSiguiente);
        ventana.add(panelBotones, BorderLayout.CENTER);
        ventana.add(panelBotones1, BorderLayout.CENTER);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    }
}
