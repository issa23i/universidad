package nttdata.cursospring.universidad.universidadbackend.servicios.contratos;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Empleado;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;

public interface EmpleadoDAO extends PersonaDAO {
    Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);
}
