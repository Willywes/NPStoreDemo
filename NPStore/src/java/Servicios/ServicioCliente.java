/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Interface.GenerarCRUD;
import dominio.Clientes;
import dto.ClienteDTO;
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
public class ServicioCliente implements GenerarCRUD<ClienteDTO> {

    // esto da error de modulo @PersistenceContext
    private EntityManager em;

    @Override
    public void create(ClienteDTO dto) {
        Clientes bd = buscarClientePorRut(dto.getRut());

        if (bd != null) {
            try {
                throw new ServicioExcepcion("Ya existe Cliente con ese Rut " + dto.getRut());
            } catch (ServicioExcepcion ex) {
                Logger.getLogger(ServicioCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //convertir el dto en Entity
        Clientes cl = new Clientes();
        cl.setRut(dto.getRut());
        cl.setNombre(dto.getNombre());
        cl.setApellido(dto.getApellido());
        cl.setEmail(dto.getEmail());
        cl.setClave(dto.getClave());
        cl.setFNac(dto.getfNac());

        em.persist(cl);//insert
    }

    @Override
    public ClienteDTO read(Object clave) {
        Clientes c = em.find(Clientes.class, clave);

        if (c == null) {
            try {
                throw new ServicioExcepcion("El Cliente no Existe");
            } catch (ServicioExcepcion ex) {
                Logger.getLogger(ServicioCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        ClienteDTO dto = new ClienteDTO();
        dto.setRut(c.getRut());
        dto.setNombre(c.getNombre());
        dto.setApellido(c.getApellido());
        dto.setEmail(c.getEmail());
        dto.setClave(c.getClave());
        dto.setfNac(c.getFNac());

        return dto;

    }

    @Override
    public void update(ClienteDTO dto) {
        Clientes cl = buscarClientePorRut(dto.getRut());

        if (cl == null) {
            try {
                throw new ServicioExcepcion("NO existe Cliente con ese Rut " + dto.getRut());
            } catch (ServicioExcepcion ex) {
                Logger.getLogger(ServicioCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        cl.setRut(dto.getRut());
        cl.setNombre(dto.getNombre());
        cl.setApellido(dto.getApellido());
        cl.setEmail(dto.getEmail());
        cl.setClave(dto.getClave());
        cl.setFNac(dto.getfNac());

        em.persist(cl);//ins
    }

    @Override
    public boolean delete(Object clave) {

        Clientes c = em.find(Clientes.class, clave);
        try {
            em.remove(c);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

    @Override
    public List<ClienteDTO> readAll() {
        return em.createNamedQuery("Clientes.findAll", ClienteDTO.class)
                .getResultList();
    }

    public Clientes buscarClientePorRut(int rut) {
        Clientes c = null;

        try {
            c = em.createNamedQuery("Clientes.findByRut", Clientes.class)
                    .setParameter("rut", rut)
                    .getSingleResult();
        } catch (NoResultException ex) { //no hay ninguno
            c = null;
        } catch (NonUniqueResultException ex) { //existe más de uno
            throw ex;
        }

        return c;
    }
}
