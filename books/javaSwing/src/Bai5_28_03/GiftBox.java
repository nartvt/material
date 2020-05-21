/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5_28_03;

/**
 *
 * @author hv
 */
public class GiftBox {
    String hinhDang;
    String mauSac;
    final int phiHop=10000;

    public GiftBox(String hinhDang, String mauSac) {
        this.hinhDang = hinhDang;
        this.mauSac = mauSac;
    }
    
    class Gift{
        String tenQua;
        int trongLuong;
        final int donGia=200;

        public Gift() {
        }

        public Gift(String tenQua, int trongLuong) {
            this.tenQua = tenQua;
            this.trongLuong = trongLuong;
        }
        public double tinhTien()
        {
            return phiHop+trongLuong*donGia;
        }
    }
//    GiftBox.Gift g=new Gift();
//    public double tinhTien()
//    {
//        return phiHop+g.donGia*g.trongLuong;
//    }
}
