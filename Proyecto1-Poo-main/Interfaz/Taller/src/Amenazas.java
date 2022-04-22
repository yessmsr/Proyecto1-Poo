import javax.swing.JLabel;

public class Amenazas extends Objetos{
    private int vidas=10;

    public Amenazas(JLabel[] lista,JLabel recurso1){
        super(lista, recurso1);
    }
    public void agregarAmenazas(){
        lista[0]=amenaza1;
        lista[1]=amenaza2;
        lista[2]=amenaza3;
        lista[3]=amenaza4;
        lista[4]=amenaza5;
        lista[5]=amenaza6;
        lista[6]=amenaza7;
    }
    public void acciones(){
        for(int i=0;i<=vidas;i++){
            if(abejaDef1==amenaza1 || abejaDef2==amenaza1 || abejaDef3==amenaza1){
                casillas[17][9].setText("   ");
                System. out. println("Se ha eliminado la amenaza.");
            }
            if(abejaDef1==amenaza2 || abejaDef2==amenaza2 || abejaDef3==amenaza2){
                casillas[10][14].setText("   ");
                System. out. println("Se ha eliminado la amenaza.");
            }
            if(abejaDef1==amenaza3 || abejaDef2==amenaza3 || abejaDef3==amenaza3){
                casillas[24][20].setText("   ");
                System. out. println("Se ha eliminado la amenaza.");
            }
            if(abejaDef1==amenaza4 || abejaDef2==amenaza4 || abejaDef3==amenaza4){
                casillas[17][3].setText("   ");
                System. out. println("Se ha eliminado la amenaza.");
            }
            if(abejaDef1==amenaza5 || abejaDef2==amenaza5 || abejaDef3==amenaza5){
                casillas[15][15].setText("   ");
                System. out. println("Se ha eliminado la amenaza.");
            }
            if(abejaDef1==amenaza6 || abejaDef2==amenaza6 || abejaDef3==amenaza6){
                casillas[17][27].setText("   ");
                System. out. println("Se ha eliminado la amenaza.");
            }
            if(abejaDef1==amenaza7 || abejaDef2==amenaza7 || abejaDef3==amenaza7){
                casillas[1][0].setText("   ");
                System. out. println("Se ha eliminado la amenaza.");
            }
        }
    }
}
