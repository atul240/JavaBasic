import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java05_RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        final List<String> collect = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
