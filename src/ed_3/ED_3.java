/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Random;

/**
 *
 * @author Estudiante
 */
public class ED_3 {


    
    public static String chromosome(){
        Random r = new Random();
        return "chr" + (r.nextInt(23)+ 1);       
    }
    
    public static String nucleotide(){
        Random r = new Random();
        
        switch(r.nextInt(4)){
            case 0: return "A";
            case 1:  return "C";
            case 2:  return "G";
            case 3:  return "T";
            default: return "";                                  
        }
    }
    
    public static String sequence (int length){
        if (length == 1){
            return nucleotide();
        }
        else
            return nucleotide() + sequence(length - 1);
    }
    
    public static void s () {
        try{
            FileWriter file = new FileWriter("sequence.txt");
            BufferedWriter bw = new BufferedWriter(file);
            Random r = new Random();
            int length, start, datasize = 15;
            String e;
            for (int i = 0; i < datasize; i++){
                length = r.nextInt(50) + 1;
                start = r.nextInt(1000) + 1;
                e = sequence(length) + "," + chromosome() + "," + i + "," + (i + length -1);
                bw.write(e + "\n");
            }
            bw.flush();
            bw.close();
        }
        catch(IOException e){
            
        }
    }
    
    public static void main(String[] args)  {
        s();
    }
    
}
