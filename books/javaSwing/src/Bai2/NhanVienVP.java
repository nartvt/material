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
public class NhanVienVP extends NhanVien {
    int soNgayVang;
    final int dinhMucVang=2;
    final double phat=50000;

    public NhanVienVP(int soNgayVang, String hoTen, String ngaySinh, boolean gioiTinh, String ngayVaoLam, float hesoLuong, int soCon) {
        super(hoTen, ngaySinh, gioiTinh, ngayVaoLam, hesoLuong, soCon);
        this.soNgayVang = soNgayVang;
    }

    
    
    public double tinhTienPhat()
    {
        if(this.soNgayVang>this.dinhMucVang)
            return (this.soNgayVang-this.dinhMucVang)*this.phat;
        else
            return 0;
    }
    public double tinhTroCap()
    {
        if(this.gioiTinh==false)
        {
             return this.soCon*300000*1.2;
        }
        else
        {
          return this.soCon*300000;
        }    
    }
    @Override
    public double tinhTienLuong()
    {
        return this.luongCanBan*this.hesoLuong-this.tinhTienPhat();
    }
}
