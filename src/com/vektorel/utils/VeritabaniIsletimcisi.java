package com.vektorel.utils;


import java.lang.reflect.Field;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 * @param <T> Generic yap� ile Enitity nesnesi al�r
 */
public class VeritabaniIsletimcisi<T> implements IGENERICCRUD<T>{

    private Session session;
    private Transaction transaction;
    private Criteria criteria;
    
    private boolean Ac(){
        try {
            session = hibernateutil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
        } catch (HibernateException ex) {
            //HataBildirimleri.OpenConnectionErrorMessage(ex.toString());
            return false;
        }
        return true;
    }
    
    private boolean Kapat(){
        try {
            if(!session.isConnected())
               ;// HataBildirimleri.AllreadyCloseConnectionErrorMessage("");
            else{
                transaction.commit();
                session.close();
            }           
        } catch (HibernateException ex) {
            //HataBildirimleri.CloseConnectionErrorMessage(ex.toString());
            return false;
        }
        return true;
    }
    
    @Override
    public boolean Save(T t) {
        if(Ac()){
            try {
                session.save(t);
                Kapat();
            } catch (Exception ex) {
               // HataBildirimleri.SaveErrorMessage(ex.toString());
                return false;
            }            
            return true;
        }
        else        
            return false;
    }

    @Override
    public boolean Update(T t) {
         if(Ac()){
            try {
                session.update(t);
                Kapat();
            } catch (Exception ex) {
                ///HataBildirimleri.UpdateErrorMessage(ex.toString());
                return false;
            }            
            return true;
        }
        else        
            return false;
    }

    @Override
    public boolean Delete(long id, T t) {
           if(Ac()){
            try {                
                // Kriter olu�turmak i�in nesne olu�tur.
                criteria = session.createCriteria(t.getClass());
                // where ekleme -> where id=5
                criteria.add(Restrictions.eq("id", id));
                // e�er birden fazla kay�t geldi ise ilk kayd� al.
                Object o = criteria.list().get(0);
                // e�er arad���n id var ise sil diyoruz.
                if(o!=null)
                    session.delete(o);
                Kapat();                
            } catch (HibernateException ex) {
                //HataBildirimleri.UpdateErrorMessage(ex.toString());
                return false;
            }            
            return true;
        }
        else        
            return false;
    }
    
    public T GetbyId(long id, T t){
        if(Ac()){
            try {
                criteria = session.createCriteria(t.getClass());
                criteria.add(Restrictions.eq("id", id));
                t = (T) criteria.list().get(0);
                Kapat();
                return t;
            } catch (Exception e) {
            	System.out.println("HATA...: "+ e.toString());
                Kapat();
                return null;
                        
            }
        }
        return null;
    }

    public T GetbyId(int id, T t){
        if(Ac()){
            try {
                criteria = session.createCriteria(t.getClass());
                criteria.add(Restrictions.eq("id", id));
                t = (T) criteria.list().get(0);
                Kapat();
                return t;
            } catch (Exception e) {
            	System.out.println("HATA...: "+ e.toString());
                Kapat();
                return null;
                        
            }
        }
        return null;
    }
    @Override
    public List<T> MyList(T t) {            
           if(Ac()){
               List<T> mylist=null;
            try {               
                // Kriter olu�turmak i�in nesne olu�tur.
                criteria = session.createCriteria(t.getClass());
                mylist = criteria.list();
                Kapat();              
                
            } catch (HibernateException ex) {
               // HataBildirimleri.UpdateErrorMessage(ex.toString());                
            }            
            return mylist;
        }
        else        
            return null;
    }

    @Override
    public List<T> Find(T t) {
        if(Ac()){
            List<T> mylist=null;
            try {
                criteria = session.createCriteria(t.getClass());
                
                // REFLECTIONS
                // �ncelikle nesne bir s�n�f i�ine al�n�r.
                Class parameters = t.getClass(); 
                // nesne i�inde tan�ml� olan t�m alanlar ve parametereleri
                // Filed[] dizisi i�ine kopyalan�r.
                Field[] myParams = parameters.getDeclaredFields(); 
                // t�m alanlar� d�nememiz gereklidir.
                // Ama�: bir entity i�inde (id, ad, soyad,telefon,tckimlik)
                // gibi alanlar var.
                // tblmusteri -> id=null, ad=Ali, soyad=eray,tckimlik=null
                for (int i = 1; i < myParams.length; i++) {
                    myParams[i].setAccessible(true);
                    if(myParams[i].get(t)!=null){
                         criteria.add(
                                Restrictions.or(
                                Restrictions
                                   .like(myParams[i].getName()
                                                    , "%"+myParams[i].get(t)+"%")
                                )
                         );
                    }
                }
                mylist = criteria.list();
                Kapat();
                return mylist;
                
            } catch (Exception ex) {
                return null;
            }        
        }
        else
            return null;
    }

    @Override
    public T Search(String ColumName, Object FindKey, T t) {      
        if(Ac()){
            try {
                criteria = session.createCriteria(t.getClass());
                criteria.add(Restrictions.like(ColumName, FindKey));
                t = (T)criteria.list().get(0);
                Kapat();
                return t;
            } catch (HibernateException ex) {
                return null;
            }
        }
        else
            return null;
    }
    
}
