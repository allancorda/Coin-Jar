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
public class TwoDollar extends Coin {
    private int value = 2;
    
    TwoDollar(){
        super(28.0,0.18);
    }
    
    TwoDollar(double d, double t){
        super(d,t);
    }
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
