/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;


public class Differrence extends Simplecalculator{

    public Differrence(double a, double b) {
        super(a, b);
    }

    @Override
    public double cal() {
      return a-b;
    }
   
}
