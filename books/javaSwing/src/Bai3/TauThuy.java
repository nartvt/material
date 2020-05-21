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
public class TauThuy implements PhuongTienGiaoThong,DongCo{
    String trongLuong;
    String sucTai;
    double vantocXuoidong;
    double vantocNguocDong;
    double tieuHaoNhienLieu;

    public String getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(String trongLuong) {
        this.trongLuong = trongLuong;
    }

    public String getSucTai() {
        return sucTai;
    }

    public void setSucTai(String sucTai) {
        this.sucTai = sucTai;
    }

    public double getVantocXuoidong() {
        return vantocXuoidong;
    }

    public void setVantocXuoidong(double vantocXuoidong) {
        this.vantocXuoidong = vantocXuoidong;
    }

    public double getVantocNguocDong() {
        return vantocNguocDong;
    }

    public void setVantocNguocDong(double vantocNguocDong) {
        this.vantocNguocDong = vantocNguocDong;
    }

    public double getTieuHaoNhienLieu() {
        return tieuHaoNhienLieu;
    }

    public void setTieuHaoNhienLieu(double tieuHaoNhienLieu) {
        this.tieuHaoNhienLieu = tieuHaoNhienLieu;
    }

    public TauThuy(String trongLuong, String sucTai, double vantocXuoidong, double vantocNguocDong, double tieuHaoNhienLieu) {
        this.trongLuong = trongLuong;
        this.sucTai = sucTai;
        this.vantocXuoidong = vantocXuoidong;
        this.vantocNguocDong = vantocNguocDong;
        this.tieuHaoNhienLieu = tieuHaoNhienLieu;
    }

    public TauThuy() {
    }

    @Override
    public double tinhVanToc(double quangDuong, int thoiGian) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return quangDuong/thoiGian+(this.getVantocXuoidong()-this.getVantocNguocDong());
    }

    @Override
    public double tinhTieuThuNhienLieu(double quangDuong, double soLit) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return quangDuong/(soLit-tieuHaoNhienLieu);
    }
    
}
