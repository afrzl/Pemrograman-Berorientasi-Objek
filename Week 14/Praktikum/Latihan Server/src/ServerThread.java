import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerThread extends Thread {
    private Socket clientSocket = null;
    public ServerThread(Socket clientSocket) {
        super();
        this.clientSocket = clientSocket;
    }

    @Override
    public void run(){
        try (
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedInputStream bis = new BufferedInputStream(clientSocket.getInputStream());
                ObjectInputStream ois = new ObjectInputStream(bis);){
            Pesan pesan;
            while((pesan = (Pesan) ois.readObject())!=null){
                System.out.println("Server Receive: " + pesan.toString());
                out.println("Pesan Diterima");
                if(pesan.getPesan().equalsIgnoreCase("exit"))
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(clientSocket!=null){
                try {
                    clientSocket.close();
                } catch (IOException ex) {
                    Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}