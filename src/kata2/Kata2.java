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
        int[] valores = {1,1,2,5,5,8,6,3,4,4,2};
        frecuency obj = new frecuency(valores);
        HashMap<Integer,Integer> salida = obj.res();
        for (int i : valores) {
            System.out.println(valores[i]+":"+valores.get(valores[i]+"veces"));
        }
    }
}
