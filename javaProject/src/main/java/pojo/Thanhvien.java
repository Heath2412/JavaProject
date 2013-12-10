package pojo;
// Generated Dec 10, 2013 12:48:05 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Thanhvien generated by hbm2java
 */
@Entity
@Table(name="thanhvien"
    ,catalog="dbbestbuy"
)
public class Thanhvien  implements java.io.Serializable {


     private String matv;
     private String hoten;
     private String email;
     private String zipcode;
     private String sodienthoai;
     private Set<PhieuDatHang> phieuDatHangs = new HashSet<PhieuDatHang>(0);
     private Set<TaikhoanDangnhap> taikhoanDangnhaps = new HashSet<TaikhoanDangnhap>(0);

    public Thanhvien() {
    }

	
    public Thanhvien(String matv) {
        this.matv = matv;
    }
    public Thanhvien(String matv, String hoten, String email, String zipcode, String sodienthoai, Set<PhieuDatHang> phieuDatHangs, Set<TaikhoanDangnhap> taikhoanDangnhaps) {
       this.matv = matv;
       this.hoten = hoten;
       this.email = email;
       this.zipcode = zipcode;
       this.sodienthoai = sodienthoai;
       this.phieuDatHangs = phieuDatHangs;
       this.taikhoanDangnhaps = taikhoanDangnhaps;
    }
   
     @Id 
    
    @Column(name="MATV", unique=true, nullable=false, length=20)
    public String getMatv() {
        return this.matv;
    }
    
    public void setMatv(String matv) {
        this.matv = matv;
    }
    
    @Column(name="HOTEN", length=100)
    public String getHoten() {
        return this.hoten;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    
    @Column(name="EMAIL", length=30)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="ZIPCODE", length=7)
    public String getZipcode() {
        return this.zipcode;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    @Column(name="SODIENTHOAI", length=16)
    public String getSodienthoai() {
        return this.sodienthoai;
    }
    
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="thanhvien")
    public Set<PhieuDatHang> getPhieuDatHangs() {
        return this.phieuDatHangs;
    }
    
    public void setPhieuDatHangs(Set<PhieuDatHang> phieuDatHangs) {
        this.phieuDatHangs = phieuDatHangs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="thanhvien")
    public Set<TaikhoanDangnhap> getTaikhoanDangnhaps() {
        return this.taikhoanDangnhaps;
    }
    
    public void setTaikhoanDangnhaps(Set<TaikhoanDangnhap> taikhoanDangnhaps) {
        this.taikhoanDangnhaps = taikhoanDangnhaps;
    }




}


