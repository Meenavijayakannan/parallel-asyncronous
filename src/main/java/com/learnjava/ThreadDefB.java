package com.learnjava;

public class ThreadDefB extends Thread {

    @Override
    public void run() {
        try {
            even();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void even() throws InterruptedException {
        for(int i=1;i<10;i++){
            if(i%2 == 0){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
    }
}
