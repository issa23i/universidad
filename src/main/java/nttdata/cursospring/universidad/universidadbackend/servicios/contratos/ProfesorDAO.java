package nttdata.cursospring.universidad.universidadbackend.servicios.contratos;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;

public interface ProfesorDAO extends PersonaDAO {
    Iterable<Persona> findProfesoresByCarrera(String nombreCarrera);
}
