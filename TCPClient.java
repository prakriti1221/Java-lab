import java.io.*;
import java.net.*;
public class TCPClient{
    public static void main(String[] args) throws IOException{
        Socket soc = new Socket("localhost", 1254);

        DataInputStream ins = new DataInputStream(soc.getInputStream());
        DataOutputStream outs = new DataOutputStream(soc.getOutputStream());

        outs.writeUTF("Hello Server");
        String s = ins.readUTF();
        System.out.println("From server: " + s);

        ins.close();
        outs.close();
        soc.close();
    }
}