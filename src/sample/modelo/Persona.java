package sample.modelo;

import java.util.ArrayList;

public class Persona {

    public String nombre;
    public int edad;
    public String apellido;

    private static Persona[] listapersonas={
            new Persona("David","Delcid",20),
    };


    public Persona(String nombre,String apellido, int edad) {
        this.nombre=nombre;
        this.edad=edad;
        this.apellido=apellido;
    }

    public static Persona buscarPorPosicion(int posicion) {
        if (posicion < listapersonas.length) {
            return listapersonas[posicion];
        }
        return null;
    }

    public static Persona buscarPorNombre(String nombre) {
        for (int a = 0; a < listapersonas.length; a++) {
            if (listapersonas[a].nombre.equals(nombre)) {
                return listapersonas[a];
            }
        }
        return null;
    }

    public static Persona getPersona() {
        if (listapersonas.length > 0) {
            for (int d = 0; d < listapersonas.length; d++) {
                return listapersonas[d];
            }
        }
        return null;
    }


}
