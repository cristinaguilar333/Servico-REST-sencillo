/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsAutos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "autos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autos.findAll", query = "SELECT a FROM Autos a")
    , @NamedQuery(name = "Autos.findByIdAutos", query = "SELECT a FROM Autos a WHERE a.idAutos = :idAutos")
    , @NamedQuery(name = "Autos.insertAuto", query = "INSERT INTO Autos (a.idAutos, a.modelo, a.marca, a.nombre) VALUES ('4', '2008', 'ford', 'lobo');")
    , @NamedQuery(name = "Autos.updateAuto", query = "SELECT a FROM Autos a WHERE a.marca = :marca")
    , @NamedQuery(name = "Autos.deleteAuto", query = "SELECT a FROM Autos a WHERE a.nombre = :nombre")})
public class Autos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_autos")
    private Integer idAutos;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "nombre")
    private String nombre;

    public Autos() {
    }

    public Autos(Integer idAutos) {
        this.idAutos = idAutos;
    }

    public Integer getIdAutos() {
        return idAutos;
    }

    public void setIdAutos(Integer idAutos) {
        this.idAutos = idAutos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutos != null ? idAutos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autos)) {
            return false;
        }
        Autos other = (Autos) object;
        if ((this.idAutos == null && other.idAutos != null) || (this.idAutos != null && !this.idAutos.equals(other.idAutos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wsAutos.Autos[ idAutos=" + idAutos + " ]";
    }
    
}
