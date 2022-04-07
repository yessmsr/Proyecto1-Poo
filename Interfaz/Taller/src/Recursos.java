import javax.swing.JLabel;

public class Recursos extends Objetos{

    public Recursos(JLabel[] lista,JLabel recurso1){
        super(lista, recurso1);
    }
    public void agregarRecursos(){
        lista[0]=recurso1;
        lista[1]=recurso2;
        lista[2]=recurso3;
        lista[3]=recurso4;
        lista[4]=recurso5;
        lista[5]=recurso6;
        lista[6]=recurso7;
    }
    public void acciones(){
    }
}
