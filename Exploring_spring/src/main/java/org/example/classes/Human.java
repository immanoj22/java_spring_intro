package org.example.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Human {

   private Computer com;

   private String name;

   @Value("21")
   private int age;

   public Human(String name,int age,Computer com){
       this.name=name;
       this.age=age;
       this.com=com;

   }

   public Human(){
//       com.compile();
   };
    public Computer getC() {
        return com;
    }

    @Autowired
    @Qualifier("desk")
    public void setCom(Computer c) {
        this.com = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void compile(){
        com.compile();
    }
}
