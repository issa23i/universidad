package nttdata.cursospring.universidad.universidadbackend.servicios.contratos;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Carrera;

import java.util.Optional;

public interface CarreraDAO {
    Optional<Carrera> findById(Integer id);
    Carrera save(Carrera carrera);
    Iterable<Carrera> findAll();
    void deleteById(Integer id);
}
