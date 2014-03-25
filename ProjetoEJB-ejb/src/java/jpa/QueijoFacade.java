
package jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Queijo;

/**
 *
 * @author Vinicius
 */
@Stateless
public class QueijoFacade extends AbstractFacade<Queijo> {
    @PersistenceContext(unitName = "ProjetoEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public QueijoFacade() {
        super(Queijo.class);
    }
    
}
