/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorV_1;
import java.lang.Integer;

/**
 *
 * @author santy
 */
public class Conversion {
    public String inToHex (int n) {
    
    return Integer.toHexString(n).toUpperCase();
    }
    
    public String toOctal(int n){
    
    return Integer.toOctalString(n);  
    }
    
    public String toBin(int n) {
    
    //return Integer.toBinaryString(n);
    return String.format("%4s", Integer.toString(n, 2)) //este metodo devuelve con base4, el anterior devuleve con Base2
    .replace(' ', '0');
    }
}
 