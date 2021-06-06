/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Feri Winarta
 */
public class UrlInputStream {
    public static void main(String[] args) {
        URL url;
        URLConnection koneksi;
        try {
            url = new URL("http://www.buddhidharma.sch.id");
            koneksi = url.openConnection();
            InputStream is = koneksi.getInputStream();
            int byteRead = is.read();
            
            while(byteRead != -1) {
                System.out.println((char)byteRead);
                byteRead = is.read();
            }
            
        }catch(Exception e) {
            System.err.println(e);
        }
        
        
        
        
    }
}
