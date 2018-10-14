import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(canTwoMoviesFillFlight(new int[]{1, 2, 3, 4, 5, 6}, 7));
    }

    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

        Map<Integer, Integer> movies = new HashMap<>();

        return IntStream.range(0, movieLengths.length)
                .anyMatch(index -> {
                    if (movies.get(movieLengths[index]) != null)
                        return true;
                    movies.put(flightLength - movieLengths[index], movieLengths[index]);
                    return false;
                });

        //return false;

    }

}
