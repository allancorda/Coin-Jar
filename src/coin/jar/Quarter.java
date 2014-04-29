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
public class Quarter extends Coin {
    private int value = 25;
    private double diameter = 23.88;
    private double thickness = 0.158; //cm
    
    Quarter(){
        super(23.88,0.158);
    }
    
    Quarter(double d, double t){
        super(d,t);
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
