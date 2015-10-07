/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer[] valores = {1,1,2,5,5,8,6,3,4,4,2,32,35,23,32,4,44};
        String[] nombres = {"Pedro","Antonio","Omaro","Pedro","Omaro","Omaro","Juan","Antonio"};
        
        Frecuencia<String> frecuencia = CalculaFrecuencia.computeFrecuencia(nombres);
        for (Object i : frecuencia.keySet()) {
            System.out.println(i+":"+frecuencia.get(i)+"veces");
        }
    }
}
