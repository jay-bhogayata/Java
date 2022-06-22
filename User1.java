import java.io.*;


public class User1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter string here :"); 
        String  p = br.readLine();
        System.out.println("Hello " + p);
    }
}
