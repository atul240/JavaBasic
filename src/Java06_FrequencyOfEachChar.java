import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java06_FrequencyOfEachChar {
    public static void main(String[] args) {
        String inputString = "Atul Agnihotri";
        final Map<Character, Long> map = inputString.chars().mapToObj(m -> (char) m).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
