package aritmetica;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.MatcherAssert.*;

public class RestaParametrizadaTests {
    private static Aritmetica aritmetica;

    static Stream<Arguments> datos() {
        return Stream.of(
                Arguments.of(1.0, 1.0, 0.0),
                Arguments.of(2.0, 1.0, 1.0),
                Arguments.of(1.0, 2.0, -1.0),
                Arguments.of(1001.0, 1.0, 1000.0)
        );
    }

    @BeforeAll
    public static void setUp() {
        aritmetica = new Aritmetica();
    }

    @ParameterizedTest
    @MethodSource("datos")
    public void restasParametrizadasTest(double minuendo, double sustraendo, double resultado) {
        assertThat(aritmetica.resta(minuendo, sustraendo), is(resultado));
    }
}
