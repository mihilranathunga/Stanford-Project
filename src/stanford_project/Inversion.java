/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stanford_project;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihil
 */
public class Inversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String buffer []= new String[100000];
        int i=1;

        Inversion demo = new Inversion();

         BufferedReader br = demo.reader();                                        // initializing buffered reader to read contents from the file

         buffer[0] = br.readLine();                                            // read first line

        while (buffer != null){
            
            
            try {
                System.out.println(buffer[i-1]);
                buffer[i]=br.readLine();
            } catch (IOException e) {
                e.getMessage();  //To change body of catch statement use File | Settings | File Templates.
            }
            
            i++;

            

        }


    }
     public BufferedReader reader() {                                            // read input file 

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Mihil/Documents/NetBeansProjects/Stanford_Project/src/stanford_project/IntegerArray.txt"));

        } catch (FileNotFoundException ex) {

            System.err.println(ex.getMessage());
            Logger.getLogger(Inversion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return br;
    }
}
