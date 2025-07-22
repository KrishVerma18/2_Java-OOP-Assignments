public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("You must be 18+ to vote");
        } else {
            System.out.println("You can vote");
        }
    }
}
