/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 * @param <T>
 */
public class ShapeManager <T extends Shape>{
    List<T> shapeList;

    public List<T> getShapeList() {
        return shapeList;
    }

    public void setShapeList(List<T> shapeList) {
        this.shapeList = shapeList;
    }

    public ShapeManager() {
         shapeList = new ArrayList<>();
    }
//    public List<T>getshapeList()
//    {
//         
//            shapeList=new ArrayList<>();
//        return this.shapeList;
//    }
    public void addHinh(T s)
    {
        shapeList.add(s);
    }
    public int quatityHinh()
    {
        return shapeList.size();
    }
    public double AreaMax()
    {
       
        double max=0;
        for(T s:shapeList)
        {
             
            if(s.dienTich()>max)
            {
                max=s.dienTich();
            }
        }
        return max;
    }
    
}
