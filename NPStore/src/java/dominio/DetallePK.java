/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author marti
 */
@Embeddable
public class DetallePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "productos_id")
    private int productosId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compras_id")
    private int comprasId;

    public DetallePK() {
    }

    public DetallePK(int productosId, int comprasId) {
        this.productosId = productosId;
        this.comprasId = comprasId;
    }

    public int getProductosId() {
        return productosId;
    }

    public void setProductosId(int productosId) {
        this.productosId = productosId;
    }

    public int getComprasId() {
        return comprasId;
    }

    public void setComprasId(int comprasId) {
        this.comprasId = comprasId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productosId;
        hash += (int) comprasId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePK)) {
            return false;
        }
        DetallePK other = (DetallePK) object;
        if (this.productosId != other.productosId) {
            return false;
        }
        if (this.comprasId != other.comprasId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.DetallePK[ productosId=" + productosId + ", comprasId=" + comprasId + " ]";
    }
    
}
