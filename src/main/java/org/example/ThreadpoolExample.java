package org.example;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolExample {
    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        for(int i=0;i<10;i++)
        {
           int taskNumber=i;
           threadPool.submit(()->{

               System.out.println("executing task "+taskNumber+" by "+Thread.currentThread().getName());
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           });
        }
threadPool.shutdown();


    }
}
