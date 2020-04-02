package hackerrank;

public class FindDuplicateElementFirstSolution {


    public static void main(String[] args) {

        String languages[] = {"Java", "Ruby", "Java"};

        // 1. compare each element solution O(n*m) worst case

        for (int i = 0; i < languages.length; i++) {
            for (int j = i + 1; j < languages.length; j++) {
                if (languages[i].equals(languages[j])) {
                    System.out.println("duplicate element: " + languages[i]);
                }
            }
        }

        // 2. using HashSet O(n)






        // 3. using HashMap




    }
}
