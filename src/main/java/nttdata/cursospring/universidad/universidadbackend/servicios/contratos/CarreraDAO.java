package nttdata.cursospring.universidad.universidadbackend.servicios.contratos;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Carrera;

import java.util.Optional;

public interface CarreraDAO extends GenericoDAO<Carrera> {
    Iterable<Carrera> findCarrerasByNombreContains(String nombreCarrera);
    Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombreCarrera);
    Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnyos);
    Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido);
}
