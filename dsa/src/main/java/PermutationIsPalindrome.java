import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class PermutationIsPalindrome {

    public static void main(String[] args) {
        hasPalindromePermutation("civicc");
    }

    public static boolean hasPalindromePermutation(String theString) {
        if (null == theString || theString.isEmpty())
            return true;

        Map<Character, Integer> map = new HashMap<>();
        IntStream.range(0, theString.length())
                .forEach(index ->
                        map.merge(theString.charAt(index), 1, (a, b) -> a + b)
                );

        return !(map.values().stream()
                .filter(value -> value % 2 != 0)
                .count() > 1);

    }
}
