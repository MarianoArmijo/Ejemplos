/** Metodo al que le de un array de numero enteros y un valor 
 * incremental que me devuelva un nuevo array
 * que sea el resultado de sumar el valor incrementado al array inicial. 
 */

package com.main.expontaneo;

public class ArrayIncremental {
	
    static int [] array = {3, 5, 8};
    static int incremental = 4;
	
    public static void incremental (int [] array, int a) {
    	
    	for (int i = 0; i < array.length; i++){
        	
            array[i] = array[i] + a;
        }
    }
    
    public static void main(String[] args) {
        
        incremental(array, incremental);
        
        for (int i = 0; i < array.length; i++){
        	
            System.out.println(array[i]);
        }
    }
}
