package org.example.classes;

public class Desktop implements Computer{

    private String modelName;

    public Desktop(){
        System.out.println("Desktop obj is created");
    }
    @Override
    public void compile() {
        System.out.println("Desktop is compileing");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
