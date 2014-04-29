/*
Volume of a coin
Volume = (pi)(d)(t) 

pi = constant pi 
d = diameter of the coin 
t = thickness of the coin.
*/

package coin.jar;

/**
 *
 * @author Allan Corda
 */
public class Coin {
    
    private int ammount;
    //double if you want accurate mesaurements
    private double diameter;
    private double thichkness;
    
    
    protected Coin(double d, double t){
        this.diameter = d;
        this.thichkness = t;
    }
    
    public double coinVolume(){
        return Math.PI*getDiameter()*getThichkness();
    }
    
    /**
     * @return the ammount
     */
    public int getAmmount() {
        return ammount;
    }

    /**
     * @param ammount the ammount to set
     */
    public void setAmmount(int ammount) {
        this.ammount += ammount;
    }
    
    /**
     * @param ammount to reset the ammount
     */
    public void setResetAmmount(int ammount) {
        this.ammount = ammount;
    }
    
    

    /**
     * @return the diameter
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }


    /**
     * @return the thichkness
     */
    public double getThichkness() {
        return thichkness;
    }

    /**
     * @param thichkness the thichkness to set
     */
    public void setThichkness(double thichkness) {
        this.thichkness = thichkness;
    }
    
    
    
}
