package nttdata.cursospring.universidad.universidadbackend;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Alumno;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Direccion;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UniversidadBackendApplication {


	@Autowired
	private AlumnoDAO servicio;
	public static void main(String[] args) {
		String[] beanDefinitionNames = SpringApplication.run(UniversidadBackendApplication.class, args).getBeanDefinitionNames();
//		for (String str : beanDefinitionNames){
//			System.out.println(str);
//		}

	}

	@Bean
	public CommandLineRunner runner(){
		return args -> {
			Direccion direccion = new Direccion("Ave del paraíso", "7", "44444", "Departamento floritura", "Piso 4º", "Localidad x");
			Persona alumno = new Alumno(null,"Pepe", "Cuerdas", "99999999R", direccion);

			Persona save = servicio.save(alumno);
			System.out.println(save.toString());
		};
	}

}