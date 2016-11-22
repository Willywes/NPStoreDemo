/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import dominio.*;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author marti
 */
public class CompraDTO implements Serializable{
    private Date fecha;

    public CompraDTO() {
    }

    public CompraDTO(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
