package com.driver;
class A{
    String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    String meth(){
        return "Invoking method from class A";
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth();
        obj.meth();
    }
}