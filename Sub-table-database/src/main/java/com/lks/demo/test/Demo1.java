package com.lks.demo.test;

import java.util.concurrent.Semaphore;

/**
 * @author lks
 * @Since 1.0
 * @Date 2021/5/25 18:54
 */
public class Demo1 {

    private static final Semaphore A = new Semaphore(1);

    private static final Semaphore B = new Semaphore(0);

    private static final Semaphore C = new Semaphore(0);


    public static void main(String[] args) {
        ModeThread ta = new ModeThread(A, B, "A");
        ModeThread tb = new ModeThread(B, C, "B");
        ModeThread tc = new ModeThread(C, A, "C");
        ta.start();
        tb.start();
        tc.start();
    }
}
