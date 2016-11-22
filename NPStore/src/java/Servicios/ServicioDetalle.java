/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Interface.GenerarCRUD;
import dominio.Detalle;
import dto.DetalleDTO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marti
 */
@Stateless
public class ServicioDetalle implements GenerarCRUD<DetalleDTO> {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(DetalleDTO a) {
        
    }

    @Override
    public DetalleDTO read(Object clave) {
        return new DetalleDTO();
    }

    @Override
    public void update(DetalleDTO a) {
        
    }

    @Override
    public void delete(Object clave) {
        Detalle d = em.find(Detalle.class, clave);
        em.remove(d);
    }

    @Override
    public List<DetalleDTO> readAll() {
        return em.createNamedQuery("Detalle.findAll", DetalleDTO.class)
                .getResultList();
    }

}
