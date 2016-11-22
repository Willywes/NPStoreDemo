/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;
import dominio.*;
import java.io.Serializable;

public class CompraClienteDTO implements Serializable{
   
    private Compras compras;
    private Clientes clientes;

    public CompraClienteDTO() {
    }

    public CompraClienteDTO(Compras compra, Clientes cliente) {
        this.compras = compra;
        this.clientes = cliente;
    }

    public Compras getCompras() {
        return compras;
    }

    public void setCompras(Compras compras) {
        this.compras = compras;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    
}
