/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coin.jar;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Allan Corda
 */
public class CoinJar {
    
    private static int value;
    private static String ans;
    protected static Jar jar = new Jar();
    protected static Scanner input = new Scanner(System.in).useDelimiter("[^A-Za-z0-9]+");
    protected static Scanner numCoins = new Scanner(System.in).useDelimiter("[^0-9]+");
    protected static DecimalFormat df = new DecimalFormat("#.##");
    
    private static boolean KeepGoing = true;
    
    public static void promptTheUser(){
        
        System.out.println("Choose the following options:");
        System.out.println("Enter (0) for All Coin Options.");
        System.out.println("Enter (1) for Nickel(s).");
        System.out.println("Enter (2) for Dime(s).");
        System.out.println("Enter (3) for Quarter(s).");
        System.out.println("Enter (4) for Dollar(s).");
        System.out.println("Enter (5) for Two Dollar(s).");
        System.out.println("Enter (7) to Resert Jar.");
        System.out.println("Enter (8) for Total Ammount in Jar.");
        System.out.println("Enter (9) to Exit.");
        
    }
    
    public static void validCanadianCurrency(String ans , int value, String kind){
        if(("y").equalsIgnoreCase(ans)){
                //caluclate and add money to jar
                if(kind.equals("nickel")){
                    jar.setNickleAmmount(value);
                }else if(kind.equals("dime")){
                    jar.setDimeAmmount(value);
                }else if(kind.equals("quarter")){
                    jar.setQuatAmmount(value);
                }else if(kind.equals("dollar")){
                    jar.setDollAmmount(value);
                }else if(kind.equals("twoDollar")){
                    jar.setTDollAmmount(value);
                }
                
                System.out.println("Your total is: " + jar.getAmmountCollected());
        }else if(("n").equalsIgnoreCase(ans)){
            System.out.println("Sorry Only Canadian Currency can be entered.\n");
        } else {
            boolean noRightAns = true;
            while(noRightAns){
                System.out.print("\nYour answer was invlaid, is it Canadian Currency (Y/N): ");
                String ansNic = input.next();
                 
                 if(("n").equalsIgnoreCase(ansNic) || ("y").equalsIgnoreCase(ansNic)){
                    noRightAns = false;
                    validCanadianCurrency(ansNic, value, kind);
                }
            }
        }
    }
    //Easy to make a method and call it. rahter than put clump it together
    public static void PromptNickel(){
        System.out.print("How many are Nickels: ");
        int nickles = numCoins.nextInt();
        
        // if the person hasn't enter any money no point in asking if it is canadian
        if(nickles > 0){    
            System.out.print("\nIs it Canadian Currency (Y/N): ");
            ans = input.next();
            validCanadianCurrency(ans, nickles, "nickel");
        }
    }
    //Easy to make a method and call it. rahter than put clump it together
    public static void PromptDime(){
            
        System.out.print("How many are Dimes: ");
        int dimes = numCoins.nextInt();
        
        // if the person hasn't enter any money no point in asking if it is canadian
        if(dimes > 0){
            System.out.print("\nIs it Canadian Currency (Y/N): ");
            ans = input.next();
            validCanadianCurrency(ans, dimes, "dime");
        }

    }
    //Easy to make a method and call it. rahter than put clump it together
    public static void PromptQuarter(){
            
        System.out.print("How many are Quarter: ");
        int quarters = numCoins.nextInt();
        
        // if the person hasn't enter any money no point in asking if it is canadian
        if(quarters > 0){
            System.out.print("\nIs it Canadian Currency (Y/N): ");
            ans = input.next();
            validCanadianCurrency(ans, quarters, "quarter");
        }
            
    }
    //Easy to make a method and call it. rahter than put clump it together
    public static void PromptDollar(){
            
        System.out.print("How many are Dollar: ");
        int dollars = numCoins.nextInt();
        
        // if the person hasn't enter any money no point in asking if it is canadian
        if(dollars > 0){
            System.out.print("\nIs it Canadian Currency (Y/N): ");
            ans = input.next();
            validCanadianCurrency(ans, dollars, "dollar");
        }
    }
    
    //Easy to make a method and call it. rahter than put clump it together
    public static void PromptTwoDollar(){
        
        System.out.print("How many are 2 Dollars: ");
        int twoDollars = numCoins.nextInt();
        
        // if the person hasn't enter any money no point in asking if it is canadian
        if(twoDollars > 0){
            System.out.print("\nIs it Canadian Currency (Y/N): ");
            ans = input.next();
            validCanadianCurrency(ans, twoDollars, "twoDollar");
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Main function
        System.out.println("Welcome to coin Jar System.");
        while(KeepGoing){
            promptTheUser();
            System.out.print("Your Option is: ");
            int userInput = numCoins.nextInt();
            System.out.println("");
            if(userInput == 0){
                PromptNickel();
                PromptDime();
                PromptQuarter();
                PromptDollar();
                PromptTwoDollar();
            }else if (userInput == 1){
                PromptNickel();
            }else if (userInput == 2){
                PromptDime();
            }else if (userInput == 3){
                PromptQuarter();
            }else if (userInput == 4){
                PromptDollar();
            }else if (userInput == 5){
                PromptTwoDollar();
            }else if (userInput == 7){
                System.out.println("Jar Reset");
                jar.reset();
            }else if (userInput == 8){
                System.out.println("The total Ammount of money in the jar is: $" + df.format(jar.getAmmountCollected()));
                System.out.println("");
            }else if (userInput == 9){
                System.out.println("\nThank you for your time. ");
                KeepGoing = false;
            }else {
                System.out.println("\nSorry invaild input. Please try again. ");
                System.out.println("");
            }
          System.out.println("");
        }

    }
}
