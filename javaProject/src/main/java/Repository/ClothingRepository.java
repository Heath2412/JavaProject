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
import pojo.Clothing;

/**
 *
 * @author 10123_000
 */

public class ClothingRepository {
    private String cutAccent(String str){
   /*    str = str.replaceAll("á|�?ả|ã|ạ|â|ấ|ầ|ẩ|ẫ|ậ|ă|ắ|ằ|ẳ|ẵ|ặ", "a");
       str = str.replaceAll("Á|�?Ả|Ã|�?�?Ấ|Ầ|Ẩ|Ẫ|Ậ|�?Ắ|Ằ|Ẳ|Ẵ|Ặ", "A");
       str = str.replaceAll("é|è|ẻ|ẽ|ẹ|ê|ế|ề|ể|�?�?, "e");
       str = str.replaceAll("É|�?Ẻ|Ẽ|Ẹ|Ê|Ế|�?�?Ễ|�?, "E");
       str = str.replaceAll("í|ì|ỉ|ĩ|�?, "i");
       str = str.replaceAll("Í|Ì|�?Ĩ|�?, "I");
       str = str.replaceAll("ó|ò|ỏ|õ|ọ|ô|ố|ồ|ổ|ỗ|ộ|ơ|ớ|ờ|ở|ỡ|ợ", "o");
       str = str.replaceAll("Ó|Ò|Ỏ|Õ|Ọ|Ô|Ố|Ồ|Ổ|Ỗ|�?�?Ớ|Ờ|Ở|�?Ợ", "O");
       str = str.replaceAll("ú|ù|ủ|ũ|ụ|ư|ứ|ừ|ử|ữ|ự", "u");
       str = str.replaceAll("Ú|Ù|Ủ|Ũ|Ụ|Ư|Ứ|Ừ|Ử|Ữ|Ự", "U");
       str = str.replaceAll("ý|ỳ|ỷ|ỹ|ỵ", "y");
       str = str.replaceAll("Ý|Ỳ|Ỷ|Ỹ|Ỵ", "Y");*/
       return str;
    }
    
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
 /*   private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate template){
        this.hibernateTemplate = template;
    }*/
    
    @Transactional(readOnly = true)
    public List<Clothing> getAll(){
        Query query = sessionFactory.getCurrentSession().createQuery("from Clothing");
        return query.list();
    }
    
    @Transactional(readOnly = true)
    public List<Clothing> search(Integer categoryID, String keyword,
            Integer priceFrom, Integer priceTo){
        String queryStr = "from Clothing as c";
        if (keyword == null)
            keyword = "";
        keyword = keyword.toLowerCase();
        
        if (categoryID != null || priceFrom != null || priceTo != null)
            queryStr += " where";
        
        if (categoryID != null)
            queryStr += " c.category.id = " + categoryID;
        
        if (priceFrom != null || priceTo != null)
            queryStr += " AND";
        
        if (priceFrom != null){
            priceFrom *= 1000;
            queryStr += " c.price >= " + priceFrom;
        }
            
        if (priceTo != null){
            priceFrom *= 1000;
            queryStr += " AND c.price <= " + priceTo;
        }
         
        Query query = sessionFactory.getCurrentSession().createQuery(queryStr);
        List<Clothing> ret = query.list();
        
        for (int i=0; i<ret.size(); i++){
            String clothingName = cutAccent(ret.get(i).getName()).toLowerCase();
            if (!clothingName.contains(keyword)){
                ret.remove(i);
                i--;
            }
        }
        
        return ret;
    }
    
    @Transactional(readOnly = true)
    public Clothing get(int id){
        return (Clothing) sessionFactory.getCurrentSession().get(Clothing.class, id);
    }
}
