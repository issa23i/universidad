package nttdata.cursospring.universidad.universidadbackend;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.*;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.EmpleadoDAO;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.ProfesorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class UniversidadBackendApplication {

	/**
	@Autowired
	private AlumnoDAO servicio;

@Autowired
private ProfesorDAO servicio2;*/

	@Autowired
	private EmpleadoDAO servicioEmpleado;

	public static void main(String[] args) {
		String[] beanDefinitionNames = SpringApplication.run(UniversidadBackendApplication.class, args).getBeanDefinitionNames();
//		for (String str : beanDefinitionNames){
//			System.out.println(str);
//		}

	}
/***/
	@Bean
	public CommandLineRunner runner(){
		return args -> {
//			Direccion direccion = new Direccion("Ave del paraíso", "7", "44444", "Departamento floritura", "Piso 4º", "Localidad x");
//			Persona alumno = new Alumno(null,"Pepe", "Cuerdas", "99999999R", direccion);
//
//			Persona save = servicio.save(alumno);
//			System.out.println(save.toString());
//
//			List<Persona> alumnos = (List<Persona>) servicio.findAll();
//			alumnos.forEach(System.out::println);

			Direccion direccion2 = new Direccion("Calle del Alma", "11", "44444", "Depart. 127", "11", "Sevilla");
//			Persona profesor = new Profesor(null,"Pepe","De las Ostras","11111111H", direccion2, new BigDecimal("11251.2"));
//
//			Persona save2 = servicio2.save(profesor);
//			System.out.println(save2.toString());
//
//			Iterable<Persona> profesores = servicio2.findAll();
//			profesores.forEach(System.out::println);

			Empleado andonio = new Empleado(null,"Andonio", "Apellido1","11111111H",direccion2,new BigDecimal("15550.000"), TipoEmpleado.MANTENIMIENTO);
			Persona save3 = servicioEmpleado.save(andonio);
			System.out.println(save3.toString());
		};
	}

}