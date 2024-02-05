package nttdata.cursospring.universidad.universidadbackend.servicios.implementaciones;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import nttdata.cursospring.universidad.universidadbackend.repositorios.PersonaRepository;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
public class AlumnoDAOImpl implements AlumnoDAO {

    @Autowired
    @Qualifier("repositorioAlumnos")
    private PersonaRepository repository;
    @Transactional(readOnly = true)
    @Override
    public Optional<Persona> findById(Integer id) {
        return repository.findById(id);
    }
    @Transactional
    @Override
    public Persona save(Persona persona) {
        return repository.save(persona);
    }
    @Transactional(readOnly = true)
    @Override
    public Iterable<Persona> findAll() {
        return repository.findAll();
    }
    @Transactional
    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
