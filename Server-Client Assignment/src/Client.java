import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1080);
             BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream())) {

            Scanner scanner =  new Scanner(System.in);
            System.out.println("Unesite prvi broj: ");
            int n1 = scanner.nextInt();
            System.out.println("Unesite drugi broj: ");
            int n2 = scanner.nextInt();

            bos.write(n1);
            bos.write(n2);
            bos.flush();

            String result = bis.readLine();
            System.out.println(result);






        }catch (IOException exc){
            System.out.println(exc.getMessage());
        }
    }
}
