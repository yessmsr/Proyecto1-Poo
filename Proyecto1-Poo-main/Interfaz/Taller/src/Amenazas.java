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
    }
    
}
