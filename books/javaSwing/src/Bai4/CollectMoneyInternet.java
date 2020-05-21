/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author hv
 */
public class CollectMoneyInternet extends CollectMoney{
    int numMonth;
    final int Price=28500;

    public int getNumMonth() {
        return numMonth;
    }

    public void setNumMonth(int numMonth) {
        this.numMonth = numMonth;
    }

    public CollectMoneyInternet() {
    }

    public CollectMoneyInternet(int numMonth) {
        this.numMonth = numMonth;
    }
    @Override
    double calculateMoney() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(this.getNumMonth()<3)
        {
            return this.getNumMonth()*Price;
        }
        else if(this.getNumMonth()<6)
        {
            return this.getNumMonth()*Price*0.95;
        }
        else
        {
            return this.getNumMonth()*Price*0.9;
        }
    }
    
}
