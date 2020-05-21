/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author hv
 */
public class Circle extends Shape{
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double dienTich() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Math.PI*Math.pow(radius, 2);
    }
    @Override
    public String toString()
    {
        return "Hình Tròn: "+"Bán Kính: "+this.radius+"Diện Tích: "+this.dienTich();
    }
    
}
