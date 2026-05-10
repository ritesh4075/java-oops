public class CustomExceptionExample {

    static void validate(int age) throws InvalidAgeException {

        if(age < 18) {

            throw new InvalidAgeException("Age must be 18 or above");
        }

        else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {

        try {

            validate(16);
        }

        catch(InvalidAgeException e) {

            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}