package nttdata.cursospring.universidad.universidadbackend.repositorios;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import org.springframework.stereotype.Repository;

@Repository("empleadoRepository")
public interface EmpleadoRepository extends PersonaRepository{
    Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);
}
