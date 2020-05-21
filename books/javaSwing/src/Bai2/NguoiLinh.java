/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Vostro 3460
 */
public class NguoiLinh {
    int sucManh;
    String vuKhi;

    public int getSucManh() {
        return sucManh;
    }

    public void setSucManh(int sucManh) {
        this.sucManh = sucManh;
    }

    public String getVuKhi() {
        return vuKhi;
    }

    public void setVuKhi(String vuKhi) {
        this.vuKhi = vuKhi;
    }

    public NguoiLinh(int sucManh, String vuKhi) {
        this.sucManh = sucManh;
        this.vuKhi = vuKhi;
    }
    public int chienDau()
    {
        return this.sucManh-=1;
    }
    
}
