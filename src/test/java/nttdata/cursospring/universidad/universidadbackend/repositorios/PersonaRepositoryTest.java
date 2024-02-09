package nttdata.cursospring.universidad.universidadbackend.repositorios;

import nttdata.cursospring.universidad.universidadbackend.datos.DatosDammy;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PersonaRepositoryTest {

    @Autowired
    @Qualifier("repositorioAlumnos")
    PersonaRepository alumnoRepository;

    @Autowired
    @Qualifier("empleadoRepository")
    PersonaRepository empleadoRepository;

    @Autowired
    @Qualifier("profesorRepository")
    PersonaRepository profesorRepository;

    @BeforeEach
    void setUp(){
        //Given
        alumnoRepository.saveAll(Arrays.asList(DatosDammy.alumno01(), DatosDammy.alumno02(), DatosDammy.alumno03()));

        empleadoRepository.saveAll(Arrays.asList(DatosDammy.empleado01(), DatosDammy.empleado02(), DatosDammy.empleado03()));

        profesorRepository.save(DatosDammy.profesor01());
    }

    @AfterEach
    void tearDown(){
        alumnoRepository.deleteAll();
        empleadoRepository.deleteAll();
        profesorRepository.deleteAll();
    }

    @Test
    void buscarPorNombreYApellido() {
        /*//when
        Iterable<Persona> expected = alumnoRepository.buscarPersonasPorApellido("Ortiz");

        //then
        assertThat( ((List<Persona>)expected).size() ==1 );
        */

        //when
        Optional<Persona> expectedEmpleado = empleadoRepository.buscarPorNombreYApellido(DatosDammy.empleado01().getNombre(),
                DatosDammy.empleado01().getApellido());

        //then
        assertThat(expectedEmpleado.get()).isInstanceOf(Empleado.class);
        assertThat(expectedEmpleado.get()).isEqualTo(DatosDammy.empleado01());
    }

    @Test
    void buscarPorDNI() {
        //when
        Optional<Persona> expectedProfesor = profesorRepository.buscarPorDNI(Integer.valueOf("333333333G"));

        //then
        assertThat(expectedProfesor.get()).isInstanceOf(Profesor.class);
        assertThat(expectedProfesor.get().getDni()).isEqualTo(DatosDammy.profesor01());
    }

    @Test
    void buscarPersonasPorApellido() {
        //when
        Iterable<Persona> expectedAlumnnos = alumnoRepository.buscarPersonasPorApellido("González");

        //then
        assertThat( ((List<Persona>)expectedAlumnnos).size() == 2 );
    }
}