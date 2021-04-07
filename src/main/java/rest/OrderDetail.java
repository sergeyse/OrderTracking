package rest;

import javax.persistence.*;

/**
 * Created by Sergiy on 26.6.2018.
 */
@Entity
@Table(name = "tabOrdrelinje", schema = "dbo")
public class OrderDetail {
    @Id
    @GeneratedValue
    @Column(name = "LinjeID")
    private Long lineID;

    @Column(name = "Ordrenummer",  insertable=false, updatable=false)
    private int pontun;


    @Column(name = "VareTekst")
    private String unitType;

    @Column(name = "SpacerID")
    private String SpacerID;


    @Column(name = "Bredde")
    private String width;

    @Column(name = "Høyde")
    private String hight;

    @Column(name = "StatusID")
    private int statusID;

    @ManyToOne
    @JoinColumn(name = "Ordrenummer")
    private  Pwd pwd;

    public Pwd getPwd() {
        return pwd;
    }

    public void setPwd(Pwd pwd) {
        this.pwd = pwd;
    }

    public Long getLineID() {
        return lineID;
    }

    public void setLineID(Long lineID) {
        this.lineID = lineID;
    }

    public int getPontun() {
        return pontun;
    }

    public void setPontun(int pontun) {
        this.pontun = pontun;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getSpacerID() {
        return SpacerID;
    }

    public void setSpacerID(String spacerID) {
        SpacerID = spacerID;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }
}
