package hw.homework20;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP = "127.0.0.1";
        int serverPort = 1234;

        Socket socket = new Socket(serverIP, serverPort);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String operations = in.readLine();
        System.out.println("Available operations: " + operations);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter two numbers and an operator (e.g., 5 3 +): ");
        String input = userInput.readLine();

        out.println(input);

        String result = in.readLine();
        System.out.println("Result: " + result);

        in.close();
        out.close();
        userInput.close();
        socket.close();
    }
}
