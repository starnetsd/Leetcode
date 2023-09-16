import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LC13_RomanToIntegerTest {
    private static Stream<Arguments> romanToIntArguments() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("MMMCMXCVIII", 3998),
                Arguments.of("MMMCMXCIX", 3999),
                Arguments.of("MMMCMXCIXMMMCMXCIXMMMCMXCIX", 2147483647),
                Arguments.of("MCQIX", -1),
                Arguments.of("ZCIX", -1),
                Arguments.of("", 2147483647)
        );
    }

    @ParameterizedTest
    @MethodSource("romanToIntArguments")
    public void testRomanToInt(String s, int expectedResult) {
        int actualResult = new LC13_RomanToInteger_HashMap().romanToInt(s);

        Assertions.assertEquals(actualResult, expectedResult);
    }
}
