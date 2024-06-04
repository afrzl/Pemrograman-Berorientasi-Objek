package Frontend;

import Backend.Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server {
    private static String output;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int portNumber = 4444;
        try (
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        )
        {
            String msg;
            while(!(msg = in.readLine()).equalsIgnoreCase("/exit"))
            {
                System.out.println("Server Receive: " + msg);

                String kategori;
                Answer answer = new Answer();
                ArrayList<Answer> list = new Answer().filterAsk(msg);
                if (answer.filterAsk(msg).isEmpty()) {
                    output = "gapaham xixixi";
                    System.out.println("Kamu : " + msg);
                    out.println(output);
                } else {
                    for (Answer ans : list) {
                        kategori = ans.getCategory();
                        output = answer.searchAnswer(kategori);
                        System.out.println("Kamu : " + msg + "\n" + "Bot : " + output + "\n");
                        out.println(output);
                    }
                }
            }
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
