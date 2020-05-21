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
public class NhanVienSX extends NhanVien{
    int soSanPham;
    final int dinhMucSanPham=200;
    final double donGiaSP=30000;

    public NhanVienSX(int soSanPham, String hoTen, String ngaySinh, boolean gioiTinh, String ngayVaoLam, float hesoLuong, int soCon) {
        super(hoTen, ngaySinh, gioiTinh, ngayVaoLam, hesoLuong, soCon);
        this.soSanPham = soSanPham;
    }
    public double tinhTienThuong()
    {
        if(this.soSanPham>this.dinhMucSanPham)
            return (this.soSanPham-this.dinhMucSanPham)*this.donGiaSP*0.05;
        else
            return 0;
    }
    public double tinhTroCap(boolean tangCa)
    {
        if(tangCa==true)
            return this.soCon*300000+200000;
        else
            return this.soCon*300000;
            
    }
    @Override
    public double tinhTienLuong()
    {
        return this.soSanPham*this.donGiaSP+this.tinhTienThuong();
    }
}
