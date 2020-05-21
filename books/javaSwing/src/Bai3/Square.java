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
public class Square extends Shape{
    double edge;

    public Square(double edge) {
        this.edge = edge;
    }
    @Override
    double calPerimeter() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.edge*4;
    }

    @Override
    double calArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.edge*this.edge;
    }
    
    
}
