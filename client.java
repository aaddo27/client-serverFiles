/*
 * The client then will start up and create a socket based 
 * on the information provided by the server.
 */
package localchat;

import java.net.*;
import java.io.*;
import java.util.Scanner;

/**
 * @author Antoinette Addo
 * @version 2017.10.12
 */

public class Client {
	
    public static void main(String[] args) throws Exception{
		
		system.out.println("****Client****")
		
		try{
			//opens a socket
			Socket cs = new Socket("127.0.0.1", 4380);
			
			//Open input and output stream
			DataOutputStream ods = new DataOutputStream(cs.getOutputStream());
			DataInputStream  ids = new DataInputStream(cs.getInputStream());
			
			//read and write to stream
			
			byte[] b = new byte[50];
			String s = b.readLine();
			BufferedReader br = new BufferedReader(new FileReader(" ");
			ods.writeUTF(s);	//write to stream
			cs.close();
			System.out.println("The file has been transfered!");
			
			}catch(Exception er){
				er.printStackTrace();
			}
		}
		
	
		
		
		
		
		
		
		catch(SocketException error) {
			System.out.println("Socket could not be created at port: " + port);
		}
		catch(UnknownHostException error) {
			System.out.println("Host could not be found.");
		}
		catch(IOException error) {
			System.out.println("Error sending packet.");
		}
	}
}
   
            
            

