package com.learning.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.orm.dao.StudentDao;
import com.learning.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao st = context.getBean("studentDao", StudentDao.class);
        
        Student s1 = new Student();
        s1.setStudentId(101);
        s1.setStudentName("Mitanshi");
        s1.setStudentCity("Kasganj");
        int r = st.insert(s1);
        
        System.out.println("done " + r);
    }
}
