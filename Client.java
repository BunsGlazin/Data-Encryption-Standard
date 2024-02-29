import java.io.*;
import java.net.Socket;
 
public class Client {
    public static void main(String args[]) throws Exception{
        Socket s=new Socket("localhost",8080);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str = "", str2 = "";
        System.out.println("CLIENT SIDE:");
        while(!str.equals("stop")) {
            System.out.print("\nEnter 8-letter plain text: ");
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2=din.readUTF();
            System.out.println("\nCipher Text: " + str2);
            str="stop";
        }
        dout.close();
        s.close();      
    }
}