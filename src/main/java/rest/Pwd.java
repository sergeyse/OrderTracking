package rest;



import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * Created by sergeyse on 24.06.18.
 */
@Entity
@Table(name = "tabOrdre", schema = "dbo")
public class Pwd {
    @Id
    @Column(name = "Ordrenummer")
    private int pontun;

    @Column(name = "Navn")
    private String name;

    @NotEmpty
    @NotNull
    @Length(min = 9, max = 10)
    @Column(name = "KundeID")
    private long customerid;

    @Column(name = "Gateadresse")
    private String address;

    @Column(name = "Leveranseadresse")
    private String delivaddress;

    @Column(name = "TelefonLevering")
    private String delivPhone;
    @Column(name = "Telefon")
    private String phone;

    @Column(name = "Merke1")
    private String note1;
    @Column(name = "Merke2")
    private String note2;

    @Column(name = "Ordredato")
    private String orderdate;


    @GeneratedValue
    @NotEmpty
    @NotNull
    @Length(min = 6, max = 6)
    @Column(name = "Pwd")
    private String pwd;

    //  one to many for orders lines
    @OneToMany(mappedBy = "pwd")
    private Set<OrderDetail> details;

    public Set<OrderDetail> getOrderDetails() {
        return details;
    }




    public String getOrderdate() {

        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(long customerid) {
        this.customerid = customerid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getDelivaddress() {
        return delivaddress;
    }

    public void setDelivaddress(String delivaddress) {
        this.delivaddress = delivaddress;
    }

    public String getDelivPhone() {
        return delivPhone;
    }

    public void setDelivPhone(String delivPhone) {
        this.delivPhone = delivPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPontun() {
        return pontun;
    }

    public void setPontun(int pontun) {
        this.pontun = pontun;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
