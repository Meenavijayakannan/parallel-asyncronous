package com.learnjava;

public class OverrideClass {
    int k= 700;
    int l=700;


    public long m1(long i, int j){
        System.out.println("m2");
        return i+j;
    }
    public double m1(int i, double j){
        System.out.println("m1");
        return i+j;
    }
    public void m1(Object obj){
        System.out.println("values with object");
    }

    public void m1(String obj){
        System.out.println((String) null);
    }
    public void m1(Integer obj){
        System.out.println("Integer"+(String) null);
    }


    public static void main(String[] args){


        Integer i = 20; //initialize a object of Integer class with value as 20.
        Integer j = 20;
        System.out.println(" hascode 1"+i.hashCode());
        System.out.println(j);
        i=21;
        operate(i);// method to change value of object.
        System.out.println("hashcode 2"+i.hashCode()); //value doesn't change shows that object is immutable.
        System.out.println(j);


        String s = "1";
        String s1= "1";
        s="2";


        System.out.println(s);
        System.out.println(s1);

        String hello = "hello";
        String hello1 = "hello";
        String hello2 = new String("hello");

        if(hello == hello2){
            System.out.println("the value of string are same" );
        }
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        if(t1.equals(t2)){
            System.out.println("Threads are same");
        }

        Character c = 'a';
        Character c1 = Character.valueOf('a');
        if(c.equals(c1)){
            System.out.println("the value of character" + c + c1);
        }

        Integer k=Integer.valueOf(700);
        Integer l=700;
        if(k == l){
            System.out.println("the value of %d and %d" + (i+j));
        }else{
            System.out.println("hascodes" + (k.hashCode())+"hascodes" + l.hashCode());
        }

        if(k.equals(l)){
            System.out.println("the value of %d and %d" + (i+j));
        }else{
            System.out.println("hascodes" + (k.hashCode())+"hascodes" + l.hashCode());
        }
      OverrideClass overrideClass =new OverrideClass();
      overrideClass.m1(1, 2.0);
      overrideClass.m1((Integer) null);

      Integer integer = Integer.valueOf("000000081");
      System.out.println("integer  "+integer);
      int integer1 = Integer.parseInt("000000081");
      System.out.println("integer  "+integer1);

        System.out.println(Integer.parseInt("77", 8));
    }

    private static void operate(Integer i) {
        i =21;
    }
}



