package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-6
 * Time: 下午8:48
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;

public class TimerTaskTest extends java.util.TimerTask{

    int sign = 0;

    public TimerTaskTest( ) {
    }

    List<Timer> timerList= new ArrayList<Timer>();

    @Override
    public void run() {
        this.sign += 1;

        System.out.println("---------------------------get plan " + this.sign);

        for (Timer t : timerList) {
            t.cancel();
            //t.purge()  ;
//            void cancel()
//            终止此计时器，丢弃所有当前已安排的任务。
//            int purge()
//            从此计时器的任务队列中移除所有已取消的任务。
        }

        Random random1 = new Random(100);
        int plans =(int)(Math.random()*5) +1;    //获取一个1~6之间的随机数
        System.out.println("-------------get plan items " + plans);
        for (int i=0; i < plans;i++)  {
            Timer timer2 = new Timer();
            timer2.schedule(new TimerTaskTest2("plan " +  " " + this.sign + " mapping "+i ), 1000, 2000);
            timerList.add(timer2);
        }


    }
}
