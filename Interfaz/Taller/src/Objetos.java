import javax.swing.JLabel;

public class Objetos extends Interfaz{
    public JLabel lista[] = new JLabel[6];


    public Objetos(JLabel[] lista,JLabel recurso1){
        super(recurso1);
        this.lista=lista;
    }

    public void acciones(){
        super.agregarComponentes();
        
    }
    
}
