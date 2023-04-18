import java.rmi.registry.*;

public class Client {
    public static void main(String[] argss) {
        try{
            Registry rgsty = LocateRegistry.getRegistry(9000);
            Calc obj = (Calc) rgsty.lookup("multiply");

            int value = obj.multiply(6,5);
            System.out.println("The value of Multiplication " + value);
        }
        catch(Exception e){
            System.out.println("Failed to connect to server" + e);
        }
    }
}