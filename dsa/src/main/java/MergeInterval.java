import java.util.ArrayList;

public class MergeInterval {

    public static void main(String[] args) {
        new MergeInterval().sort();
    }

    private void sort() {

        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.sort((i1, i2) ->
        {
            if (i1.start == i2.start)
                return 0;
            return i1.start > i2.start ? 1 : -1;


        });


    }


}
