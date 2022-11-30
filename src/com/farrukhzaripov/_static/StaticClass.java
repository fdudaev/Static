package com.farrukhzaripov._static;

public class StaticClass {

    private static int numInstances = 0;
    private String name;

    public StaticClass(String name){
        this.name = name;
        numInstances ++;
    }

    public static int getNumInstances(){
        return numInstances;
    }
    public String getName(){
        return name;
    }

}
