package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.Exchanger;

public class UseString  implements Runnable{
    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> ex) {
        this.ex = ex;
        new Thread(this).start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try{
                str = ex.exchange("new");
                System.out.println("Получено " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
