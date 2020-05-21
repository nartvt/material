/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Vostro 3460
 */
public class KyBinh extends NguoiLinh {

    public KyBinh(int sucManh, String vuKhi) {
        super(sucManh, vuKhi);
    }

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
    
    @Override
    public int chienDau()
    {
        return this.sucManh=this.getSucManh()-3;
    }
    
}
