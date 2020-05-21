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
public class Rectangular extends Shape{
    double length,width;
   // double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //double width;
    @Override
    public double dienTich() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.length*this.width;
    }
    @Override
    public String toString()
    {
        return "Hình Chữ Nhật: "+"Chiều Dài: "+this.length+"Chiều Rộng: "+this.width;
    }
    
}
