/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hockey.administrar;

import com.hockey.entidades.Usuario;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author PC_Angelo
 */
@Stateless
public class AdminUsuario implements AdminUsuarioLocal {

    @PersistenceContext(unitName = "hockeyserverPU")
    EntityManager em;

    private Integer consultarUltimoIDUsuario() {
        Integer maxID = 0;
        try {
            Query query = em.createQuery("select max(u.id) from Usuario u");
            maxID = (Integer) query.getSingleResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return maxID;
    }
    
    private Usuario consultarUsuario(String nomUsuario, Date fechaRegistro) {
        Usuario usuario = null;
        try {
            Query query = em.createQuery("select u from Usuario u WHERE u.nombre=:nombre and u.fecharegistro=:registro");
            query.setParameter("nombre", nomUsuario);
            query.setParameter("registro", fechaRegistro);
            usuario = (Usuario) query.getSingleResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return usuario;
    }

    @Override
    public Integer registrarUsuario(String nomUsuario, Date fechaRegistro) {
        Integer id = this.consultarUltimoIDUsuario();
        Usuario usuario = new Usuario(id, nomUsuario, fechaRegistro);
        try {
            em.persist(usuario);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return usuario.getId();
    }
    
    @Override
    public void registrarPuntaje(String nomUsuario, Date fechaRegistro, int puntaje){
        Usuario usuario = this.consultarUsuario(nomUsuario, fechaRegistro);
        usuario.setPuntaje(puntaje);
        try{
            em.merge(usuario);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
