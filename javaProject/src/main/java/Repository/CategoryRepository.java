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
import pojo.Category;

/**
 *
 * @author 10123_000
 */
@Repository
public class CategoryRepository {
    
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    @Transactional(readOnly = true)
    public List<Category> getAll(){
        Query query = sessionFactory.getCurrentSession().createQuery("from Category");
        return query.list();
    }
}
