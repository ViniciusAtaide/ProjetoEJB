/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Venda;

/**
 *
 * @author Vinicius
 */
@Stateless
public class VendaFacade extends AbstractFacade<Venda> {
    @PersistenceContext(unitName = "ProjetoEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VendaFacade() {
        super(Venda.class);
    }
    
}
