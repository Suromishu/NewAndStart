package task.M5D14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, -2, -3, 4, -5));

        list.stream().map(Math::abs).forEach(System.out::println);
    }
}
