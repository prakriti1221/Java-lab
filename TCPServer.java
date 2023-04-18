import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(1254);
        Socket soc = ss.accept();

        DataInputStream ins = new DataInputStream(soc.getInputStream());
        DataOutputStream outs = new DataOutputStream(soc.getOutputStream());

        String s = ins.readUTF();
        outs.writeUTF("Hello Client");
        System.out.println("From client: " + s);

        ins.close();
        outs.close();
        soc.close();
        ss.close();
    }
}
