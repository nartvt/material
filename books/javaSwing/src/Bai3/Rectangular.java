/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author hv
 */
public class Rectangular extends Shape{
    double length;
    double width;

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calPerimeter() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 2*(this.length+this.width);
    }

    @Override
    double calArea() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.length*this.width;
    }
    
}
