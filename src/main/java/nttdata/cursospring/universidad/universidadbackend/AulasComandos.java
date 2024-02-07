package nttdata.cursospring.universidad.universidadbackend;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;
import nttdata.cursospring.universidad.universidadbackend.servicios.implementaciones.AulaDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class AulasComandos implements CommandLineRunner {
    @Autowired
    private AulaDAOImpl service;
    @Override
    public void run(String... args) throws Exception {
        service.findAulasByPizarron(Pizarron.PIZARRA_BLANCA);
        service.findAulaByNroAula(2);
        service.findAulasByPabellonNombre("Bonaparte");
    }
}
