package org.example.classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements  Computer{
    private String modelName;

    public Laptop(){
        System.out.println("laptop obj is created");
    }
    @Override
    public void compile() {
        System.out.println("Laptop is compiling");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
