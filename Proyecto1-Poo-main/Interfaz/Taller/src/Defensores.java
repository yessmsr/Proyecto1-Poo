import javax.swing.JLabel;
import java.awt.*;

public class Defensores extends AgenteBase {
    
    public Defensores(int pos, JLabel[] lista){
        super( pos, lista);
        this.pos=pos;
    }
    public static void acciones1(){
        casillas[0][0].setText("  🐝");casillas[0][0].setForeground(Color.orange); abejaDef1=casillas[0][0];
        casillas[10][3].setText("  🐝"); casillas[10][3].setForeground(Color.orange); abejaDef2=casillas[10][3];
        casillas[9][0].setText("  🐝");casillas[9][0].setForeground(Color.orange); abejaDef3=casillas[9][0];
        lista[0]=abejaDef1;
        lista[1]=abejaDef2;
        lista[2]=abejaDef3;
    }
}
