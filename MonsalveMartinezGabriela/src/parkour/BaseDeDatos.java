package parkour;

import java.util.ArrayList;

public class BaseDeDatos {

    private final ArrayList<Tabla> tablas;

    public BaseDeDatos() {
        tablas = new ArrayList<>();
    }

    public void addRegistro(Registro registroentrante) {
         Boolean x = false;
        for (Tabla tabla : tablas) {
              Integer i = 0;
            if (tabla.getEstructura().size() == registroentrante.getEstructura().size()) {//comparando ArrayList 
                for (Integer j = 0; j < tabla.getEstructura().size(); j++) {
                    if (tabla.getEstructura().contains(registroentrante.getEstructura().get(j))) {
                        i+=1;
                    } 
                    }
                if(i==tabla.getEstructura().size()){ 
                   x = true;
                   tabla.setRegistro(registroentrante);//La estructura existe, agregar registro a tabla corresp.
                   break;  
                }
                
            }
        }
        if(x==false){ //no exist, nueva tabla.
        Tabla tab = new Tabla();
        tab.setRegistro(registroentrante); //add reg a tab
        tablas.add(tab); //add a baseDD.
        }
    }
    
    public void printAll(){
        System.out.println("Número de tablas: " + tablas.size());
        for (int i = 0; i < tablas.size(); i++) {
            System.out.println("*************************************");
            System.out.println("Tabla: " + i);
            System.out.println(tablas.get(i).getEstructura());
            System.out.println("Registros:");
            for (int j = 0; j < tablas.get(i).getRegistro().size(); j++) {
                System.out.println(tablas.get(i).getRegistro().get(j).getCampos().toString());
            }
        }
    
    }
    
    
}
 
    
    
   


