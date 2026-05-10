import java.io.*;

public class ThrowsExample {

    public static void readFile() throws IOException {

        FileReader file = new FileReader("abc.txt");

        BufferedReader br = new BufferedReader(file);

        System.out.println(br.readLine());

        br.close();
    }

    public static void main(String[] args) {

        try {
            readFile();
        }

        catch(IOException e) {
            System.out.println("File not found");
        }
    }
}