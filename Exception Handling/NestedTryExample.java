public class NestedTryExample {

    public static void main(String[] args) {

        try {

            try {
                int a = 10 / 0;
            }

            catch (ArithmeticException e) {
                System.out.println("This is inner exception");
            }

            int arr[] = {1, 2, 3};

            System.out.println(arr[10]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is outer exception");
        }
    }
}