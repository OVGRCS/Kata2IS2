/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Frecuencia<T> {
    private final HashMap<T,Integer> out = new HashMap<>();

    public Integer get(Object key) {
        return out.get(key);
    }

    public Set<T> keySet() {
        return out.keySet();
    }
    
    public void increment(T key){
        out.put(key, out.containsKey(key) ? out.get(key)+1 : 1);
    }
}
