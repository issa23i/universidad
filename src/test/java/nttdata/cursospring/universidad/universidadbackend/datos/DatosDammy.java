package nttdata.cursospring.universidad.universidadbackend.datos;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.*;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;

import java.math.BigDecimal;

public class DatosDammy {

    public static Persona empleado01() {
        Direccion direccion = new Direccion("Calle agonía", "18","44455","Departamento aas","2º","Albaida");
        return new Empleado(null, "Amigo", "López","11111111H",direccion,new BigDecimal("25000"), TipoEmpleado.ADMINISTRATIVO);
    }
    public static Persona empleado02() {
        Direccion direccion = new Direccion("Calle agonía", "18","44455","Departamento aas","2º","Albacete");
        return new Empleado(null, "Andrés", "Guijarro","99999999R",direccion,new BigDecimal("19998"), TipoEmpleado.MANTENIMIENTO);
    }
    public static Persona empleado03() {
        Direccion direccion = new Direccion("Calle agonía", "18","44455","Departamento aas","2º","Castellón");
        return new Empleado(null, "Beatriz", "Suabia","22222222T",direccion,new BigDecimal("21580"), TipoEmpleado.ADMINISTRATIVO);
    }

    public static Persona profesor01(){
        Direccion direccion = new Direccion("Calle agonía", "18","44455","Departamento aas","2º","Albacete");
        return new Profesor(null,"Martín","Calatrava","333333333G",direccion,new BigDecimal("62500"));
    }

    public static Persona alumno01(){
        Direccion direccion = new Direccion("Calle agonía", "18","44455","Departamento aas","2º","Albacete");
        return new Alumno(null,"Calamar","González","44444444O",direccion);
    }
    public static Persona alumno02(){
        Direccion direccion = new Direccion("Calle agonía", "18","44455","Departamento aas","2º","Alicante");
        return new Alumno(null,"Fianzo","González","661661662L",direccion);
    }
    public static Persona alumno03(){
        Direccion direccion = new Direccion("Calle agonía", "18","44455","Departamento aas","2º","Valentina");
        return new Alumno(null,"Otawa","Bertún","874857777K",direccion);
    }


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

