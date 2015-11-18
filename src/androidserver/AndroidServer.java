/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidserver;

import com.sun.corba.se.spi.activation.Server;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author mac
 */
public class AndroidServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           System.out.println("Server Start and Waiting for connection");
        ServerSocket server=new ServerSocket(12345);
        Socket client=server.accept();
       // InputStream input=client.getInputStream();
        PrintWriter writer=new PrintWriter(client.getOutputStream(),true);
        writer.println("hello abdullah masood janii");
        writer.close();
       
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
    
}
