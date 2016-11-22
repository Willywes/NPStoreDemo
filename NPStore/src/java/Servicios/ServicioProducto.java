/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Interface.GenerarCRUD;
import dominio.Productos;
import dto.ProductoDTO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marti
 */
@Stateless
public class ServicioProducto implements GenerarCRUD<ProductoDTO> {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(ProductoDTO a) {
        
    }

    @Override
    public ProductoDTO read(Object clave) {
        return new ProductoDTO();
    }

    @Override
    public void update(ProductoDTO a) {
        
    }

    @Override
    public void delete(Object clave) {
        Productos p = em.find(Productos.class, clave);
        em.remove(p);
    }

    @Override
    public List<ProductoDTO> readAll() {
        return em.createNamedQuery("Producto.findAll", ProductoDTO.class)
                .getResultList();
    }

}
