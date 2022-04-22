import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz implements ActionListener{
    JFrame ventana; // Etiqueta para crear la ventana
    JLabel casillas [][] = new JLabel[30][30];
    JLabel casillaJLabel,recurso1,recurso2,recurso3,recurso4,recurso5,recurso6,recurso7, recurso8;
    JLabel amenaza1,amenaza2,amenaza3,amenaza4,amenaza5,amenaza6,amenaza7,recurso9,recurso10;
    JLabel ob1, ob2, ob3, ob4, ob5, ob6, ob7, abejaDef1, abejaDef2, abejaDef3, abeja4, abeja5, abeja6;
    JButton botonSiguiente, botonObjetos;
    JPanel panelBotones, panelBotones1;
    private int player;
    JLabel c0,c1,c2,c3; 
    Color base, base2;

    public Interfaz(JLabel recurso12){
        ventana = new JFrame("Mapa"); //inicializa la ventana y le da el nombre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Hace que la "x" cierre la ventana
        agregarComponentes();
        agregarMapa();
        ventana.getContentPane().setBackground(new Color(204, 255, 230));
        ventana.pack(); //Necesario para hacer la ventana 
        ventana.setVisible(true); //Hace la ventana visible 
    }
    public void agregarComponentes(){
    ventana.setLayout(new GridLayout(30,25)); //Se define el tamaño
    for (int j=0;j<30;j++){
        for(int i=0;i<25;i++){
            JLabel casillaJLabel = new JLabel();
            Border borde;
            borde = BorderFactory.createLineBorder(Color.black);  ///se le pone un borde.
            //casillaJLabel.setText("("+i+","+j+")");
            casillaJLabel.setBorder(borde);
            casillaJLabel.setFont(new Font("Serif", Font.PLAIN, 19));
            casillas[i][j] = casillaJLabel;
            ventana.add(casillaJLabel); ///Se agrega el panel a la cuadricula una vez que tiene color y borde.
        } 
    }
    }
    public void agregarMapa(){
        base=new Color(255, 204, 0); base2=new Color(102, 51, 0);//Definicion del color de las casillas de la base
        c0= new JLabel(""); c1= new JLabel(""); c2= new JLabel(""); c3= new JLabel("");
        c0.setOpaque(true); c1.setOpaque(true); c2.setOpaque(true); c3.setOpaque(true);
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
    @Override //Se tiene para la implementación de las acciones del boton
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(botonObjetos)){
            casillas[10][0].setText("   🌸"); casillas[10][0].setForeground(Color.red);casillas[11][0].setText("   🌸"); casillas[11][0].setForeground(Color.red);
            casillas[12][1].setText("   🌸"); casillas[12][1].setForeground(Color.red);
            casillas[11][1].setText("   🌸"); casillas[11][1].setForeground(Color.red);recurso1=casillas[11][1];
            casillas[0][5].setText("   🌸"); casillas[0][5].setForeground(Color.red);
            casillas[24][3].setText("   🌸"); casillas[24][3].setForeground(Color.red);
            casillas[24][4].setText("   🌸"); casillas[24][4].setForeground(Color.red);
            casillas[23][3].setText("   🌸"); casillas[23][3].setForeground(Color.red);recurso2=casillas[23][3];
            casillas[10][5].setText("   🌸"); casillas[10][5].setForeground(Color.red);
            casillas[10][6].setText("   🌸"); casillas[10][6].setForeground(Color.red);
            casillas[11][6].setText("   🌸"); casillas[11][6].setForeground(Color.red);
            casillas[9][5].setText("   🌸"); casillas[9][5].setForeground(Color.red);recurso3=casillas[9][5];
            casillas[0][12].setText("   🌸"); casillas[0][12].setForeground(Color.red);
            casillas[24][11].setText("   🌸"); casillas[24][11].setForeground(Color.red);
            casillas[24][10].setText("   🌸"); casillas[24][10].setForeground(Color.red);
            casillas[23][10].setText("   🌸"); casillas[23][10].setForeground(Color.red);recurso4=casillas[23][10];
            casillas[18][15].setText("   🌸"); casillas[18][15].setForeground(Color.red);
            casillas[18][16].setText("   🌸"); casillas[18][16].setForeground(Color.red);
            casillas[19][16].setText("   🌸"); casillas[19][16].setForeground(Color.red);
            casillas[17][15].setText("   🌸"); casillas[17][15].setForeground(Color.red);recurso5=casillas[17][15];
            casillas[12][20].setText("   🌸"); casillas[12][20].setForeground(Color.red);
            casillas[12][21].setText("   🌸"); casillas[12][21].setForeground(Color.red);
            casillas[13][21].setText("   🌸"); casillas[13][21].setForeground(Color.red);
            casillas[11][20].setText("   🌸"); casillas[11][20].setForeground(Color.red);recurso6=casillas[11][20];
            casillas[10][27].setText("   🌸"); casillas[10][27].setForeground(Color.red);
            casillas[10][28].setText("   🌸"); casillas[10][28].setForeground(Color.red);
            casillas[11][28].setText("   🌸"); casillas[11][28].setForeground(Color.red);
            casillas[9][27].setText("   🌸"); casillas[9][27].setForeground(Color.red);recurso7=casillas[9][27];
            casillas[3][10].setText("   🌸"); casillas[3][10].setForeground(Color.red);
            casillas[2][10].setText("   🌸"); casillas[2][10].setForeground(Color.red);
            casillas[2][9].setText("   🌸"); casillas[2][9].setForeground(Color.red);
            casillas[1][9].setText("   🌸"); casillas[1][9].setForeground(Color.red);recurso8=casillas[1][9];
            casillas[21][24].setText("   🌸"); casillas[21][24].setForeground(Color.red);
            casillas[20][24].setText("   🌸"); casillas[20][24].setForeground(Color.red);
            casillas[20][23].setText("   🌸"); casillas[20][23].setForeground(Color.red);
            casillas[19][23].setText("   🌸"); casillas[19][23].setForeground(Color.red);recurso9=casillas[19][23];
            //Se agregan los obtaculos
            casillas[18][9].setText("   💀");casillas[18][9].setForeground(Color.black);
            casillas[18][10].setText("   💀");casillas[18][10].setForeground(Color.black);
            casillas[19][10].setText("   💀");casillas[19][10].setForeground(Color.black);
            casillas[17][9].setText("   💀");casillas[17][9].setForeground(Color.black); amenaza1=casillas[17][9];
            casillas[11][14].setText("   💀");casillas[11][14].setForeground(Color.black);
            casillas[11][15].setText("   💀");casillas[11][15].setForeground(Color.black);
            casillas[12][15].setText("   💀");casillas[12][15].setForeground(Color.black);
            casillas[10][14].setText("   💀");casillas[10][14].setForeground(Color.black); amenaza2=casillas[10][14];
            casillas[0][21].setText("   💀");casillas[0][21].setForeground(Color.black);
            casillas[0][22].setText("   💀");casillas[0][22].setForeground(Color.black);
            casillas[1][22].setText("   💀");casillas[1][22].setForeground(Color.black);
            casillas[24][20].setText("   💀");casillas[24][20].setForeground(Color.black); amenaza3=casillas[24][20];
            casillas[18][3].setText("   💀");casillas[18][3].setForeground(Color.black);
            casillas[18][4].setText("    💀");casillas[18][4].setForeground(Color.black);
            casillas[19][4].setText("   💀");casillas[19][4].setForeground(Color.black);
            casillas[17][3].setText("   💀");casillas[17][3].setForeground(Color.black); amenaza4=casillas[17][3];
            casillas[16][15].setText("   💀");casillas[16][15].setForeground(Color.black);
            casillas[16][16].setText("   💀");casillas[16][16].setForeground(Color.black);
            casillas[17][16].setText("   💀");casillas[17][16].setForeground(Color.black);
            casillas[15][15].setText("   💀");casillas[15][15].setForeground(Color.black); amenaza5=casillas[15][15];
            casillas[18][27].setText("   💀");casillas[18][27].setForeground(Color.black);
            casillas[18][28].setText("  💀");casillas[18][28].setForeground(Color.black);
            casillas[19][28].setText("   💀");casillas[19][28].setForeground(Color.black);
            casillas[17][27].setText("   💀");casillas[17][27].setForeground(Color.black); amenaza6=casillas[17][27];
            casillas[2][0].setText("   💀");casillas[2][0].setForeground(Color.black);
            casillas[2][1].setText("   💀");casillas[2][1].setForeground(Color.black);
            casillas[3][1].setText("   💀");casillas[3][1].setForeground(Color.black);
            casillas[1][0].setText("   💀");casillas[1][0].setForeground(Color.black); amenaza7=casillas[1][0];
            //Abejas
            casillas[0][0].setText("  🐝");casillas[0][0].setForeground(Color.orange); abejaDef1=casillas[0][0];
            casillas[10][3].setText("  🐝"); casillas[10][3].setForeground(Color.orange); abejaDef2=casillas[10][3];
            casillas[9][0].setText("  🐝");casillas[9][0].setForeground(Color.orange); abejaDef3=casillas[9][0];
            casillas[9][3].setText("  🐝"); abeja4=casillas[9][3];
            casillas[21][9].setText("  🐝"); abeja5=casillas[21][9];
            casillas[5][2].setText("  🐝"); abeja6=casillas[5][2];
        }
        if(e.getSource().equals(botonSiguiente)){
            player=player+1;
            switch(player){
                case 0:
                casillas[0][0].setText("  🐝");casillas[0][0].setForeground(Color.orange); abejaDef1=casillas[0][0];
                break;
                case 1:
                    casillas[0][0].setText("  ");
                    casillas[1][1].setText("  🐝");casillas[1][1].setForeground(Color.orange); abejaDef1=casillas[1][1];
                break;
                case 2:
                    casillas[1][1].setText("  ");
                    casillas[2][1].setText("  🐝");casillas[2][1].setForeground(Color.orange); abejaDef1=casillas[2][1];
                break;
                case 3:
                    casillas[2][1].setText("   💀");casillas[2][1].setForeground(Color.black);
                    casillas[3][2].setText("  🐝");casillas[3][2].setForeground(Color.orange); abejaDef1=casillas[3][2];
                break;
                case 4:
                    casillas[3][2].setText("  ");
                    casillas[4][3].setText("  🐝");casillas[4][3].setForeground(Color.orange); abejaDef1=casillas[4][3];
                break;
                case 5:
                    casillas[4][3].setText("  ");
                    casillas[5][4].setText("  🐝");casillas[5][4].setForeground(Color.orange); abejaDef1=casillas[5][4];
                break;
                case 6:
                    casillas[5][4].setText("  ");
                    casillas[6][4].setText("  🐝");casillas[6][4].setForeground(Color.orange); abejaDef1=casillas[6][4];
                break;
                case 7:
                    casillas[6][4].setText("  ");
                    casillas[7][5].setText("  🐝");casillas[7][5].setForeground(Color.orange); abejaDef1=casillas[7][5];
                break;
                case 8:
                    casillas[7][5].setText("  ");
                    casillas[8][6].setText("  🐝");casillas[8][6].setForeground(Color.orange); abejaDef1=casillas[8][6];
                break;
                case 9:
                    casillas[8][6].setText("  ");
                    casillas[9][7].setText("  🐝");casillas[9][7].setForeground(Color.orange); abejaDef1=casillas[9][7];
                break;
                case 10:
                    casillas[9][7].setText("  ");
                    casillas[10][8].setText("  🐝");casillas[10][8].setForeground(Color.orange); abejaDef1=casillas[10][8];
                break;
                case 11:
                    casillas[10][8].setText("  ");
                    casillas[12][10].setText("  🐝");casillas[12][10].setForeground(Color.orange); abejaDef1=casillas[12][10];
                break;
                case 12:
                    casillas[12][10].setText("  ");
                    casillas[14][12].setText("  🐝");casillas[14][12].setForeground(Color.orange); abejaDef1=casillas[14][12];
                break;
                case 13:
                    casillas[14][12].setText("  ");
                    casillas[16][14].setText("  🐝");casillas[16][14].setForeground(Color.orange); abejaDef1=casillas[16][14];
                break;
                case 14:
                    casillas[16][14].setText("  "); 
                    casillas[17][15].setText("  🐝");casillas[17][15].setForeground(Color.orange); abejaDef1=casillas[17][15];
                    casillas[18][15].setText("   "); 
                    casillas[18][16].setText("   ");casillas[19][16].setText("   ");
                    casillas[3][22].setText("   🌸");casillas[3][22].setForeground(Color.red);
                    casillas[2][21].setText("   🌸"); casillas[2][21].setForeground(Color.red);
                    casillas[3][21].setText("   🌸"); casillas[3][21].setForeground(Color.red);
                    casillas[4][22].setText("   🌸"); casillas[4][22].setForeground(Color.red);recurso5=casillas[4][22];
                break;
                case 15:
                    casillas[17][15].setText("  ");
                    casillas[20][18].setText("  🐝");casillas[20][18].setForeground(Color.orange); abejaDef1=casillas[20][18];
                break;
                case 16:
                    casillas[20][18].setText("  ");
                    casillas[22][19].setText("  🐝");casillas[22][19].setForeground(Color.orange); abejaDef1=casillas[22][19];
                break;
                case 17:
                    casillas[22][19].setText("  ");
                    casillas[24][20].setText("  🐝");casillas[24][20].setForeground(Color.orange); abejaDef1=casillas[24][20];
                break;
                case 18:
                    casillas[24][20].setText("   💀"); casillas[24][20].setForeground(Color.black);
                    casillas[1][23].setText("  🐝");casillas[1][23].setForeground(Color.orange); abejaDef1=casillas[1][23];
                break;
                case 19:
                    casillas[1][23].setText("  ");
                    casillas[3][24].setText("  🐝");casillas[3][24].setForeground(Color.orange); abejaDef1=casillas[3][24];
                case 20:
                    casillas[3][24].setText("  ");
                    casillas[5][25].setText("  🐝");casillas[5][25].setForeground(Color.orange); abejaDef1=casillas[5][25];
                break;
                case 21:
                    casillas[5][25].setText("  ");
                    casillas[7][26].setText("  🐝");casillas[7][26].setForeground(Color.orange); abejaDef1=casillas[7][26];
                break;
                case 22:
                    casillas[7][26].setText("  ");
                    casillas[9][27].setText("  🐝");casillas[9][27].setForeground(Color.orange); abejaDef1=casillas[9][27];
                    casillas[10][27].setText("   "); 
                    casillas[10][28].setText("   ");casillas[11][28].setText("   ");
                    casillas[24][12].setText("   🌸");casillas[24][12].setForeground(Color.red);
                    casillas[0][13].setText("   🌸"); casillas[0][13].setForeground(Color.red);
                    casillas[0][14].setText("   🌸"); casillas[0][14].setForeground(Color.red);
                    casillas[1][14].setText("   🌸"); casillas[1][14].setForeground(Color.red);recurso7=casillas[4][22];
                break;
                case 23:
                    casillas[9][27].setText("  ");
                    casillas[11][27].setText("  🐝");casillas[11][27].setForeground(Color.orange); abejaDef1=casillas[11][27];
                break;
                case 24:
                    casillas[11][27].setText("  ");
                    casillas[13][27].setText("  🐝");casillas[13][27].setForeground(Color.orange); abejaDef1=casillas[13][27];
                break;
                case 25:
                    casillas[13][27].setText("  ");
                    casillas[15][27].setText("  🐝");casillas[15][27].setForeground(Color.orange); abejaDef1=casillas[15][27];
                break;
                case 26:
                    casillas[15][27].setText("  ");
                    casillas[17][27].setText("  🐝");casillas[17][27].setForeground(Color.orange); abejaDef1=casillas[17][27];
                break;
                case 27:
                    casillas[17][27].setText("   💀");casillas[17][27].setForeground(Color.black);
                    casillas[19][27].setText("  🐝");casillas[19][27].setForeground(Color.orange); abejaDef1=casillas[19][27];
                break;
                case 28:
                    casillas[19][27].setText("   ");
                    casillas[21][27].setText("  🐝");casillas[21][27].setForeground(Color.orange); abejaDef1=casillas[21][27];
                break;
                case 29:
                    casillas[21][27].setText("   ");
                    casillas[23][27].setText("  🐝");casillas[23][27].setForeground(Color.orange); abejaDef1=casillas[23][27];
                break;
                case 30:
                    casillas[23][27].setText("   ");
                    casillas[24][28].setText("  🐝");casillas[24][28].setForeground(Color.orange); abejaDef1=casillas[24][28];
                break;
                case 31:
                    casillas[24][28].setText("   ");
                    JOptionPane.showMessageDialog(ventana, "¡Ha ingresado a la base una abeja!");
                break;
            }       
        }
    }
}
