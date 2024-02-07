package hw.homework20;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server started. Waiting for client connection...");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String operations = "+,-,*,/";
        out.println(operations);

        String input = in.readLine();
        String[] inputArr = input.split(" ");
        double num1 = Double.parseDouble(inputArr[0]);
        double num2 = Double.parseDouble(inputArr[1]);
        String operator = inputArr[2];

        double result = 0.0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }

        out.println(result);

        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}
