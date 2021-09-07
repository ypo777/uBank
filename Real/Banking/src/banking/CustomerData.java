/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author yanpaingoo
 */
@Entity
@Table(name = "CUSTOMER_DATA", catalog = "", schema = "ONE")
@NamedQueries({
    @NamedQuery(name = "CustomerData.findAll", query = "SELECT c FROM CustomerData c")
    , @NamedQuery(name = "CustomerData.findByName", query = "SELECT c FROM CustomerData c WHERE c.name = :name")
    , @NamedQuery(name = "CustomerData.findByEmail", query = "SELECT c FROM CustomerData c WHERE c.email = :email")
    , @NamedQuery(name = "CustomerData.findByPassword", query = "SELECT c FROM CustomerData c WHERE c.password = :password")
    , @NamedQuery(name = "CustomerData.findByNrc", query = "SELECT c FROM CustomerData c WHERE c.nrc = :nrc")
    , @NamedQuery(name = "CustomerData.findByPhone", query = "SELECT c FROM CustomerData c WHERE c.phone = :phone")
    , @NamedQuery(name = "CustomerData.findByGender", query = "SELECT c FROM CustomerData c WHERE c.gender = :gender")
    , @NamedQuery(name = "CustomerData.findByBd", query = "SELECT c FROM CustomerData c WHERE c.bd = :bd")})
public class CustomerData implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Id
    @Basic(optional = false)
    @Column(name = "NRC")
    private String nrc;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "BD")
    private String bd;

    public CustomerData() {
    }

    public CustomerData(String nrc) {
        this.nrc = nrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        String oldNrc = this.nrc;
        this.nrc = nrc;
        changeSupport.firePropertyChange("nrc", oldNrc, nrc);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        String oldBd = this.bd;
        this.bd = bd;
        changeSupport.firePropertyChange("bd", oldBd, bd);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrc != null ? nrc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerData)) {
            return false;
        }
        CustomerData other = (CustomerData) object;
        if ((this.nrc == null && other.nrc != null) || (this.nrc != null && !this.nrc.equals(other.nrc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banking.CustomerData[ nrc=" + nrc + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
