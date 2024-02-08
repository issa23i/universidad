package nttdata.cursospring.universidad.universidadbackend;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class UniversidadBackendApplicationTests {


	Calculadora calculadora = new Calculadora();

	@Test
	@DisplayName("Suma de valor a y valor b")
	void sumaDeValores() {
		//given - dados estos datos
		int valorA = 2;
		int valorB = 3;

		//when - cuando queremos que suceda esto
		int expectativa = calculadora.sumar(valorA, valorB);

		//then - entonces comprobar esto
		int resultadoEsperado = 5;
		assertThat(expectativa).isEqualTo(resultadoEsperado);
	}
	@Test
	@DisplayName("Test deprecado")
	@Disabled("Test deprecado")
	void testDesactivado(){

	}

	class Calculadora{
		int sumar(int valor_a, int valor_b){
			return valor_a + valor_b;
		}
	}

}
