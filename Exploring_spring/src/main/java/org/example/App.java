package org.example;

import org.example.SampleClass.Student;
import org.example.classes.Computer;
import org.example.classes.Desktop;
import org.example.classes.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        Student stu= (Student) context.getBean("student");
//
//        System.out.println(stu.getStudentAge());
//
//        stu.printCollege();
//        stu.printstudentyear();

//        Desktop desk=(Desktop) context.getBean("Desktop");
//        desk.compile();
//        desk.setModelName("M09ER");

//        Computer c=desk;
//        c.compile();

        Human h=context.getBean("Human",Human.class);
        System.out.println(h.getAge());
        h.compile();

    }
}
