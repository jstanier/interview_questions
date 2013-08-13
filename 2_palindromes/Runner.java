public class Runner {
    public static void main(String[] args) {
        System.out.println("**** BRANDWATCH INTERVIEW QUESTION ****");
        System.out.println("****          PALINDROMES          ****");
        PalindromeChecker checker = new PalindromeChecker();
        String[] inputs = new String[] {
            "brandwatch",
            "abba",
            "racecar",
            "brighton"
        };
        for (String input : inputs) {
            boolean result = checker.check(input);
            if (result) {
                System.out.println(input + " is a palindrome");
            } else {
                System.out.println(input + " is not a palindrome");
            }
        }
    }
}
