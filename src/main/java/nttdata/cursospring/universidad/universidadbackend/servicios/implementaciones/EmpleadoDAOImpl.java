package nttdata.cursospring.universidad.universidadbackend.servicios.implementaciones;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import nttdata.cursospring.universidad.universidadbackend.repositorios.AlumnoRepository;
import nttdata.cursospring.universidad.universidadbackend.repositorios.EmpleadoRepository;
import nttdata.cursospring.universidad.universidadbackend.repositorios.PersonaRepository;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.EmpleadoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Optional;

public class EmpleadoDAOImpl extends PersonaDAOImpl implements EmpleadoDAO {
    @Autowired
    public EmpleadoDAOImpl(@Qualifier("empleadoRepository") PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado) {
        return ((EmpleadoRepository)repository).findEmpleadoByTipoEmpleado(tipoEmpleado);
    }
}
