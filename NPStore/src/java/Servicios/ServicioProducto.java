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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marti
 */
@Stateless
public class ServicioProducto implements GenerarCRUD<ProductoDTO> {

    // este da error tembian @PersistenceContext
    private EntityManager em;

    @Override
    public void create(ProductoDTO dto) {
        Productos bd = buscarProductoPorId(dto.getId());

        if (bd != null) {
            
            try {
                throw new ServicioExcepcion("ya existe un producto con id " + dto.getId());
            } catch (ServicioExcepcion ex) {
                Logger.getLogger(ServicioProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        Productos p = new Productos();
        
        p.setId(dto.getId());
        p.setNombre(dto.getNombre());
        p.setTipo(dto.getTipo());
        p.setDescripcion(dto.getDescripcion());
        p.setPrecio(dto.getPrecio());
        p.setImagen(dto.getImagen());
        p.setStock(dto.getStock());

        em.persist(p);
    }

    @Override
    public ProductoDTO read(Object clave) {
        Productos db = new Productos();
        ProductoDTO p = new ProductoDTO();
        
        db = em.createNamedQuery("Productos.findById", Productos.class)
                    .setParameter("id", clave)
                    .getSingleResult();
        p.setId(db.getId());
        p.setNombre(db.getNombre());
        p.setTipo(db.getTipo());
        p.setDescripcion(db.getDescripcion());
        p.setPrecio(db.getPrecio());
        p.setImagen(db.getImagen());
        p.setStock(db.getStock());
         
        return p;
    }

    @Override
    public void update(ProductoDTO dto) {
        
        Productos bd = buscarProductoPorId(dto.getId());

        if (bd == null) {
            
            try {
                throw new ServicioExcepcion("No existe el producto con  " + dto.getId());
            } catch (ServicioExcepcion ex) {
                Logger.getLogger(ServicioProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        Productos p = new Productos();
        
        p.setId(dto.getId());
        p.setNombre(dto.getNombre());
        p.setTipo(dto.getTipo());
        p.setDescripcion(dto.getDescripcion());
        p.setPrecio(dto.getPrecio());
        p.setImagen(dto.getImagen());
        p.setStock(dto.getStock());

        em.persist(p);
    }

    @Override
    public boolean delete(Object clave) {
        Productos p = em.find(Productos.class, clave);
        
        try {
            em.remove(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<ProductoDTO> readAll() {
        return em.createNamedQuery("Producto.findAll", ProductoDTO.class)
                .getResultList();
    }
    
    public Productos buscarProductoPorId(int id) {
        Productos p = null;

        try {
            p = em.createNamedQuery("Productos.findById", Productos.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch (NoResultException ex) { //no hay ninguno
            p = null;
        } catch (NonUniqueResultException ex) { //existe más de uno
            throw ex;
        }

        return p;
    }

}
