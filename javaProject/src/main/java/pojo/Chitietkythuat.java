package pojo;
// Generated Dec 10, 2013 12:48:05 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Chitietkythuat generated by hbm2java
 */
@Entity
@Table(name="chitietkythuat"
    ,catalog="dbbestbuy"
)
public class Chitietkythuat  implements java.io.Serializable {


     private ChitietkythuatId id;
     private Sanpham sanpham;
     private String chitiet;
     private String mota;

    public Chitietkythuat() {
    }

	
    public Chitietkythuat(ChitietkythuatId id, Sanpham sanpham) {
        this.id = id;
        this.sanpham = sanpham;
    }
    public Chitietkythuat(ChitietkythuatId id, Sanpham sanpham, String chitiet, String mota) {
       this.id = id;
       this.sanpham = sanpham;
       this.chitiet = chitiet;
       this.mota = mota;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="masp", column=@Column(name="MASP", nullable=false, length=20) ), 
        @AttributeOverride(name="datdiem", column=@Column(name="DATDIEM", nullable=false, length=100) ) } )
    public ChitietkythuatId getId() {
        return this.id;
    }
    
    public void setId(ChitietkythuatId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MASP", nullable=false, insertable=false, updatable=false)
    public Sanpham getSanpham() {
        return this.sanpham;
    }
    
    public void setSanpham(Sanpham sanpham) {
        this.sanpham = sanpham;
    }
    
    @Column(name="CHITIET", length=500)
    public String getChitiet() {
        return this.chitiet;
    }
    
    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }
    
    @Column(name="MOTA", length=4000)
    public String getMota() {
        return this.mota;
    }
    
    public void setMota(String mota) {
        this.mota = mota;
    }




}


