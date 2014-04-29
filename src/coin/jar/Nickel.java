package coin.jar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allan Corda
 */
public class Nickel extends Coin {
    private int value = 5;

    Nickel(){
        super(21.2,0.176);
    }
    
    Nickel(double d, double t){
        super(d,t);
    }
    
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    
}
