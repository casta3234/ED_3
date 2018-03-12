/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String[] args)  {
        Lista sequences = new Lista();
        try{
            FileReader fr = new FileReader("sequence.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String input = br.readLine();
            while(input != null){
                String[] data = input.split(",");
                sequences.añadirFinal(new Sequence(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3])));
                input = br.readLine();
            }
            sequences.imprimir();
        }
        catch(IOException ex){
            
        }
    }
}
