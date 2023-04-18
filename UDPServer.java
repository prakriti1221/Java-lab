import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws IOException
    {
        byte[] buff = new byte[256];

        DatagramSocket socket = new DatagramSocket(4445);

        DatagramPacket packet = new DatagramPacket(buff, buff.length);
        socket.receive(packet);
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String s = "Hello Client, I am Server";
        buff = s.getBytes();

        packet = new DatagramPacket(buff, buff.length, address, port);
        socket.send(packet);

        socket.close();
    }
}
