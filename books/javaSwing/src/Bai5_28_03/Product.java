/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5_28_03;

import java.util.Comparator;

/**
 *
 * @author Vostro 3460
 */
public class Product {

    String loaiSP;
    String maSP;
    String tenSP;
    String donviTinh;
    double giaSP;

    public String getDonviTinh() {
        return donviTinh;
    }

    public void setDonviTinh(String donviTinh) {
        this.donviTinh = donviTinh;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Product(String loaiSP, String maSP, String tenSP, String donviTinh, double giaSP) {
        this.loaiSP = loaiSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donviTinh = donviTinh;
        this.giaSP = giaSP;
    }
    public Comparator<Product> ProCompare = new Comparator<Product>() {

        @Override
        public int compare(Product t, Product t1) {
            // throw new UnsupportedOperationException("Not supported yet.");
            return t.maSP.compareTo(t1.maSP);
        }
    };
}
