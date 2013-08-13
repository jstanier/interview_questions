public class Runner {
    public static void main(String[] args) {
        System.out.println("**** BRANDWATCH INTERVIEW QUESTION ****");
        System.out.println("****           FACTORIAL           ****");
        FactorialFinder finder = new FactorialFinder();
        int factorialOfFive = finder.find(5);
        int factorialOfSix = finder.find(6);
        System.out.println("Factorial of five is " + factorialOfFive);
        System.out.println("Factorial of six is " + factorialOfSix);
        try {
            int factorialOfMinusOne = finder.find(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Factorial of negative numbers is undefined");
        }
    }
}
