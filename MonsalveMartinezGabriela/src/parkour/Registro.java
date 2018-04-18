package parkour;

import java.util.ArrayList;

/**
 *
 * @author GabrielaM
 */
public class Registro {

    private final ArrayList campos;
    private final ArrayList estructura;

    public Registro() {
        campos = new ArrayList<>();
        estructura = new ArrayList<>();
    }

    public ArrayList getEstructura() {
        return estructura;
    }

    public ArrayList getCampos() {
        return campos;
    }

    public static Registro crearRegistro(Object... datos) { //guardando los datos en el array campos
        Registro regist = new Registro();
        for (Object dato : datos) { //agregando campos al registro 
            regist.campos.add(dato);
            setEstructura(dato, regist);//Creando estructura
        }
        return regist;
    }

    public static void setEstructura(Object dato, Registro regist) {
        if (dato instanceof Integer) {
            regist.estructura.add("INT"); //variables "wrappers"
        } else {
            if (dato instanceof Boolean) {
                regist.estructura.add("BOOLEAN");
            } else {
                if (dato instanceof Float) {
                    regist.estructura.add("FLOAT");
                } else {
                    if (dato instanceof Double) {
                        regist.estructura.add("DOUBLE");
                    } else {
                        if (dato instanceof String) {
                            regist.estructura.add("STRING");
                        } else {
                            if (dato instanceof Long) {
                                regist.estructura.add("LONG");
                            } else {
                                if (dato instanceof Character) {
                                    regist.estructura.add("CHAR");
                                } else {
                                    if (dato instanceof Byte) {
                                        regist.estructura.add("BYTE");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}







