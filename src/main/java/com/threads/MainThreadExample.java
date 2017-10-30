package com.threads;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainThreadExample {

    public static void main(String args[]) throws Exception {
        long time1 = System.currentTimeMillis();
/*        Command1 command1 = new Command1();
        Command2 command2 = new Command2();
        Command3 command3 = new Command3();
        Command4 command4 = new Command4();

        command1.run();
        command2.run();
        command3.run();
        command4.run();*/


        Thread t1 = new Thread(new Command1());
        Thread t2 = new Thread(new Command2());
        Thread t3 = new Thread(new Command3());
        Thread t4 = new Thread(new Command4());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

/*        for(int i = 0; i < 100000; i++) {
            System.out.println(i);
        }*/

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        long time2 = System.currentTimeMillis();
        long difference = time2 - time1;

        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println(  formatter.format((difference/1000d)) );
    }

}