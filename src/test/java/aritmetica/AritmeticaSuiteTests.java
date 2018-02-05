package aritmetica;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({AritmeticaTests.class, RestaParametrizadaTests.class})
public class AritmeticaSuiteTests {

}
