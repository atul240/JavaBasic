import java.util.HashSet;
import java.util.Set;

public class Java03_IsVowelPresent {
    public static void main(String[] args) {
        System.out.println(isContainsVowel("Hello"));
        System.out.println(isContainsVowel("TV"));
    }
    public static boolean isContainsVowel(String str){
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int i = 0;
        while(i < str.length()){
            if(set.contains(str.charAt(i))) return true;
            i+=1;
        }
        return false;
    }
}
