/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author SC
 */
public class Lista {
    
    private Sequence cabeza = null;
    
    public boolean vacia(){
        return this.cabeza == null; 
        
    }
    
    public void añadirInicio(Sequence nuevoNodo){
        nuevoNodo.setSiguiente(this.cabeza);
        this.cabeza = nuevoNodo;
    }
    
    public void añadirFinal(Sequence nuevoNodo){
        if (vacia()){
            this.cabeza = nuevoNodo;                     
        }
        else{
            Sequence temp = this.cabeza;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();         
            }
            temp.setSiguiente(nuevoNodo);
        }
    }
    
    public void añadirPosicion(Sequence nuevoNodo, int posicion){
        Sequence temp = this.cabeza;
        for(int i = 0; i < posicion-1; i++ ){
            temp = temp.getSiguiente();
        }
        nuevoNodo.setSiguiente(temp.getSiguiente()); 
        temp.setSiguiente(nuevoNodo);           
    }
       
    public void eliminarInicio(){
        Sequence temp = this.cabeza;
        this.cabeza = this.cabeza.getSiguiente();
        temp = null;
        System.gc();
    }
    
    public void eliminarFinal(){
        Sequence pre = this.cabeza;
        Sequence temp = this.cabeza.getSiguiente().getSiguiente();
        while (temp != null){            
            pre = pre.getSiguiente();
            temp = temp.getSiguiente();
        }        
        pre.setSiguiente(null);
        System.gc();
    }
    
    public void eliminarPosicion(int posicion){
        Sequence temp = this.cabeza;
        Sequence eliminado;
        for(int i = 0; i < posicion-1; i++){
            temp = temp.getSiguiente();
        }
        eliminado = temp.getSiguiente();
        temp.setSiguiente(temp.getSiguiente().getSiguiente()); 
        eliminado = null;
        System.gc();
    }
    
 
    
    public void imprimir(){
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Sequence temp = this.cabeza;
        try{
            while(temp != null){
                bw.write(temp.toString());
                temp = temp.getSiguiente();
            }
            bw.flush();
        }
        catch(IOException ex){
        }
    }
    
}
