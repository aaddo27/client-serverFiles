import java.net.*;
import java.io.*;


/**
 * @author Antoinette Addo
 * @version 2017.11.12
 */

public class Server {

    public static void main(String[] args) throws Exception{

		System.out.println("****Server****");
		//opens a socket
			ServerSocket ss = new ServerSocket(5327);
			Socket cs = ss.accept();	//connection created

			System.out.println("Connection Accepted: "+ ss);
			//Open input and output stream
			FileInputStream  in1 = new FileInputStream("E:\\s1.txt");
			//FileInputStream  in2 = new FileInputStream("D:\\s2.txt");
			//FileInputStream  in3 = new FileInputStream("D:\\s3.txt");
			//FileInputStream  in4 = new FileInputStream("D:\\s4.txt");
			byte b[] = new byte[50000];
			in1.read(b,0,b.length);		//stores in b ranging from begining of byte to end
			//in2.read(b,0,b.length);
                        //in3.read(b,0,b.length);
                        //in4.read(b,0,b.length);

                        OutputStream out = cs.getOutputStream();
                        out.write(b,0,b.length);

			// BufferedReader br = new BufferedReader(new FileReader(" ");
			// System.out.println(in.readUTF);

			// System.out.println(out.writeUTF);

			// //read and write to stream

			// byte[] b = new byte[50];
			// String s = b.readLine();
			// BufferedReader br = new BufferedReader(new FileReader(" ");
			// ods.writeUTF(s);	//write to stream
			ss.close();
			// System.out.println("The file has been transfered!");
//
//			catch(Exception er){
//				er.printStackTrace();
//			}
//		}
    }
}
