package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Suma {

	private static Stream<Arguments> suma(){
		return Stream.of(
				Arguments.of(20,10,30),
				Arguments.of(30,-2,28),
				Arguments.of(5,2,7)
				);
	}
	@ParameterizedTest
	@MethodSource("suma")
	void testDivide(int num1, int num2, int expected) {
		Calculadora calc = new Calculadora(num1, num2);
		int resultado = calc.suma();
		assertEquals(expected, resultado);
	}

}
