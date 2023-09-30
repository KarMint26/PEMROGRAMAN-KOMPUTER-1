/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.opp;

import java.util.Scanner;

/**
 *
 * @author karel
 */
public class DuckSimulator {
    
    public static Scanner in = new Scanner(System.in);
    
    public static void getDuckAndBehavior(Duck d, String nameOfDuck){
        System.out.println("\nYou Choose " + nameOfDuck);
        System.out.println("1. QuackBehavior");
        System.out.println("2. FlyBehavior");
        System.out.print("\nPlease choose QuackBehavior or FlyBehavior : ");
        String inUser = in.nextLine();
                
        System.out.println("");
        
        if(inUser.equals("1")) {
            d.performQuack();
        } else {
            d.performFly();
        }
    }
    
    public static void ViewApp(){
        label:
        while(true) {
            System.out.println("\n   DUCK PROGRAMS BEHAVIOR");
            System.out.println("============================");
            System.out.println("1. Decoy Duck");
            System.out.println("2. Mallard Duck");
            System.out.println("3. Model Duck");
            System.out.println("4. Read Head Duck");
            System.out.println("5. Rubber Duck");
            System.out.println("x. Out Program");
            System.out.print("\nChoose duck that you want (example: 1) : ");
            String inputResult = in.nextLine();
        
            switch(inputResult){
                case "1" -> {
                    getDuckAndBehavior(new DecoyDuck(), "Decoy Duck");
                }
                case "2" -> {
                    getDuckAndBehavior(new MallardDuck(), "Mallard Duck");
                }
                case "3" -> {
                    getDuckAndBehavior(new ModelDuck(), "Model Duck");
                }
                case "4" -> {
                    getDuckAndBehavior(new RedHeadDuck(), "Red Head Duck");
                }
                case "5" -> {
                    getDuckAndBehavior(new RubberDuck(), "Rubber Duck");
                }
                case "x" -> {
                    break label;
                }
                default -> {
                    System.out.println("Input Invalid Numbers...");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        ViewApp();
    }

}
