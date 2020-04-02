package hackerrank;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {

    public static void main(String[] args) {

        String duplicates[] = new String[] {"java", "python", "sql", "java", "sql"};

        Set nonDuplicateSet = new HashSet<>();
        Set duplicateSet = new HashSet<>();

        for (String str : duplicates) {
            if (!nonDuplicateSet.contains(str)){
                nonDuplicateSet.add(str);
            } else {
                duplicateSet.add(str);
            }
        }
        System.out.println(duplicateSet);
    }





}
