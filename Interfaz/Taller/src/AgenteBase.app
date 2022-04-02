public class AgenteBase{
    public int cantidad;
    public int pos;
    
    public AgenteBase(){}
    public AgenteBase(int cantidad,int pos){
        this.cantidad=cantidad;
        this.pos=pos;
    }
    public void acciones(){
        System.out.println("Llego a la base.");
    }
}
