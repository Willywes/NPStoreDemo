/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Interface.GenerarCRUD;
import dominio.Compras;
import dto.CompraDTO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marti
 */
@Stateless
public class ServicioCompra implements GenerarCRUD<CompraDTO> {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(CompraDTO a) {
        
    }

    @Override
    public CompraDTO read(Object clave) {
        return new CompraDTO();
    }

    @Override
    public void update(CompraDTO a) {
        
    }

    @Override
    public void delete(Object clave) {
        Compras c = em.find(Compras.class, clave);
        em.remove(c);
    }

    @Override
    public List<CompraDTO> readAll() {
        return em.createNamedQuery("Compra.findAll", CompraDTO.class)
                .getResultList();
    }

}
