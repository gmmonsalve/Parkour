package parkour;

import java.util.ArrayList;
/**
 * @author GabrielaM
 */
public class Tabla {
    private final ArrayList<Registro> registros; //Atributo: Registros
   
    public Tabla() { //Constructor
       registros = new ArrayList<>();
    }

    public void setRegistro(Registro registro) {
        this.registros.add(registro);//add reg.
    }

    public ArrayList<Registro> getRegistro() {
        return registros;
    }
    public ArrayList getEstructura(){
    return registros.get(0).getEstructura(); //retornar ArrayList de Estruct.
}
    
   
}
 







