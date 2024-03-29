package nttdata.cursospring.universidad.universidadbackend;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
@Order(5)
public class ProfesorComandos implements CommandLineRunner {
    @Autowired
    @Qualifier("ProfesorDAOImpl")
    private PersonaDAO personaDAO;
    @Override
    public void run(String... args) throws Exception {

        Optional<Persona> profesor1 = personaDAO.buscarPorNombreYApellido("Andonio", "Ordoñez");
        System.out.println(profesor1);
    }
}
