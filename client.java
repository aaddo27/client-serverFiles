
//Antoinette Addo
//11.27.2017

import java.net.*;
import java.io.*;


public class Client {
	
    public static void main(String[] args) throws Exception{
		
		System.out.println("****Client****");
		
		try{
			//opens a socket
			Socket cs = new Socket("127.0.0.1",5354 );
			System.out.println("What files do you have Server?");
				
			BufferedReader br = new BufferedReader(new FileReader("D:\\newFile.txt"));	//read data from file
			byte[] b = new byte[5000];
			String c = br.readLine();
			
			//Open data to be sent and written
			DataOutputStream out = new DataOutputStream(cs.getOutputStream());
			out.writeUTF(c);
			
			cs.close();
			
		
		}catch(IOException error) {
			System.out.println("Error sending packet.");
		}
	}
}
   
            
            

