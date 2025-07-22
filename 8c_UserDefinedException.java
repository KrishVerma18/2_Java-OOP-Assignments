class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class UserDefinedExample {
    static void validate(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age is less than 18, not eligible.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
