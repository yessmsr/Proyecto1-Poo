import javax.swing.JLabel;

public class Obstaculos extends Objetos{

    public Obstaculos(JLabel[] lista,JLabel recurso1){
        super(lista, recurso1);
    }
    public void agregarAmenazas(){
        lista[0]=ob1;
        lista[1]=ob2;
        lista[2]=ob3;
        lista[3]=ob4;
        lista[4]=ob5;
        lista[5]=ob6;
        lista[6]=ob7;
    }
    
}
