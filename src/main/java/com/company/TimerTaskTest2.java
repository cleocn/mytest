package com.company;


import org.apache.logging.log4j.Logger.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-6
 * Time: 下午8:48
 * To change this template use File | Settings | File Templates.
 */

public class TimerTaskTest2 extends java.util.TimerTask{

    private  String planName;
    public TimerTaskTest2    (String planName){
          this.planName =    planName;
    }
    int check=0;
    @Override
    public void run() {

        check++;
        String s =this.planName + " do check. " + check;
        System.out.println(s  );
        try {
            System.out.println("@@@going to bed " + s);
            Thread.sleep(3000);
            System.out.println("+++wake up " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
