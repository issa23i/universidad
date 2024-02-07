package nttdata.cursospring.universidad.universidadbackend.servicios.contratos;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Pabellon;

public interface PabellonDAO extends GenericoDAO<Pabellon>{
    Iterable<Pabellon> findPabellonByDireccionLocalidad(String nombreLocalidad);
    Iterable<Pabellon> findPabellonByNombre(String nombrePabellon);
}
