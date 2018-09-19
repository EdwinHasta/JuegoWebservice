/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hockey.administrar;

import com.hockey.entidades.Recurso;
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
public class AdminRecurso implements AdminRecursoLocal {

    @PersistenceContext(unitName = "hockeyserverPU")
    EntityManager em;

    private Integer consultarUltimoIDRecurso() {
        Integer maxID = 0;
        try {
            Query query = em.createQuery("select max(r.id) from Recurso r");
            maxID = (Integer) query.getSingleResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return maxID;
    }
    @Override
    public Recurso consultarRecurso(String nombre) {
        Recurso recurso = null;
        try {
            Query query = em.createQuery("select r from Recurso r WHERE r.nombre=:nombre");
            query.setParameter("nombre", nombre);
            recurso = (Recurso) query.getSingleResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return recurso;
    }

}
