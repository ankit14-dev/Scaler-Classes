package sockets;

import java.net.Socket;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", 12345));
            System.out.println("Connected to server");
    
            socket.getOutputStream().write("Hello from client\n".getBytes());
            socket.getOutputStream().flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}