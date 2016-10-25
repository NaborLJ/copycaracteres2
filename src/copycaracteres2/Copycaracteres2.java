/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copycaracteres2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author oracle
 */
public class Copycaracteres2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File texto = new File("texto11.txt");
        texto.createNewFile();
        
        BufferedReader read = new BufferedReader(new FileReader("texto10.txt"));
        PrintWriter write = new PrintWriter("texto11.txt");
        String aux;
        while((aux = read.readLine()) != null){
            write.println(aux);
        }        
        read.close();
        write.close();

    }
    
}
