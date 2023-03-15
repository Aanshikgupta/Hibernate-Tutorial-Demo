package com.aanshik.learn_hibernate;

import com.aanshik.learn_hibernate.Entity.Address;
import com.aanshik.learn_hibernate.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Student student=new Student("Aanshik","gupta.aanshik@gmail.com");

        Address address=new Address();
        address.setStreet("street 1");
        address.setCity("Greater Noida");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(10);

        FileInputStream fis=new FileInputStream("C:\\Users\\aanshik.gupta.in\\eclipse-workspace\\learn-hibernate\\src\\main\\resources\\dog.png");
        byte[] data=new byte[fis.available()];
        address.setImage(data);


        Session session=sessionFactory.openSession();

        //open transaction
        session.beginTransaction();

        //save object
        session.save(student);
        session.save(address);

        //commit transaction - to commit changes
        session.getTransaction().commit();

        //close session
        session.close();

        System.out.println(sessionFactory);
        System.out.println( "Hello World!" );
    }
}
