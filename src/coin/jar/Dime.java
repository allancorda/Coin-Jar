/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coin.jar;

/**
 *
 * @author Allan Corda
 */
public class Dime extends Coin {
    private int value = 10;
    
    Dime(){
        super(18.03,0.122);
    }
    
    Dime(double d, double t){
        super(d,t);
    }
    
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    
}
