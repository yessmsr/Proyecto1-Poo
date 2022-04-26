import javax.swing.JLabel;

public class Objetos extends Interfaz{
    public static JLabel lista[] = new JLabel[9];

    public Objetos(JLabel[] lista,JLabel recurso1){
        super(recurso1);
        Objetos.lista=lista;
    }

    public static void acciones(){
        Recursos.agregarRecursos();
        Amenazas.acciones1();
    }
}
