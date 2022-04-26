public class Recolectores extends AgenteBase {

    public Recolectores(int cantidad, int pos){
        super(pos, lista);
        this.pos=pos;
    }
    public static void acciones1(){
        casillas[9][3].setText("  🐝");abeja4=casillas[9][3];
        casillas[19][9].setText("  🐝");;abeja5=casillas[19][9];
        casillas[5][2].setText("  🐝"); abeja6=casillas[5][2];
        lista[0]=abeja4;
        lista[1]=abeja5;
        lista[2]=abeja6;
    }
}
