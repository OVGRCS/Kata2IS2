/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

/**
 *
 * @author usuario
 */
public class CalculaFrecuencia {
    
    public static<T> Frecuencia<T> computeFrecuencia(T[] vector){
        Frecuencia<T> out = new Frecuencia<>();
        for (T key : vector) {
            out.increment(key);
        }
        
        return out;
    }
    
}
