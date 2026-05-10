public class MultipleCatchExample {

    public static void main(String[] args) {

        try {

            int a = 10 / 0;
            System.out.println(a);
            String name = null;

            System.out.println(name.length());
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }

        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception occurred");
        }

        catch (Exception e) {
            System.out.println("General Exception");
        }
        finally{
            System.out.println("i will always execute because i am finally block");
        }
    }
}