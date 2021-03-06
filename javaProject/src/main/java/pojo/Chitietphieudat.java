package pojo;
// Generated Dec 10, 2013 12:48:05 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Chitietphieudat generated by hbm2java
 */
@Entity
@Table(name="chitietphieudat"
    ,catalog="dbbestbuy"
)
public class Chitietphieudat  implements java.io.Serializable {


     private String mactd;
     private Sanpham sanpham;
     private PhieuDatHang phieuDatHang;
     private Integer sldat;
     private String ghichu;

    public Chitietphieudat() {
    }

	
    public Chitietphieudat(String mactd) {
        this.mactd = mactd;
    }
    public Chitietphieudat(String mactd, Sanpham sanpham, PhieuDatHang phieuDatHang, Integer sldat, String ghichu) {
       this.mactd = mactd;
       this.sanpham = sanpham;
       this.phieuDatHang = phieuDatHang;
       this.sldat = sldat;
       this.ghichu = ghichu;
    }
   
     @Id 
    
    @Column(name="MACTD", unique=true, nullable=false, length=20)
    public String getMactd() {
        return this.mactd;
    }
    
    public void setMactd(String mactd) {
        this.mactd = mactd;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MASP")
    public Sanpham getSanpham() {
        return this.sanpham;
    }
    
    public void setSanpham(Sanpham sanpham) {
        this.sanpham = sanpham;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MAPD")
    public PhieuDatHang getPhieuDatHang() {
        return this.phieuDatHang;
    }
    
    public void setPhieuDatHang(PhieuDatHang phieuDatHang) {
        this.phieuDatHang = phieuDatHang;
    }
    
    @Column(name="SLDAT")
    public Integer getSldat() {
        return this.sldat;
    }
    
    public void setSldat(Integer sldat) {
        this.sldat = sldat;
    }
    
    @Column(name="GHICHU", length=200)
    public String getGhichu() {
        return this.ghichu;
    }
    
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }




}


