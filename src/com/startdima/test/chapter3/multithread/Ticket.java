/**   
 * @Title Ticket.java 
 * @Package com.startdima.test.chapter3.multithread 
 * @Description TODO 
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月25日 下午3:57:32 
 * @version V1.0   
 */ 
package com.startdima.test.chapter3.multithread;

/** 
 * @ClassName Ticket 
 * @Description 多线程售票
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月25日 下午3:57:32 
 *  
 */
public class Ticket implements Runnable {
    private int num = 100;

    @Override
    public void run() {
        while (num > 0) {
            saleTicket();
        }
    }

    /*
     * 临界区
     * 
     * https://blog.csdn.net/evankaka/article/details/44153709
     * https://blog.csdn.net/weixin_39788493/article/details/80824249
     * https://www.cnblogs.com/ysocean/p/6883729.html
     * 注意：不能直接用 synchronized 来修饰 run() 方法，
     * 因为如果这样做，那么就会总是第一个线程进入其中，
     * 而这个线程执行完所有操作才会出来。
     */

    private synchronized void saleTicket() {
        if (num > 0) {
            try {
                Thread.sleep((long)Math.random());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;
            System.out.println(Thread.currentThread().getName() + " 卖出一张票，还剩：" + num + "张");
        }
    }
}