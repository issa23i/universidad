package nttdata.cursospring.universidad.universidadbackend;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Alumno;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Carrera;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AlumnosComandos implements CommandLineRunner {
    @Autowired
    @Qualifier("alumnoDAOImpl")
    private PersonaDAO personaDAO;
    @Autowired
    private CarreraDAO carreraDAO;
    @Override
    public void run(String... args) throws Exception {
//        Optional<Carrera> historia = carreraDAO.findById(2);
//        Iterable<Persona> alumnos = personaDAO.findAll();
//        alumnos.forEach(alumno -> ((Alumno)alumno).setCarrera(historia.get()));
//        alumnos.forEach(alumno -> personaDAO.save(alumno));

        //Optional<Persona> alumno_1 = personaDAO.findById(1);
        Optional<Carrera> historia = carreraDAO.findById(2);

        Iterable<Persona> alumnosHistoria = ((AlumnoDAO) personaDAO).buscarAlumnosPorNombreCarrera(historia.get().getNombre());
        alumnosHistoria.forEach(System.out::println);
/**
        Optional<Persona> personasNomApe = personaDAO.buscarPorNombreYApellido((alumno_1.get().getNombre(), alumno_1.get().getApellido());
        System.out.println(personasNomApe.toString());

        Optional<Persona> personaDni = personaDAO.buscarPorDNI(Integer.valueOf(alumno_1.get().getDni()));
        personaDni.toString();

        Iterable<Persona> personasApell = personaDAO.buscarPersonasPorApellido(alumno_1.get().getApellido());

        personasApell.forEach(System.out::println);
 */

    }
}
