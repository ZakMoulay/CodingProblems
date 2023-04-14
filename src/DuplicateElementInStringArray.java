import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInStringArray {
    public static void main(String[] args) {
        String[] stArray = {"Zak", "Ola", "James", "peter", "Sabrina", "Zak", "Sabrina"};
        Set<String> mySet = new HashSet<>();
        Set<String> ansSet = new HashSet<>();
        for (int i = 0; i < stArray.length; i++) {
            if ( !mySet.add(stArray[i]))
                ansSet.add(stArray[i]);
        }
        System.out.println(ansSet);
    }
}
