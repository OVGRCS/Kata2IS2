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
public class Frecuencia<T> {
    private final T[] in; 

    public Frecuencia(T[] in) {
        this.in = in;
    }

    public T[] getIn() {
        return in;
    }
    
    public HashMap solver(){
        HashMap<T,Integer> out = new HashMap<>();
        
        for (int i = 0; i < in.length; i++) {
            if(out.containsKey(in[i])){
                out.put(in[i], out.get(in[i])+1);
            }else{
                out.put(in[i], 1);
            }
        }
        return out;
    }
}