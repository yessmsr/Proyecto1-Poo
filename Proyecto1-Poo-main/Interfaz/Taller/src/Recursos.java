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
        while(lista.length!=0){
            if(abejaDef1==recurso1||abejaDef2==recurso1||abeja4==recurso1){
                casillas[11][1].setText(" ");
                //De está forma se refleja que el recurso se recolecto
            }
            else if(abeja5==recurso2||abejaDef2==recurso2||abeja4==recurso2){
                casillas[23][3].setText(" ");
            }
            else if(abejaDef1==recurso3||abeja6==recurso3||abejaDef3==recurso3){
                casillas[9][5].setText(" ");
            }
            else if(abejaDef1==recurso4||abejaDef2==recurso4||abeja4==recurso4){
                casillas[23][10].setText(" ");
            }
            else if(abeja4==recurso5||abeja5==recurso5||abeja6==recurso5){
                casillas[23][3].setText(" ");
            }
            else if(abejaDef1==recurso6||abejaDef2==recurso6||abejaDef3==recurso6){
                casillas[17][15].setText(" ");
            }
            else if(abeja4==recurso7||abeja5==recurso7||abeja6==recurso7){
                casillas[9][27].setText(" ");
            }
            else if(abejaDef1==recurso8||abejaDef2==recurso8||abeja4==recurso8){
                casillas[1][9].setText(" ");
            }
            else if(abeja4==recurso7||abeja5==recurso7||abeja6==recurso7){
                casillas[19][23].setText(" ");
            }
        }
    }
}
