package com.learnjava;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.learnjava.util.CommonUtil.delay;


public class NewTest {

    public static void main(String[] args){
       /* Thread thread = new Thread();
        thread.start();
        CompletableFuture.runAsync(thread::run)
                .orTimeout(3, TimeUnit.SECONDS)
                .exceptionally(throwable -> {
                    System.out.println("error thrown");
                    return null;
                });*/
        List<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee(1,"meena",26));
        employee.add(new Employee(2,null,21));
        employee.add(null);


         employee
                 .stream()
                 .filter(Objects::nonNull)
                 .map(s->s.getEname())
                 .filter(s ->StringUtils.isNotBlank(s))
                 .forEach(s1->System.out.println(s1));

         String str = "welcome to    meena        workspace";
        String output = Arrays.stream(str.split("\\s+"))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println(output);

        char[] charArray=str.toCharArray();
        StringBuilder build= new StringBuilder();
        boolean space = true;
        for(char a :charArray ){
            if(Character.isLetter(a) ) {
                if(space) {
                    a = Character.toUpperCase(a);
                    space = false;
                    build.append(a);
                }
                else{
                    build.append(a);
                }
            }else {
                build.append(a);
                space=true;
            }
        }
        System.out.println(build.toString());

        Stream<Character> characterStream = null;
        characterStream = IntStream.range(0,charArray.length).mapToObj(i-> charArray[i]);

        String string = StringUtils.capitalize(str);
        Arrays.stream(str.split(""))
                .map(strings-> StringUtils.capitalize(strings))
                .forEach(s->System.out.println(s));
        System.out.println("values uppercase "+string);
    }

    private static void hello() {
        delay(10000);
        String meena = "meena";
        String world = "world";

    }
}
