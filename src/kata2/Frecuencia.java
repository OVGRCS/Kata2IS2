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
public class Frecuencia {
    private final int[] in;

    public Frecuencia(int[] in) {
        this.in = in;
    }

    public int[] getIn() {
        return in;
    }
    
    public HashMap solver(){
        HashMap<Integer,Integer> out = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            if(out.containsKey(in[i])){
                out.put(in[i], out.get(in[i])+1);
            }else{
                out.put(in[i],1);
            }
        }
        return out;
    }
}
