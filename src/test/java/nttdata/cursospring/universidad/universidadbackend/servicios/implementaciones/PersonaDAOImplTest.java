package nttdata.cursospring.universidad.universidadbackend.servicios.implementaciones;

import nttdata.cursospring.universidad.universidadbackend.repositorios.AlumnoRepository;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;



import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PersonaDAOImplTest {

    PersonaDAO personaDAO;
    @Mock
    AlumnoRepository alumnoRepository;

    @BeforeEach
    void setUp() {
        personaDAO = new PersonaDAOImpl(alumnoRepository);
    }

    @Test
    void buscarPorNombreYApellido() {
        //When
        personaDAO.buscarPorNombreYApellido(anyString(), anyString());

        //Then
        verify(alumnoRepository).buscarPorNombreYApellido(anyString(),anyString());
    }

    @Test
    void buscarPorDNI() {
        //When
        personaDAO.buscarPorDNI(Integer.valueOf(anyString()));

        //Then
        verify(alumnoRepository).buscarPorDNI(Integer.valueOf(anyString()));
    }

    @Test
    void buscarPersonasPorApellido() {
        //When
        personaDAO.buscarPersonasPorApellido(anyString());

        //Then
        verify(alumnoRepository).buscarPersonasPorApellido(anyString());
    }
}