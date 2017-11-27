import java.net.*;
import java.io.*;


/**
 * @author Antoinette Addo
 * @version 2017.11.12
 */

public class Server {
	
    public static void main(String[] args) throws Exception{
		
        System.out.println("****Server****");
        
        try{
            
            ServerSocket ss = new ServerSocket(5354);            
            Socket cs = ss.accept();	//connection created
            System.out.println("Connection Accepted at: " + cs);
            
            //Open input stream
            DataInputStream in = new DataInputStream(cs.getInputStream());  //receive data 
            String s = in.readUTF();    //returns string
            
            FileOutputStream os1 = new FileOutputStream("D:\\t1.txt");
            FileOutputStream os2 = new FileOutputStream("D:\\t2.txt");
            FileOutputStream os3 = new FileOutputStream("D:\\t3.txt");
            byte[] b = s.getBytes();
           
            os1.write(b, 0, b.length);
            os2.write(b, 0, b.length);
            os3.write(b, 0, b.length);
            ss.close();
            cs.close();
         
             }catch(IOException e ){
                e.printStackTrace();     
            			}
                        }
}
