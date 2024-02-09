package nttdata.cursospring.universidad.universidadbackend.servicios.implementaciones;


import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Carrera;
import nttdata.cursospring.universidad.universidadbackend.repositorios.CarreraRepository;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static nttdata.cursospring.universidad.universidadbackend.datos.DatosDammy.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

class CarreraDAOImplTest {

    CarreraDAO carreraDAO;
    CarreraRepository carreraRepository;

    @BeforeEach
    void setUp() {
        carreraRepository = mock(CarreraRepository.class);//CRUD
        carreraDAO = new CarreraDAOImpl(carreraRepository);
    }

    @Test
    void findCarrerasByNombreContains() {
        //Given
        String nombreCarrera = "Ingenieria";

        when(carreraRepository.findCarrerasByNombreContains(nombreCarrera))
                .thenReturn(Arrays.asList(carrera01(true), carrera03(true)));

        //When
        List<Carrera> expected = (List<Carrera>) carreraDAO.findCarrerasByNombreContains(nombreCarrera);

        //Then
        assertThat(expected.get(0)).isEqualTo(carrera01(true));
        assertThat(expected.get(1)).isEqualTo(carrera03(true));

        verify(carreraRepository).findCarrerasByNombreContains(nombreCarrera);
    }

    @Test
    void findCarrerasByNombreContainsIgnoreCase() {
        //Given
        String nombreCarrera = "ingenieria";

        when(carreraRepository.findCarrerasByNombreContains(nombreCarrera))
                .thenReturn(Arrays.asList(carrera01(true), carrera03(true)));

        //When
        List<Carrera> expected = (List<Carrera>) carreraDAO.findCarrerasByNombreContainsIgnoreCase(nombreCarrera);

        //Then
        assertThat(expected.get(0)).isEqualTo(carrera01(true));
        assertThat(expected.get(1)).isEqualTo(carrera03(true));

        verify(carreraRepository).findCarrerasByNombreContainsIgnoreCase(nombreCarrera);
    }

    @Test
    void findCarrerasByCantidadAniosAfter() {
        //Given
        Integer cantidad = 4;

        when(carreraRepository.findCarrerasByCantidadAniosAfter(cantidad))
                .thenReturn(Arrays.asList(carrera01(true), carrera03(true)));

        //When
        List<Carrera> expected = (List<Carrera>) carreraDAO.findCarrerasByCantidadAniosAfter(cantidad);

        //Then
        assertThat(expected.get(0)).isEqualTo(carrera01(true));
        assertThat(expected.get(1)).isEqualTo(carrera03(true));

        verify(carreraRepository).findCarrerasByCantidadAniosAfter(cantidad);
    }

    @Test
    void buscarCarrerasPorProfesorNombreYApellido() {
        //Given
        String nombreProfesor = "Isidro";
        String apellidoProfesor = "Bueno";

        when(carreraRepository.buscarCarrerasPorProfesorNombreYApellido(nombreProfesor,apellidoProfesor))
                .thenReturn(Arrays.asList(carrera02()));

        //When
        List<Carrera> expectedCarrera = (List<Carrera>) carreraDAO.buscarCarrerasPorProfesorNombreYApellido(nombreProfesor,apellidoProfesor);


        //Then
        assertThat(expectedCarrera.get(0)).isEqualTo(carrera02());

        verify(carreraRepository).buscarCarrerasPorProfesorNombreYApellido(nombreProfesor,apellidoProfesor);
    }
}