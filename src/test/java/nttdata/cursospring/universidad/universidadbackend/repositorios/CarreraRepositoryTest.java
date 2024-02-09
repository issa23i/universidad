package nttdata.cursospring.universidad.universidadbackend.repositorios;

import nttdata.cursospring.universidad.universidadbackend.datos.DatosDammy;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Carrera;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class CarreraRepositoryTest {
    @Autowired
    CarreraRepository carreraRepository;

    @BeforeEach
    void setUP(){
        //given
        carreraRepository.save(DatosDammy.carrera01());
        carreraRepository.save(DatosDammy.carrera02());
        carreraRepository.save(DatosDammy.carrera03());
    }

    @AfterEach
    void tearDown(){
        carreraRepository.deleteAll();
    }

    @Test
    @Disabled
    @DisplayName("Buscar Carreras por nombre")
    void findCarrerasByNombreContains() {
        //when
        Iterable<Carrera> expected = carreraRepository.findCarrerasByNombreContains("Sistemas");

        //then
        assertThat( ((List<Carrera>)expected).size() ==2).isTrue();
    }

    @Test
    @DisplayName("Buscar Carreras por nombre No es case sensitive")
    void findCarrerasByNombreContainsIgnoreCase() {
        //when
        Iterable<Carrera> expectedIgnoreCase = carreraRepository.findCarrerasByNombreContainsIgnoreCase("Sistemas");

        //then
        assertThat( ((List<Carrera>)expectedIgnoreCase).size() ==2).isTrue();
    }

    @Test
    @DisplayName("Buscar carreras mayor a n anyos")
    void findCarrerasByCantidadAniosAfter() {

        //when
        Iterable<Carrera> expectedCarrerasXNumAnyos = carreraRepository.findCarrerasByCantidadAniosAfter(4);

        //then
        assertThat( ((List<Carrera>)expectedCarrerasXNumAnyos).size() ==2).isTrue();
    }

    @Test
    @DisplayName("Buscar carreras por profesor asociado")
    void buscarCarrerasPorProfesorNombreYApellido() {
        //given
        carreraRepository.save(DatosDammy.carrera01());
        carreraRepository.save(DatosDammy.carrera02());
        carreraRepository.save(DatosDammy.carrera03());

        //when
        Iterable<Carrera> expectedCarrerasProfesor = carreraRepository.buscarCarrerasPorProfesorNombreYApellido("antonio","perez");

        //then
        assertThat( ((List<Carrera>)expectedCarrerasProfesor).size() ==1).isTrue();
    }
}