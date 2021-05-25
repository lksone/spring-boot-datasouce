package com.lks.demo.test;

import java.util.concurrent.Semaphore;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/5/25 19:42
 */
public class ModeThread extends Thread {

    private final Semaphore sa;
    private final Semaphore sb;
    private final String target;

    public ModeThread(Semaphore sa, Semaphore sb, String target) {
        this.sa = sa;
        this.sb = sb;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sa.acquire();
                System.out.print(target);
                sb.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
