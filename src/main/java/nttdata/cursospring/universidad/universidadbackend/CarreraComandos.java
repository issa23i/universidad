package nttdata.cursospring.universidad.universidadbackend;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Carrera;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Order(3)
public class CarreraComandos implements CommandLineRunner {
    @Autowired
    private CarreraDAO servicio;
    @Override
    public void run(String... args) throws Exception {
/**
        List<Carrera> carrerasDeHistoria1 = (List<Carrera>) servicio.findCarrerasByNombreContains("Historia");
        carrerasDeHistoria1.forEach(System.out::println);

        List<Carrera> carrerasDeHistoria2 = (List<Carrera>) servicio.findCarrerasByNombreContainsIgnoreCase("historia");
        carrerasDeHistoria2.forEach(System.out::println);

        List<Carrera> carrerasDeHistoria3 = (List<Carrera>) servicio.findCarrerasByCantidadAniosAfter(4);
        carrerasDeHistoria3.forEach(System.out::println);


//        Carrera ingSistemas = new Carrera(null, "Ingeniería en sistemas",50,5);
//        Carrera save = servicio.save(ingSistemas);
//        System.out.println(save.toString());

        Carrera carrera = null;
        Optional<Carrera> oCarrera = servicio.findById(1);
        if(oCarrera.isPresent()){
            carrera = oCarrera.get();
            System.out.println(carrera.toString());
        } else {
            System.out.println("Carrera no encontrada");
        }

        carrera.setCantidaMaterias(65);
        carrera.setCantidadAnios(6);

        servicio.save(carrera);

        System.out.println(servicio.findById(1).orElse(new Carrera()).toString());

        servicio.deleteById(1);
        System.out.println(servicio.findById(1).orElse(new Carrera()).toString());

        Carrera ingSistemas = new Carrera(null,"Ingeniería de Sistemas",50,5);
        Carrera historia = new Carrera(null, "Historia",51,4);
        Carrera historiaDelArte = new Carrera(null, "Historia del arte", 45,3);
        Carrera medicina = new Carrera(null, "Medicina", 65,5);

        servicio.save(ingSistemas);
        servicio.save(historia);
        servicio.save(historiaDelArte);
        servicio.save(medicina);
         */


    }
}
