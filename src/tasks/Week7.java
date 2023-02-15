package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Week7 {

    public static int[] ascendingSortArray(int[] array) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        for (int i = array.length - 1; i >= 0; i--) {

            Integer max = Collections.max(list);

            array[i] = max;
            list.remove(max);
        }

        return array;
    }

    public static int[] descendingSortArray(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        for (int i = array.length-1; i >= 0; i--) {

            Integer min = Collections.min(list);

            array[i] = min;
            list.remove(min);
        }
        return array;
    }

}
