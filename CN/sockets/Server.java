package sockets;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 12345));
            System.out.println("Server is listening on port 12345");
            Socket conn=serverSocket.accept();
            Scanner sc=new Scanner(conn.getInputStream());
            String message=sc.nextLine();
            System.out.println("Message from client: " + message);
            conn.close();
            serverSocket.close();
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}