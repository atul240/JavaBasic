package Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_usingLambda {
    public static void main(String[] args) {
        ArrayList<Student> stds = new ArrayList<>();
        stds.add(new Student("Narendra Modi", "987654", 101));
        stds.add(new Student("Amit Shah", "987653", 102));
        stds.add(new Student("Rajnath Singh", "987652", 103));

        Collections.sort(stds, (a,b) -> a.getPhone().compareTo(b.getPhone()));

        System.out.println(stds);

    }
}
