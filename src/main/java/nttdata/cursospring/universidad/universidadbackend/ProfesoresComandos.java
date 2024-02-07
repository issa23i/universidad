package nttdata.cursospring.universidad.universidadbackend;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Carrera;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.ProfesorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;

import java.util.Optional;

public class ProfesoresComandos implements CommandLineRunner {

    @Autowired
    @Qualifier("profesorDAOImpl")
    private PersonaDAO servicioProfesor;

    @Autowired
    private CarreraDAO carreraDAO;
    @Override
    public void run(String... args) throws Exception {

        Optional<Carrera> carreraHistoria = carreraDAO.findById(2);
        Iterable<Persona> iProfesor = ((ProfesorDAO) servicioProfesor).findProfesoresByCarrera(carreraHistoria.get().getNombre());

        iProfesor.forEach(System.out::println);

    }
}
