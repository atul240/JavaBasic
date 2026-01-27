import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java04_SortEvenOdd {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Predicate<Boolean> checkKey = (i) -> i == true;
        for(Map.Entry<Boolean, List<Integer>> entry : collect.entrySet()){
            boolean test = checkKey.test(entry.getKey());
            if(test){
                System.out.println("Even entries -----");
                System.out.println(entry.getValue());
            }else{
                System.out.println("Odd entries -----");
                System.out.println(entry.getValue());
            }
        }
    }
}
