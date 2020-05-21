/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author hv
 */
public class NhanVien {
    String hoTen;
    String ngaySinh;
    boolean gioiTinh;
    String ngayVaoLam;
    float hesoLuong;
    int soCon;
    final double luongCanBan=1050000;

    public NhanVien(String hoTen, String ngaySinh, boolean gioiTinh, String ngayVaoLam, float hesoLuong, int soCon) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.ngayVaoLam = ngayVaoLam;
        this.hesoLuong = hesoLuong;
        this.soCon = soCon;
    }

     
    public double tinhTroCap()
    {
        return this.soCon*300000;
    }
    public double tinhTienLuong()
    {
        return this.luongCanBan*this.hesoLuong;
    }
}
