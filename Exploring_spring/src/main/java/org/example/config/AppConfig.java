package org.example.config;

import org.example.classes.Computer;
import org.example.classes.Desktop;
import org.example.classes.Human;
import org.example.classes.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean(name="lap")
////    @Scope("prototype")
//    public Laptop laptop(){
//        return new Laptop();
//    }
//
//    @Bean(name="desk")
//    @Primary
//    public Desktop desktop(){
//        return new Desktop();
//    }

//    @Bean
//    public Human human(@Qualifier("lap") Computer com){
//        Human m=new Human();
//        m.setAge(21);
//        m.setName("manij");
//        m.setCom(com);
//        return m;
//    }
}
