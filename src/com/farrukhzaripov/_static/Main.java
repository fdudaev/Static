package com.farrukhzaripov._static;

public class Main {

    public static int multiplier = 7; // a field must be static to allow method call it.

    public static void main(String[] args) {

        StaticClass firstInstance = new StaticClass("1st Instance");
        System.out.println(firstInstance.getName() + " is instance of " + StaticClass.getNumInstances());  // since getNumInstance is static we can access it from Object by ClassName and getter.

        StaticClass secondInstance = new StaticClass("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance of " + StaticClass.getNumInstances());

        StaticClass thirdInstance = new StaticClass("3nd Instance");
        System.out.println(thirdInstance.getName() + " is instance of " + StaticClass.getNumInstances());

        int theAnswer = multiply(7);  // because multiplier field and multiply method are static we are able to ser int theAnswer variable.
        System.out.println("The answer is = "+theAnswer);
    }

    public static int multiply(int number) { // Java does not allow a static methods to access non-static fields, because they don't exist when static method is called.
        return number * multiplier;
    }
}