/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devweb.jeudi8;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrateur
 */
@Entity
@Table(name = "lecteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lecteur.findAll", query = "SELECT l FROM Lecteur l"),
    @NamedQuery(name = "Lecteur.findById", query = "SELECT l FROM Lecteur l WHERE l.id = :id"),
    @NamedQuery(name = "Lecteur.findByIdentifiant", query = "SELECT l FROM Lecteur l WHERE l.identifiant = :identifiant"),
    @NamedQuery(name = "Lecteur.findByMotdepasse", query = "SELECT l FROM Lecteur l WHERE l.motdepasse = :motdepasse")})
public class Lecteur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 10)
    @Column(name = "identifiant")
    private String identifiant;
    @Basic(optional = true)
    @Column(name = "motdepasse")
    private String motdepasse;

    public Lecteur() {
    }

    public Lecteur(Integer id) {
        this.id = id;
    }

    public Lecteur(Integer id, String motdepasse) {
        this.id = id;
        this.motdepasse = motdepasse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lecteur)) {
            return false;
        }
        Lecteur other = (Lecteur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "devweb.jeudi8.Lecteur[ id=" + id + " ]";
    }
    
}
