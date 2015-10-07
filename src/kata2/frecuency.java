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
public class frecuency {
    int[] element;
    HashMap<Integer,Integer> out;

    public frecuency(int[] element) {
        this.element = element;
        this.out = new HashMap<>();
    }
    public HashMap res(){
        int aux;
        for (int i = 0; i < element.length; i++) {
            if(out.containsKey(element[i])){
                aux = out.get(element[i]);
                aux++;
                out.put(element[i], aux);
            } else {
                out.put(element[i], 1);
            }
        }
        return out;
    }
}
