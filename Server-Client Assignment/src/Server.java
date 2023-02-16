import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("startaj 'Client' ...");


        try(ServerSocket serverSocket = new ServerSocket(1080);
            Socket socket = serverSocket.accept();
            BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream())){

            int n1 = bis.read();
            int n2 = bis.read();
            int sum = n1 + n2;
            String result = ("Rezultat: " + sum);
            bos.write(result.getBytes());
            bos.flush();




        }catch (IOException exc){
            System.out.println(exc.getMessage());
        }
    }
}
