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
public class XeHoi implements PhuongTienGiaoThong,DongCo {
    String tenXe;
    String hangSX;

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public XeHoi() {
    }

    public XeHoi(String tenXe, String hangSX) {
        this.tenXe = tenXe;
        this.hangSX = hangSX;
    }
    

    @Override
    public double tinhVanToc(double quangDuong, int thoiGian) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return quangDuong/thoiGian;
    }

    @Override
    public double tinhTieuThuNhienLieu(double quangDuong, double soLit) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return quangDuong/soLit;
    }
    
}
