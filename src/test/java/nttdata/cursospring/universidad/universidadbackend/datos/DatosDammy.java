package nttdata.cursospring.universidad.universidadbackend.datos;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Carrera;

public class DatosDammy {

    public static Carrera carrera01(){
        return new Carrera(null,"Ingenieria de Sistemas",50,5);
    }

    public static Carrera carrera02(){
        return new Carrera(null,"Licenciatura de Sistemas",45,4);
    }

    public static Carrera carrera03(){
        return new Carrera(null,"Ingenieria Industrial",60,5);
    }
}
