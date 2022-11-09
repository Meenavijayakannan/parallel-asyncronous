package com.learnjava;

import java.util.concurrent.CompletableFuture;

public class NewThread {

    public static void main(String[] args) throws InterruptedException {
        final int k=16;
        final int[] arr = {1,2,3,4,5};
        /*ThreadDef def = new ThreadDef();
        Thread t1 =new Thread(def);
        t1.start();
        ThreadDefB defB = new ThreadDefB();
        Thread t2 =new Thread(defB);
        t2.start();

        t1.join();
        t2.join();*/
       CompletableFuture.runAsync(() ->{
           for(int i=1;i<10;i++){
               if(i%2 != 0){

                   try {
                       System.out.println(i);
                       Thread.sleep(2000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       }).join();

        CompletableFuture.runAsync(() -> {
            for (int i = 1; i < 10; i++) {
                if (i % 2 == 0) {

                    try {
                        System.out.println(i);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).join();
        /*for(int i=0;i<arr.length;i++){
          arr[i] =i*i;
          System.out.println(arr[i]);
        }*/


    }
}
