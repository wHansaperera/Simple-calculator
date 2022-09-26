/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;
import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        double x= sc.nextDouble();
        System.out.println("Enter second number");
        double y= sc.nextDouble();
        
        Differrence h= new Differrence(x,y);
        Adiition n= new Adiition(x,y);
        Multiple p = new Multiple(x,y);
        System.out.println("Addition : "+n.cal());
         System.out.println("Difference : "+h.cal());
          System.out.println("Multiplication  : "+p.cal());
        
        
    }
}
