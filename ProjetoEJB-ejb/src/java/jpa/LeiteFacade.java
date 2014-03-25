/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Leite;

/**
 *
 * @author Vinicius
 */
@Stateless
public class LeiteFacade extends AbstractFacade<Leite> {
    @PersistenceContext(unitName = "ProjetoEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LeiteFacade() {
        super(Leite.class);
    }
    
}
