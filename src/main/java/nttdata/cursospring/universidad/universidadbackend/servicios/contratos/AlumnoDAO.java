package nttdata.cursospring.universidad.universidadbackend.servicios.contratos;


import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;

public interface AlumnoDAO extends PersonaDAO{
    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombreCarrera);
}
