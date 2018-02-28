/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_3;

/**
 *
 * @author Estudiante
 */
public class Sequence {
    
    public String sequence;
    public String chromosome;
    public int start;
    public int end;
    
    public Sequence (){};

    public Sequence(String sequence, String chromosome, int start, int end) {
        this.sequence = sequence;
        this.chromosome = chromosome;
        this.start = start;
        this.end = end;
    }
        
}
