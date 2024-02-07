package nttdata.cursospring.universidad.universidadbackend;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Pabellon;
import nttdata.cursospring.universidad.universidadbackend.servicios.implementaciones.PabellonDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class PabellonComandos implements CommandLineRunner {
    @Autowired
    private PabellonDAOImpl servicioPabellon;
    @Override
    public void run(String... args) throws Exception {
        Iterable<Pabellon> pabellonesMagnificos = servicioPabellon.findPabellonByNombre("pabellon el magnífico");
        Iterable<Pabellon> pabellonesEnPetrer = servicioPabellon.findPabellonByDireccionLocalidad("Petrer");
        Iterable<Pabellon> pabellones = servicioPabellon.findAll();
        pabellonesMagnificos.forEach(System.out::println);
        pabellonesEnPetrer.forEach(System.out::println);
        pabellones.forEach(System.out::println);
    }
}
