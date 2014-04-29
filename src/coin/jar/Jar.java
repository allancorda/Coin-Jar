/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coin.jar;

import java.text.DecimalFormat;

/**
 *
 * @author Allan Corda
 */
public class Jar {
    
   // Website to check http://www.online-calculators.co.uk/volumetric/cubevolume.php
   //volume is length X width X height
   //           2.5       2       2     = 10 cm^3
    private double money = 0.0;
    private double length = 2.0;
    private double width = 2.5;
    private double height = 2.0;
    private double jarSize = length * width * height;
    private double jarLimit = 0.0;
    protected static DecimalFormat df = new DecimalFormat("#.##");
    
    Nickel nick = new Nickel();
    Dime dim = new Dime();
    Quarter quat = new Quarter();
    Dollar doll = new Dollar();
    TwoDollar dollTwo = new TwoDollar();
    
    
    public int isFull(int ammount, String kind){
        for(int i = 0; i < ammount; i++){
                
            if(kind.equals("nickel")){
                jarLimit += nick.getThichkness();
                if(jarLimit >= height){
                    System.out.println("Sorry Jar is full only able to enter " + i + " " + kind +".");
                    System.out.println("Returning " + (ammount - i) + " of " + kind +" back");
                    return i;
                }
            }else if(kind.equals("dime")){
                jarLimit += dim.getThichkness();
                if(jarLimit >= height){
                    System.out.println("Sorry Jar is full only able to enter " + i + " " + kind +".");
                    System.out.println("Returning " + (ammount - i) + " of " + kind +" back.");
                    return i;
                }
            }else if(kind.equals("quarter")){
                jarLimit += quat.getThichkness();
                if(jarLimit >= height){
                    System.out.println("Sorry Jar is full only able to enter " + i + " " + kind +".");
                    System.out.println("Returning " + (ammount - i) + " of " + kind +" back");
                    return i;
                }
            }else if(kind.equals("dollar")){
                jarLimit += doll.getThichkness();
                if(jarLimit >= height){
                    System.out.println("Sorry Jar is full only able to enter " + i + " " + kind +".");
                    System.out.println("Returning " + (ammount - i) + " of " + kind +" back.");
                    return i;
                }
            }else if(kind.equals("Two Dollar")){
                jarLimit += dollTwo.getThichkness();
                if(jarLimit >= height){
                    System.out.println("Sorry Jar is full only able to enter " + i + " " + kind +".");
                    System.out.println("Returning " + (ammount - i) + " of " + kind +" back.");
                    return i;
                }
            } 
        }
        return ammount;
    }
    
    public void printCoinAmmount(){
        // Good to know many many nickels or dimes are in the jar
        if(nick.getAmmount() > 0)
            System.out.println("Ammount of Nickel(s) are: " + nick.getAmmount());
        
        if(dim.getAmmount() > 0)
            System.out.println("Ammount of Dime(s) are: " + dim.getAmmount());
        
        if(quat.getAmmount() > 0)
            System.out.println("Ammount of Quarter(s) are: " + quat.getAmmount());
        
        if(doll.getAmmount() > 0)
            System.out.println("Ammount of Dollar(s) are: " + doll.getAmmount());
        
        if(dollTwo.getAmmount() > 0)
            System.out.println("Ammount of Two Dollar(s) are: " + dollTwo.getAmmount());
    }
    
    public double getAmmountCollected(){
        //Best and easy way to get total.
        double totalNick, totalDim, totalQuat, totalDoll, totalDollTwo;

        printCoinAmmount(); // print out all the coins.
        totalNick = (nick.getAmmount() * nick.getValue()) / 100.0;
        totalDim = (dim.getAmmount() * dim.getValue()) / 100.0;     
        totalQuat = (quat.getAmmount() * quat.getValue()) / 100.0;     
        totalDoll = (doll.getAmmount() * doll.getValue());      
        totalDollTwo = (dollTwo.getAmmount() * dollTwo.getValue());
      
        return totalNick + totalDim + totalQuat + totalDoll + totalDollTwo;
    }
    
    public void reset(){
        //need a new method of this one because the set method was taken to add addition ammount
        nick.setResetAmmount(0);
        dim.setResetAmmount(0);
        quat.setResetAmmount(0);
        doll.setResetAmmount(0);
        dollTwo.setResetAmmount(0);
        System.out.println("The Jar contains: $" + df.format(getAmmountCollected()) + "\n");
    }
    
    public void setNickleAmmount(int ammount){
        nick.setAmmount(isFull(ammount, "Nickel"));
    }
    public void setDimeAmmount(int ammount){
        dim.setAmmount(isFull(ammount, "Dime"));
    }
    
    public void setQuatAmmount(int ammount){
        quat.setAmmount(isFull(ammount, "Quarter"));
    }
    
    public void setDollAmmount(int ammount){
        doll.setAmmount(isFull(ammount, "Dollar"));
    }
    
    public void setTDollAmmount(int ammount){
        dollTwo.setAmmount(isFull(ammount, "Two Dollar"));
    }
    

    
    Jar(){
        
    }
    
    //if you want to implmenet another jar
    Jar(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
        this.jarSize = calculateSize();
    }
    
    
    //if they replace to a bigger jar college/university habbits
    public String changedJar (double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
        String returnSize = Double.toString(calculateSize());

        // I could return an array of what the entered for length width and height
        //but for now jarSize would be better
        return "Your new Jar Size is " + returnSize;
    }
    
    
    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the jarSize
     */
    public double getJarSize() {
        return jarSize;
    }
    
    /**
     * @return the Size of the jar.
     */
    public double calculateSize(){
        double size = getLength() * getWidth() * getHeight();
        return size;
    }
    
    
}
