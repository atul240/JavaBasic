package Collections;

import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);
        integers.remove(1);
        System.out.println(integers);
    }
}
