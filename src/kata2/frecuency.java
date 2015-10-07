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
    private final int[] element;

    public int[] getElement() {
        return element;
    }
    public frecuency(int[] element) {
        this.element = element;
    }
    public HashMap res(){
        HashMap<Integer,Integer> out = new HashMap<>();
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
