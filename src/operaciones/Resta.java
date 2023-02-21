package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Resta {

	private static Stream<Arguments> resta(){
		return Stream.of(
				Arguments.of(20,10,10),
				Arguments.of(30,-2,32),
				Arguments.of(-5,-2,3)
				);
	}
	@ParameterizedTest
	@MethodSource("resta")
	void testDivide(int num1, int num2, int expected) {
		Calculadora calc = new Calculadora(num1, num2);
		int resultado = calc.resta();
		assertEquals(expected, resultado);
	}

}
