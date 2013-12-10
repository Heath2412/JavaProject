package pojo;
// Generated Dec 10, 2013 12:48:05 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PhieuDatHang generated by hbm2java
 */
@Entity
@Table(name="phieu_dat_hang"
    ,catalog="dbbestbuy"
)
public class PhieuDatHang  implements java.io.Serializable {


     private String mapd;
     private Thanhvien thanhvien;
     private Date thoigiandat;
     private Float tonggia;
     private String trangthai;
     private Set<Chitietphieudat> chitietphieudats = new HashSet<Chitietphieudat>(0);

    public PhieuDatHang() {
    }

	
    public PhieuDatHang(String mapd) {
        this.mapd = mapd;
    }
    public PhieuDatHang(String mapd, Thanhvien thanhvien, Date thoigiandat, Float tonggia, String trangthai, Set<Chitietphieudat> chitietphieudats) {
       this.mapd = mapd;
       this.thanhvien = thanhvien;
       this.thoigiandat = thoigiandat;
       this.tonggia = tonggia;
       this.trangthai = trangthai;
       this.chitietphieudats = chitietphieudats;
    }
   
     @Id 
    
    @Column(name="MAPD", unique=true, nullable=false, length=20)
    public String getMapd() {
        return this.mapd;
    }
    
    public void setMapd(String mapd) {
        this.mapd = mapd;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="NGUOIDAT")
    public Thanhvien getThanhvien() {
        return this.thanhvien;
    }
    
    public void setThanhvien(Thanhvien thanhvien) {
        this.thanhvien = thanhvien;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="THOIGIANDAT", length=19)
    public Date getThoigiandat() {
        return this.thoigiandat;
    }
    
    public void setThoigiandat(Date thoigiandat) {
        this.thoigiandat = thoigiandat;
    }
    
    @Column(name="TONGGIA", precision=12, scale=0)
    public Float getTonggia() {
        return this.tonggia;
    }
    
    public void setTonggia(Float tonggia) {
        this.tonggia = tonggia;
    }
    
    @Column(name="TRANGTHAI", length=7)
    public String getTrangthai() {
        return this.trangthai;
    }
    
    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="phieuDatHang")
    public Set<Chitietphieudat> getChitietphieudats() {
        return this.chitietphieudats;
    }
    
    public void setChitietphieudats(Set<Chitietphieudat> chitietphieudats) {
        this.chitietphieudats = chitietphieudats;
    }




}

