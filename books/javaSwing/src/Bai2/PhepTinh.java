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
public class PhepTinh {
    Float sothunhat;
    float sothuhai;
    public PhepTinh(float sothunhat, float sothuhai) {
        this.sothunhat = sothunhat;
        this.sothuhai = sothuhai;
    }
    public float tinhTong()
    {
         return (this.sothunhat+this.sothuhai);
        
    }
   public float tinhHieu()
    {
         return this.sothunhat-this.sothuhai;
        
    }
   public float tinhTich()
    {
         return (this.sothunhat*this.sothuhai);
        
    }
   public float tinhThuong()
    {
         return (this.sothunhat/this.sothuhai);
        
    }
}
