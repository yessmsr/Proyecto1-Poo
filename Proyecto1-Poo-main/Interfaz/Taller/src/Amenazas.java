import javax.swing.JLabel;
import java.awt.*;

public class Amenazas extends Objetos{
    private int vidas=10;

    public Amenazas(JLabel[] lista,JLabel recurso1){
        super(lista, recurso1);
    }
    public static void acciones1(){
        //Se agregan las amenazas
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
    }
    public void agregarAmenazas(){
        lista[0]=amenaza1;
        lista[1]=amenaza2;
        lista[2]=amenaza3;
        lista[3]=amenaza4;
        lista[4]=amenaza5;
        lista[5]=amenaza6;
        lista[6]=amenaza7;
        for(int i=0;i<=vidas;i++){
            if(abejaDef1==amenaza1 || abejaDef2==amenaza1 || abejaDef3==amenaza1){
                casillas[17][9].setText("   "); //Esto representa que la ameneza se elimino
            }
            else if(abejaDef1==amenaza2 || abejaDef2==amenaza2 || abejaDef3==amenaza2){
                casillas[10][14].setText("   ");
            }
            else if(abejaDef1==amenaza3 || abejaDef2==amenaza3 || abejaDef3==amenaza3){
                casillas[24][20].setText("   ");
            }
            else if(abejaDef1==amenaza4 || abejaDef2==amenaza4 || abejaDef3==amenaza4){
                casillas[17][3].setText("   ");
            }
            else if(abejaDef1==amenaza5 || abejaDef2==amenaza5 || abejaDef3==amenaza5){
                casillas[15][15].setText("   ");
            }
            else if(abejaDef1==amenaza6 || abejaDef2==amenaza6 || abejaDef3==amenaza6){
                casillas[17][27].setText("   ");
            }
            else if(abejaDef1==amenaza7 || abejaDef2==amenaza7 || abejaDef3==amenaza7){
                casillas[1][0].setText("   ");
            }
        }
    }
}
