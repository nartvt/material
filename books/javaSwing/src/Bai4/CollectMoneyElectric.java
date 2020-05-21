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
public class CollectMoneyElectric extends CollectMoney{
    int numHead;
    int numLast;
    final int Price=2500;

    public CollectMoneyElectric() {
    }
    public CollectMoneyElectric(int numHead, int numLast) {
        this.numHead = numHead;
        this.numLast = numLast;
    }    

    public int getNumHead() {
        return numHead;
    }

    public void setNumHead(int numHead) {
        this.numHead = numHead;
    }

    public int getNumLast() {
        return numLast;
    }

    public void setNumLast(int numLast) {
        this.numLast = numLast;
    }
    
    @Override
    double calculateMoney() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int result=this.getNumLast()-this.getNumHead();
        if(result<100)
        {
            return result*Price;
        }
        else if(result<300)
        {
            return result*Price*1.05;
        }
        else
        {
            return result*Price*1.1;
        }
    }
}
