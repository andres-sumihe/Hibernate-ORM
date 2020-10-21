/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author Andres-Sumihe
 */

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernateorm.HibernateUtil;
import hibernateorm.Student;
public class Dao {
    public String errorMessage;
    public List<Student> retrieveStudent()
    {
        List stud=new ArrayList();
        Student stud1=new Student();
        Transaction trans=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Student");
            stud=query.list();
            stud.add(stud1.getName());
            stud.add(stud1.getDepartment());
           
            trans.commit();
            
        }
        catch(Exception e)
        {
            
        }
        return stud;
    }
    
    public void addStudent(Student student){
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(student);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            if(e.getCause().toString().contains("Duplicate entry"))
            errorMessage = "Data Dengan ID Tersebut telah ada dalam Database";
        }
    }
    
    public void deleteStudent(int id){
        Transaction trans=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Student stud=(Student)session.load(Student.class, new Integer(id));
            System.out.println("id : " + id);
            if(stud!=null){            
                session.delete(stud);
            }
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
     public List<Student> getbyID(int sno){
        Student student=new Student();
        List<Student> student1=new ArrayList();
       
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Student where id= :id");
            query.setInteger("id", sno);
            student=(Student)query.uniqueResult();
            student1=query.list();
            
            trans.commit();
        }catch(Exception e){
            
        }
        return student1;
    }
     
    public List<Student> getbyDVS(String dvs){
        List stud=new ArrayList();
        Student stud1=new Student();
        Transaction trans=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Student where Division=:dvs");
            query.setString("dvs", dvs);
            stud=query.list();
           
            trans.commit();
            
        }
        catch(Exception e)
        {
            
        }
        return stud;
    }
    public List<Student> getbyBPH(String dvs){
        Student student=new Student();
        List<Student> student1=new ArrayList();
       
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Student where Division=:dvs");
            query.setString("dvs", dvs);
            student=(Student)query.uniqueResult();
            student1=query.list();
            
            trans.commit();
        }catch(Exception e){
            
        }
        return student1;
    }
     
     public void updateStudent(Student student){
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(student);
            trans.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
