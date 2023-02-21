package operaciones;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculadoraTest.class, Division.class, Multiplicacion.class, Resta.class, Suma.class })
public class AllTests {

}
