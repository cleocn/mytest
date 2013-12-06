package com.company;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Timer timer = new Timer();
        timer.schedule(new TimerTaskTest(), 1000, 5000);

    }
}
