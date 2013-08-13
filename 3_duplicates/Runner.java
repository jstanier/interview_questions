import java.util.Set;
import java.util.Random;

public class Runner {
    private static final int SIZE = 100;
    private static final int CAP = 100;
    
    public static void main(String[] args) {
        System.out.println("**** BRANDWATCH INTERVIEW QUESTION ****");
        System.out.println("****          DUPLICATES           ****");
        Random random = new Random();
        int[] input = new int[SIZE];
        for (int i=0; i<SIZE; i++) {
            input[i] = random.nextInt(CAP);
        }

        System.out.print("Input: [");
        for (int number : input) {
            System.out.print(number + " ");
        }
        System.out.print("]");
        System.out.println();
        
        DuplicateFinder finder = new DuplicateFinder();
        Set<Integer> duplicates = finder.find(input);

        System.out.print("Duplicates: [");
        for (int number : duplicates) {
            System.out.print(number + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
