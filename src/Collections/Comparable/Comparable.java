package Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable {
    public static void main(String[] args) {
        ArrayList<Student> stds = new ArrayList<>();
        stds.add(new Student("Narendra Modi", "987651", 101));
        stds.add(new Student("Amit Shah", "987653", 1020));
        stds.add(new Student("Rajnath Singh", "987652", 103));

        System.out.println(stds);
        Collections.sort(stds);
        System.out.println(stds);

    }
}
