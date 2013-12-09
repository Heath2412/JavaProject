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
import pojo.Account;

/**
 *
 * @author 10123_000
 */
@Repository
public class AccountRepository {
    
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    @Transactional(readOnly = true)
    public boolean ValidateAccount(String userName, String password){
        String queryStr = String.format("from Account as a where a.userName = '%s' and a.password = '%s'", userName, password);
        Query query = sessionFactory.getCurrentSession().createQuery(queryStr); 
        return query.list().size() == 1;
    }
 
    @Transactional(readOnly = true)
    private boolean IsUserExists(String userName){
        String queryStr = String.format("from Account as a where a.userName = '%s'", userName);
        Query query = sessionFactory.getCurrentSession().createQuery(queryStr); 
        return query.list().size() == 1;
    }
    
    @Transactional(readOnly = true)
    public Account get(String userName){
        String queryStr = String.format("from Account as a where a.userName = '%s'", userName);
        Query query = sessionFactory.getCurrentSession().createQuery(queryStr);
        Account ret = null;
        List<Account> temp = query.list();
        if (temp.size() > 0){
            ret = temp.get(0);
        }
        return ret;
    }
    
    @Transactional
    public synchronized Account Register(String userName, String password) throws Exception{
        if (IsUserExists(userName)){
            throw new Exception("Tên đăng nhập đã có người sử dụng");
        }
        
        Account ret = new Account();
        ret.setUserName(userName);
        ret.setPassword(password);
        sessionFactory.getCurrentSession().saveOrUpdate(ret);
        return ret;
    }
}
