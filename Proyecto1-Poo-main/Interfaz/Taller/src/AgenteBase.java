import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AgenteBase extends Interfaz{
    public static JLabel lista[] = new JLabel[6];
    public int pos;
    private int player;
    
    public AgenteBase(int pos, JLabel[] lista){
        super(casillaJLabel);
        this.pos=pos;
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(botonObjetos)){
            Defensores.acciones1();
            Recolectores.acciones1();
            Objetos.acciones();
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
                    casillas[10][3].setText("  ");
                    casillas[14][4].setText("  🐝");casillas[14][4].setForeground(Color.orange); abejaDef2=casillas[14][4];
                    casillas[9][0].setText("  ");
                    casillas[10][0].setText("  🐝");casillas[10][0].setForeground(Color.orange); abejaDef3=casillas[10][0];
                    // Recolectores
                    casillas[9][3].setText("  ");
                    casillas[12][3].setText("  🐝");casillas[12][3].setForeground(Color.black); abeja4=casillas[12][3];
                    casillas[19][9].setText("  ");
                    casillas[23][9].setText("  🐝");casillas[23][9].setForeground(Color.black); abeja5=casillas[29][9];
                    casillas[5][2].setText("  ");
                    casillas[7][4].setText("  🐝");casillas[7][4].setForeground(Color.black); abeja6=casillas[7][4];

                break;
                case 2:
                    casillas[12][14].setText("   🌸");casillas[12][14].setForeground(Color.red);
                    casillas[13][14].setText("   🌸"); casillas[13][14].setForeground(Color.red);
                    casillas[13][15].setText("   🌸"); casillas[13][15].setForeground(Color.red);
                    casillas[14][15].setText("   🌸"); casillas[14][15].setForeground(Color.red);recurso7=casillas[4][22];
                    casillas[9][0].setText(" ");
                    casillas[10][0].setText(" ");
                    casillas[11][0].setText(" ");
                    casillas[11][1].setText(" ");
                    casillas[12][1].setText(" ");
                    casillas[1][1].setText("  ");
                    casillas[2][1].setText("  🐝");casillas[2][1].setForeground(Color.orange); abejaDef1=casillas[2][1];
                    casillas[14][4].setText("  ");
                    casillas[18][6].setText("  🐝");casillas[18][6].setForeground(Color.orange); abejaDef2=casillas[18][6];
                    casillas[13][2].setText("  ");
                    // Recolectores
                    casillas[12][3].setText("  ");
                    casillas[16][4].setText("  🐝");casillas[16][4].setForeground(Color.black); abeja4=casillas[16][4];
                    
                    casillas[23][9].setText("  ");
                    casillas[0][10].setText("  🐝");casillas[0][10].setForeground(Color.black); abeja5=casillas[0][10];

                    casillas[7][4].setText("  ");
                    casillas[10][5].setText("  🐝");casillas[10][5].setForeground(Color.black); abeja6=casillas[10][5];

                break;
                case 3:
                    casillas[2][1].setText("   💀");casillas[2][1].setForeground(Color.black);
                    casillas[3][2].setText("  🐝");casillas[3][2].setForeground(Color.orange); abejaDef1=casillas[3][2];

                    casillas[18][6].setText("  ");
                    casillas[18][4].setText("  🐝");casillas[18][4].setForeground(Color.orange); abejaDef3=casillas[18][4];
                    // Recolectores
                    casillas[9][5].setText("  ");
                    casillas[10][5].setText("  ");
                    casillas[10][6].setText("   "); 
                    casillas[11][6].setText("   ");casillas[11][28].setText("   ");
                    casillas[1][16].setText("   🌸");casillas[1][16].setForeground(Color.red);
                    casillas[2][16].setText("   🌸"); casillas[2][16].setForeground(Color.red);
                    casillas[2][17].setText("   🌸"); casillas[2][17].setForeground(Color.red);
                    casillas[3][17].setText("   🌸"); casillas[3][17].setForeground(Color.red);recurso7=casillas[4][22];
                    casillas[16][4].setText("  ");
                    casillas[20][6].setText("  🐝");casillas[20][6].setForeground(Color.black); abeja4=casillas[20][6];
                    casillas[0][10].setText("  ");
                    casillas[2][10].setText("  🐝");casillas[2][10].setForeground(Color.black); abeja5=casillas[2][10];
                    casillas[11][5].setText("  ");
                    casillas[14][6].setText("  🐝");casillas[14][6].setForeground(Color.black); abeja6=casillas[14][6];
                break;
                case 4:
                    casillas[1][9].setText("  ");
                    casillas[2][9].setText("  ");
                    casillas[3][10].setText("   "); 
                    casillas[3][2].setText("  ");
                    casillas[4][3].setText("  🐝");casillas[4][3].setForeground(Color.orange); abejaDef1=casillas[4][3];
                    casillas[21][9].setText("  ");
                    casillas[0][12].setText("  🐝");casillas[0][12].setForeground(Color.orange); abejaDef2=casillas[0][12];
                    casillas[18][4].setText("   💀"); casillas[18][4].setForeground(Color.black);
                    casillas[22][6].setText("  🐝");casillas[22][6].setForeground(Color.orange); abejaDef3=casillas[22][6];
                    // Recolectores
                    casillas[20][6].setText("  ");
                    casillas[1][10].setText("  🐝");casillas[1][10].setForeground(Color.black); abeja4=casillas[1][10];

                    casillas[2][10].setText("  ");
                    casillas[7][13].setText("  🐝");casillas[7][13].setForeground(Color.black); abeja5=casillas[7][13];

                    casillas[14][6].setText("  ");
                    casillas[17][8].setText("  🐝");casillas[17][8].setForeground(Color.black); abeja6=casillas[17][8];

                break;
                case 5:
                    casillas[24][11].setText("  ");
                    casillas[23][10].setText("  ");
                    casillas[24][10].setText("   "); 
                    casillas[4][3].setText("  ");
                    casillas[5][4].setText("  🐝");casillas[5][4].setForeground(Color.orange); abejaDef1=casillas[5][4];
                    casillas[0][12].setText("  ");
                    casillas[5][14].setText("  🐝");casillas[5][14].setForeground(Color.orange); abejaDef2=casillas[5][14];

                    casillas[22][6].setText("  ");
                    casillas[2][8].setText("  🐝");casillas[2][8].setForeground(Color.orange); abejaDef3=casillas[2][8];
                    // Recolectores
                    casillas[1][10].setText("  ");
                    casillas[6][12].setText("  🐝");casillas[6][12].setForeground(Color.black); abeja4=casillas[6][12];

                    casillas[7][13].setText("  ");
                    casillas[11][16].setText("  🐝");casillas[11][16].setForeground(Color.black); abeja5=casillas[11][16];

                    casillas[17][8].setText("  ");
                    casillas[22][13].setText("  🐝");casillas[22][13].setForeground(Color.black); abeja6=casillas[22][13];
                break;
                case 6:
                    casillas[5][4].setText("  ");
                    casillas[6][4].setText("  🐝");casillas[6][4].setForeground(Color.orange); abejaDef1=casillas[6][4];

                    casillas[5][14].setText("  ");
                    casillas[8][15].setText("  🐝");casillas[8][15].setForeground(Color.orange); abejaDef2=casillas[8][15];

                    casillas[2][8].setText("  ");
                    casillas[6][10].setText("  🐝");casillas[6][10].setForeground(Color.orange); abejaDef3=casillas[6][10];
                    // Recolectores
                    casillas[6][12].setText("  ");
                    casillas[9][15].setText("  🐝");casillas[9][15].setForeground(Color.black); abeja4=casillas[9][15];

                    casillas[11][16].setText("  ");
                    casillas[13][18].setText("  🐝");casillas[13][18].setForeground(Color.black); abeja5=casillas[13][18];

                    casillas[22][13].setText("  ");
                    casillas[0][17].setText("  🐝");casillas[0][17].setForeground(Color.black); abeja6=casillas[0][17];
                break;
                case 7:
                    casillas[6][4].setText("  ");
                    casillas[7][5].setText("  🐝");casillas[7][5].setForeground(Color.orange); abejaDef1=casillas[7][5];

                    casillas[8][15].setText("  ");
                    casillas[9][17].setText("  🐝");casillas[9][17].setForeground(Color.orange); abejaDef2=casillas[9][17];

                    casillas[6][10].setText("  ");
                    casillas[5][12].setText("  🐝");casillas[5][12].setForeground(Color.orange); abejaDef3=casillas[5][12];
                    // Recolectores
                    casillas[9][15].setText("  ");
                    casillas[13][19].setText("  🐝");casillas[13][19].setForeground(Color.black); abeja4=casillas[13][19];

                    casillas[13][18].setText("  ");
                    casillas[18][21].setText("  🐝");casillas[18][21].setForeground(Color.black); abeja5=casillas[18][21];

                    casillas[0][17].setText("  ");
                    casillas[5][20].setText("  🐝");casillas[5][20].setForeground(Color.black); abeja6=casillas[5][20];
                break;
                case 8:
                    casillas[7][5].setText("  ");
                    casillas[8][6].setText("  🐝");casillas[8][6].setForeground(Color.orange); abejaDef1=casillas[8][6];

                    casillas[9][17].setText("  ");
                    casillas[9][18].setText("  🐝");casillas[9][18].setForeground(Color.orange); abejaDef2=casillas[9][18];

                    casillas[5][12].setText("  ");
                    casillas[7][14].setText("  🐝");casillas[7][14].setForeground(Color.orange); abejaDef3=casillas[7][14];
                    // Recolectores
                    casillas[13][19].setText("  ");
                    casillas[12][20].setText("  🐝");casillas[13][20].setForeground(Color.black); abeja4=casillas[13][20];
                    casillas[18][21].setText("  ");
                    casillas[20][23].setText("  🐝");casillas[20][23].setForeground(Color.black); abeja5=casillas[20][23];
                    casillas[5][20].setText("  ");
                    casillas[10][24].setText("  🐝");casillas[10][24].setForeground(Color.black); abeja6=casillas[10][24];
                break;
                case 9:
                    casillas[19][23].setText(" ");
                    casillas[20][24].setText(" ");
                    casillas[21][24].setText(" ");
                    casillas[20][23].setText(" ");
                    casillas[8][6].setText("  ");
                    casillas[9][7].setText("  🐝");casillas[9][7].setForeground(Color.orange); abejaDef1=casillas[9][7];

                    casillas[9][18].setText("  ");
                    casillas[9][20].setText("  🐝");casillas[9][20].setForeground(Color.orange); abejaDef2=casillas[9][20];

                    casillas[7][14].setText("  ");
                    casillas[4][16].setText("  🐝");casillas[4][16].setForeground(Color.orange); abejaDef3=casillas[4][16];
                    // Recolectores
                    casillas[11][20].setText("  ");
                    casillas[12][21].setText("  ");
                    casillas[13][21].setText("   "); 
                    casillas[12][20].setText("  ");
                    casillas[17][23].setText("  🐝");casillas[17][23].setForeground(Color.black); abeja4=casillas[17][23];

                    casillas[21][23].setText("  ");
                    casillas[23][25].setText("  🐝");casillas[23][25].setForeground(Color.black); abeja5=casillas[23][25];

                    casillas[10][24].setText("  ");
                    casillas[14][26].setText("  🐝");casillas[14][26].setForeground(Color.black); abeja6=casillas[14][26];
                break;
                case 10:
                    casillas[9][7].setText("  ");
                    casillas[10][8].setText("  🐝");casillas[10][8].setForeground(Color.orange); abejaDef1=casillas[10][8];
                    casillas[9][20].setText("  ");
                    casillas[9][22].setText("  🐝");casillas[9][22].setForeground(Color.orange); abejaDef2=casillas[9][22];
                    casillas[4][16].setText("  ");
                    casillas[3][17].setText("  🐝");casillas[3][17].setForeground(Color.orange); abejaDef3=casillas[3][17];
                    // Recolectores
                    casillas[17][23].setText("  ");
                    casillas[19][25].setText("  🐝");casillas[19][25].setForeground(Color.black); abeja4=casillas[19][25];
                    casillas[23][25].setText("  ");
                    casillas[23][27].setText("  🐝");casillas[23][27].setForeground(Color.black); abeja5=casillas[23][27];
                    casillas[14][26].setText("  ");
                    casillas[16][28].setText("  🐝");casillas[16][28].setForeground(Color.black); abeja6=casillas[16][28];
                break;
                case 11:
                    casillas[10][8].setText("  ");
                    casillas[12][10].setText("  🐝");casillas[12][10].setForeground(Color.orange); abejaDef1=casillas[12][10];

                    casillas[9][22].setText("  ");
                    casillas[7][22].setText("  🐝");casillas[7][22].setForeground(Color.orange); abejaDef2=casillas[7][22];
                    casillas[1][16].setText("  ");
                    casillas[2][16].setText("  ");
                    casillas[2][17].setText("   "); 
                    casillas[3][17].setText("  ");
                    casillas[1][18].setText("  🐝");casillas[1][18].setForeground(Color.orange); abejaDef3=casillas[1][18];
                    // Recolectores
                    casillas[19][25].setText("  ");
                    casillas[22][27].setText("  🐝");casillas[22][27].setForeground(Color.black); abeja4=casillas[22][27];

                    casillas[23][27].setText("  ");
                    casillas[24][28].setText("  🐝");casillas[24][28].setForeground(Color.black); abeja5=casillas[24][28];

                    casillas[16][28].setText("  ");
                    casillas[18][29].setText("  🐝");casillas[18][29].setForeground(Color.black); abeja6=casillas[18][29];
                break;
                case 12:
                    casillas[12][10].setText("  ");
                    casillas[14][12].setText("  🐝");casillas[14][12].setForeground(Color.orange); abejaDef1=casillas[14][12];

                    casillas[7][22].setText("  ");
                    casillas[3][22].setText("  🐝");casillas[3][22].setForeground(Color.orange); abejaDef2=casillas[3][22];

                    casillas[1][18].setText("  ");
                    casillas[1][19].setText("  🐝");casillas[1][19].setForeground(Color.orange); abejaDef3=casillas[1][19];
                    // Recolectores
                    casillas[22][27].setText("  ");
                    casillas[23][27].setText("  🐝");casillas[23][27].setForeground(Color.black); abeja4=casillas[23][27];

                    casillas[24][28].setText("  ");
                    JOptionPane.showMessageDialog(ventana, "¡Ha ingresado a la base una abeja!");

                    casillas[18][29].setText("  ");
                    casillas[20][29].setText("  🐝");casillas[20][29].setForeground(Color.black); abeja6=casillas[20][29];

                
                break;
                case 13:
                    casillas[14][12].setText("  ");
                    casillas[16][14].setText("  🐝");casillas[16][14].setForeground(Color.orange); abejaDef1=casillas[16][14];

                    casillas[3][22].setText("  ");
                    casillas[2][22].setText("  🐝");casillas[2][22].setForeground(Color.orange); abejaDef2=casillas[2][22];

                    casillas[1][19].setText("  ");
                    casillas[4][22].setText("  🐝");casillas[4][22].setForeground(Color.orange); abejaDef3=casillas[4][22];
                    // Recolectores
                    casillas[23][27].setText("  ");
                    casillas[0][28].setText("  🐝");casillas[0][28].setForeground(Color.black); abeja4=casillas[0][28];

                    casillas[20][29].setText("  ");
                    casillas[1][28].setText("  🐝");casillas[1][28].setForeground(Color.black); abeja6=casillas[1][28];
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

                    casillas[2][22].setText("  ");
                    casillas[1][22].setText("  🐝");casillas[1][22].setForeground(Color.orange); abejaDef2=casillas[1][22];
                    casillas[5][23].setText("  🐝");casillas[5][23].setForeground(Color.orange); abejaDef3=casillas[5][23];
                    // Recolectores
                    casillas[0][28].setText("  ");
                    casillas[24][28].setText("  🐝");casillas[24][28].setForeground(Color.black); abeja4=casillas[24][28];

                    casillas[1][28].setText("  ");
                    casillas[16][21].setText("  🐝");casillas[16][21].setForeground(Color.black); abeja6=casillas[16][21];
                break;
                case 15:
                    casillas[17][15].setText("  ");
                    casillas[20][18].setText("  🐝");casillas[20][18].setForeground(Color.orange); abejaDef1=casillas[20][18];

                    casillas[1][22].setText("   💀"); casillas[1][22].setForeground(Color.black);
                    casillas[1][23].setText("  🐝");casillas[1][23].setForeground(Color.orange); abejaDef2=casillas[1][23];

                    casillas[5][23].setText("  ");
                    casillas[0][19].setText("  🐝");casillas[0][19].setForeground(Color.orange); abejaDef3=casillas[0][19];
                    // Recolectores
                    casillas[24][28].setText("  ");
                    JOptionPane.showMessageDialog(ventana, "¡Ha ingresado a la base una abeja!");

                    casillas[16][21].setText("  ");
                    casillas[17][22].setText("  🐝");casillas[17][22].setForeground(Color.black); abeja6=casillas[17][22];
                    
                break;
                case 16:
                    casillas[20][18].setText("  ");
                    casillas[22][19].setText("  🐝");casillas[22][19].setForeground(Color.orange); abejaDef1=casillas[22][19];

                    casillas[1][23].setText("  ");
                    casillas[0][24].setText("  🐝");casillas[0][24].setForeground(Color.orange); abejaDef2=casillas[0][24];

                    casillas[0][19].setText("  ");
                    casillas[1][20].setText("  🐝");casillas[1][20].setForeground(Color.orange); abejaDef3=casillas[1][20];
                    // Recolectores
                    casillas[17][22].setText("  ");
                    casillas[16][23].setText("  🐝");casillas[16][23].setForeground(Color.black); abeja6=casillas[16][23];
                break;
                case 17:
                    casillas[22][19].setText("  ");
                    casillas[24][20].setText("  🐝");casillas[24][20].setForeground(Color.orange); abejaDef1=casillas[24][20];

                    casillas[0][24].setText("  ");
                    casillas[2][24].setText("  🐝");casillas[2][24].setForeground(Color.orange); abejaDef2=casillas[2][24];

                    casillas[1][20].setText("  ");
                    casillas[3][20].setText("  🐝");casillas[3][20].setForeground(Color.orange); abejaDef3=casillas[3][20];
                    // Recolectores
                    casillas[16][23].setText("  ");
                    casillas[17][25].setText("  🐝");casillas[17][25].setForeground(Color.black); abeja6=casillas[17][25];
                break;
                case 18:
                    casillas[24][20].setText("   💀"); casillas[24][20].setForeground(Color.black);
                    casillas[1][23].setText("  🐝");casillas[1][23].setForeground(Color.orange); abejaDef1=casillas[1][23];

                    casillas[2][24].setText("  ");
                    casillas[7][26].setText("  🐝");casillas[7][26].setForeground(Color.orange); abejaDef2=casillas[7][26];

                    casillas[3][20].setText("  ");
                    casillas[5][21].setText("  🐝");casillas[5][21].setForeground(Color.orange); abejaDef3=casillas[5][21];
                    // Recolectores
                    casillas[17][25].setText("  ");
                    casillas[19][27].setText("  🐝");casillas[19][27].setForeground(Color.black); abeja6=casillas[19][27];
                break;
                case 19:
                    casillas[1][23].setText("  ");
                    casillas[3][24].setText("  🐝");casillas[3][24].setForeground(Color.orange); abejaDef1=casillas[3][24];

                    casillas[7][26].setText("  ");
                    casillas[9][26].setText("  🐝");casillas[9][26].setForeground(Color.orange); abejaDef2=casillas[9][26];

                    casillas[5][21].setText("  ");
                    casillas[9][23].setText("  🐝");casillas[9][23].setForeground(Color.orange); abejaDef3=casillas[9][23];
                    // Recolectores
                    casillas[19][27].setText("  ");
                    casillas[24][28].setText("  🐝");casillas[24][28].setForeground(Color.black); abeja6=casillas[24][28];
                case 20:
                    casillas[3][24].setText("  ");
                    casillas[5][25].setText("  🐝");casillas[5][25].setForeground(Color.orange); abejaDef1=casillas[5][25];

                    casillas[9][26].setText("  ");
                    casillas[24][28].setText("  🐝");casillas[24][28].setForeground(Color.orange); abejaDef2=casillas[24][28];

                    casillas[9][23].setText("  ");
                    casillas[9][24].setText("  🐝");casillas[9][24].setForeground(Color.orange); abejaDef3=casillas[9][24];
                    // Recolectores
                    casillas[24][28].setText("   ");
                    JOptionPane.showMessageDialog(ventana, "¡Ha ingresado a la base una abeja!");
                break;
                case 21:
                    casillas[5][25].setText("  ");
                    casillas[7][26].setText("  🐝");casillas[7][26].setForeground(Color.orange); abejaDef1=casillas[7][26];

                    casillas[24][28].setText("   ");
                    JOptionPane.showMessageDialog(ventana, "¡Ha ingresado a la base una abeja!");

                    casillas[9][24].setText("  ");
                    casillas[8][25].setText("  🐝");casillas[8][25].setForeground(Color.orange); abejaDef3=casillas[8][25];
                    // Recolectores

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

                    casillas[8][25].setText("  ");
                    casillas[6][25].setText("  🐝");casillas[6][25].setForeground(Color.orange); abejaDef3=casillas[6][25];
                    // Recolectores
                break;
                case 23:
                    casillas[9][27].setText("  ");
                    casillas[11][27].setText("  🐝");casillas[11][27].setForeground(Color.orange); abejaDef1=casillas[11][27];

                    casillas[6][25].setText("  ");
                    casillas[5][26].setText("  🐝");casillas[5][26].setForeground(Color.orange); abejaDef3=casillas[5][26];
                    // Recolectores
                break;
                case 24:
                    casillas[11][27].setText("  ");
                    casillas[13][27].setText("  🐝");casillas[13][27].setForeground(Color.orange); abejaDef1=casillas[13][27];

                    casillas[5][26].setText("  ");
                    casillas[19][27].setText("  🐝");casillas[19][27].setForeground(Color.orange); abejaDef3=casillas[19][27];
                    // Recolectores
                break;
                case 25:
                    casillas[13][27].setText("  ");
                    casillas[15][27].setText("  🐝");casillas[15][27].setForeground(Color.orange); abejaDef1=casillas[15][27];

                    casillas[19][27].setText("  ");
                    casillas[21][27].setText("  🐝");casillas[21][27].setForeground(Color.orange); abejaDef3=casillas[21][27];
                    // Recolectores
                break;
                case 26:
                    casillas[15][27].setText("  ");
                    casillas[17][27].setText("  🐝");casillas[17][27].setForeground(Color.orange); abejaDef1=casillas[17][27];

                    casillas[21][27].setText("  ");
                    casillas[24][28].setText("  🐝");casillas[21][27].setForeground(Color.orange); abejaDef3=casillas[21][27];
                    // Recolectores
                break;
                case 27:
                    casillas[17][27].setText("   💀");casillas[17][27].setForeground(Color.black);
                    casillas[19][27].setText("  🐝");casillas[19][27].setForeground(Color.orange); abejaDef1=casillas[19][27];

                    casillas[24][28].setText("   ");
                    JOptionPane.showMessageDialog(ventana, "¡Ha ingresado a la base una abeja!");
                    // Recolectores
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
                    JOptionPane.showMessageDialog(ventana, "¡Todas las abejas han ingresado a la base!");
                break;
                case 32:
                    System.exit(0);
                break;
        }
    }
}
}
