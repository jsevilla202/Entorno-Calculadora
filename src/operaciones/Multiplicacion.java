package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Multiplicacion {

	private static Stream<Arguments> multiplicacion(){
		return Stream.of(
				Arguments.of(20,10,200),
				Arguments.of(30,-2,-60),
				Arguments.of(5,2,10)
				);
	}
	@ParameterizedTest
	@MethodSource("multiplicacion")
	void testDivide(int num1, int num2, int expected) {
		Calculadora calc = new Calculadora(num1, num2);
		int resultado = calc.multiplica();
		assertEquals(expected, resultado);
	}

}
