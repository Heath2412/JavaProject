/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pojo.Sanpham;
/**
 *
 * @author 10123_000
 */
@Repository
public class SanPhamRepository {
    
    @Autowired
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    @Transactional(readOnly = true)
    public List<Sanpham> getAll(){
        Query query = sessionFactory.getCurrentSession().createQuery("from Sanpham");
        return query.list();
    }
}
