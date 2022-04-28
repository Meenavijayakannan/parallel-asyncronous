package com.learnjava;

import lombok.val;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static com.learnjava.util.CommonUtil.delay;

public class ArrayListTest {
    public static void main(String[] args){

System.out.println(Math.abs(-1));

        List<Integer> list = List.of(1,2,3,5);


        list.stream().map(num->CompletableFuture.supplyAsync(()-> {
            try {
                return getNumber(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }))
                .map(CompletableFuture -> CompletableFuture.orTimeout(1,TimeUnit.SECONDS))
                .map(CompletableFuture -> CompletableFuture.exceptionally((err)->{
                    System.err.println("Error persisted "+err);
                    return null;
                        }))
                .map(CompletableFuture -> CompletableFuture.join())
                .forEach(s->System.out.println("values persisted "+s));


        list.stream().map(num->CompletableFuture.supplyAsync(()-> {
            try {
                return getNumber(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }).orTimeout(2,TimeUnit.SECONDS))
                .map(CompletableFuture -> CompletableFuture.exceptionally(err ->{
                   System.err.println("Error with values  "+err);
                   return 10;
                }))
                .map(CompletableFuture->CompletableFuture.thenApply(n->
                n*n)).map(t->t.join())
                .forEach(s->System.out.println("values from cf"+s));

        List<Integer> sortedlist= list.stream().distinct().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

         System.out.println("sortedList"+ sortedlist.get(1));

        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(14);
        set.add(19);
        set.add(19);
        set.add(11);
        set.add(4);
        set.add(9);
        System.out.println("set "+ set);

        List listedset = new ArrayList(set);
        Collections.sort(listedset,Collections.reverseOrder());
        Integer[] intarray = (Integer[]) listedset.toArray(new Integer[listedset.size()]);

        System.out.println("Set  "+ listedset.get(1)  +  "array "+intarray[0]);
        Map<Integer,Integer> map = new HashMap<>();
        map.put(2,1);
        map.put(1,2);

        Map<Integer,String> stringmap = new HashMap<>();
        stringmap.put(2,"meena");
        stringmap.put(1,"Bala");

    }

    private static <U> U getnum(Integer num) {

            delay(100000);
            Integer val1=num;
            //return val1;

        return null;
    }

    private static int getNumber(int a) throws InterruptedException {
        Thread.sleep(10000);
        return a*a;
    }

}
