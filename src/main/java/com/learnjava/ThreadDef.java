package com.learnjava;

public class ThreadDef implements Runnable {


    @Override
    public void run() {
        try {
            odd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void odd() throws InterruptedException {
        for(int i=1;i<10;i++){
            if(i%2 != 0){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
    }
}
