package javaapplication21;


import java.net.*;
import java.io.*;


public class Client {
	
    public static void main(String[] args) throws Exception{
		
		System.out.println("****Client****");
		
		try{
			//opens a socket
			Socket cs = new Socket("127.0.0.1",5354 );
			
			//Open input and output stream
			OutputStream out = cs.getOutputStream();
			InputStream  in = cs.getInputStream();
			    
			//read and write to stream
			
			byte[] b = new byte[5000];
                                  
			BufferedReader br = new BufferedReader(new FileReader("D:\\newfile.txt "));
			in.read(b,0,b.length);	
				//write to stream
			cs.close();
			System.out.println("The file has been transfered!");
			
			}catch(Exception er){
			}
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
   
            
            

