package nttdata.cursospring.universidad.universidadbackend.servicios.implementaciones;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import nttdata.cursospring.universidad.universidadbackend.repositorios.AlumnoRepository;
import nttdata.cursospring.universidad.universidadbackend.repositorios.PersonaRepository;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDAO {
    @Autowired
    public AlumnoDAOImpl(@Qualifier("repositorioAlumnos")PersonaRepository repository) {
        super(repository);
    }


    @Override
    public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombreCarrera) {
        return ((AlumnoRepository)repository).buscarAlumnosPorNombreCarrera(nombreCarrera);
    }
}
