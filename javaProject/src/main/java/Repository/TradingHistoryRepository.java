/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pojo.Tradinghistory;

/**
 *
 * @author 10123_000
 */
@Repository
public class TradingHistoryRepository {
    
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    @Transactional
    public synchronized void add(Tradinghistory th){
        sessionFactory.getCurrentSession().save(th);
    }
    
    @Transactional(readOnly = true)
    public List<Tradinghistory> get(Integer userID){
        Query query = sessionFactory.getCurrentSession().
                createQuery("from Tradinghistory as th where th.account.id = " + userID);
        return query.list();
    }
}
