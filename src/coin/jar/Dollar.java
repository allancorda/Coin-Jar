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
public class Dollar extends Coin {
    private int value = 1;
    
    Dollar(){
        super(26.5,0.175);
    }
    
    Dollar(double d, double t){
        super(d,t);
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
