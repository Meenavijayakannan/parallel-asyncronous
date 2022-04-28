package com.learnjava;

public class OverridingClass {
    public void add(){
        System.out.println("add A");
    }
    public static void main(String[] args){
        /*Child c = new Child();
        c.add();*/
       /* Child c3 = (Child) new OverridingClass();
        c3.add();*/
       /* OverridingClass c1 =  new OverridingClass();
        c1.add();*/
        OverridingClass c2 =  new Child();
        c2.add();

    }
}

class Child extends OverridingClass{
    public void add(){
        System.out.println("add B");
    }

}

