import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LC1_TwoSumTest {
    @Test
    public void testTwoSumHappyPath() {
        //AAA
        //A - arrange
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};

        //A - act
        int[] actualResult = new LC1_TwoSum().twoSum(nums, target);

        //A - assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    private static Stream<Arguments> twoSumArgumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3,2,4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3,3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{2, 4, 5, 7, 11, 12}, 9, new int[]{0, 3}),
                Arguments.of(new int[]{2, 7, -5, 677}, -3, new int[]{0, 2}),
                Arguments.of(new int[]{8, 9, 2, -12, 3}, 12, new int[]{1, 4}),
                Arguments.of(new int[]{0,0}, 9, new int[]{-1, -1}),
                Arguments.of(new int[]{}, 9, new int[]{}),
                Arguments.of(new int[]{1}, 1, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("twoSumArgumentsProvider")
    public void testTwoSum(int[] nums, int target, int[] expectedResult) {

        int[] actualResult = new LC1_TwoSum().twoSum(nums, target);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
