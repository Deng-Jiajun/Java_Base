/**   
 * @Title MultiThreadDemo.java 
 * @Package com.startdima.test.chapter3.multithread 
 * @Description TODO 
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月25日 下午3:00:01 
 * @version V1.0   
 */ 
package com.startdima.test.chapter3.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.stream.events.StartDocument;

/**
 * @ClassName MultiThreadDemo
 * @Description TODO
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月25日 下午3:00:01
 * 
 */
public class MultiThreadDemo {

    /**
     * @Title main 
     * @Description TODO 
     * @param args 
     * @return void 
     * @throws
     */
    public static void main(String[] args) {
        /*
         * 售票题：一共有100张票，由10个窗口同时进行售票，保证票没有多卖出去。
         * 利用普通多线程方式 及 线程池的方式实现。
         */
        
        /*
         * 普通多线程
         * https://blog.csdn.net/evankaka/article/details/44153709
         */        
        Ticket ticket = new Ticket();

        List threadList = new ArrayList();
        for (int i = 0; i != 10; ++i) {
            threadList.add(new Thread(ticket, "窗口" + (i + 1)));
        }
        for (int i = 0; i != 10; ++i) {
            ((Thread)threadList.get(i)).start();
        }
        
        
        /*
         * 线程池 线程复用
         * https://www.cnblogs.com/dolphin0520/p/3932921.html
         * https://blog.csdn.net/wanghao_0206/article/details/76460877
         */
//        Ticket ticket= new Ticket();
//        ExecutorService pool = Executors.newFixedThreadPool(10);
//        for(int i = 0 ; i < 10 ; i++){
//            pool.submit(ticket);
//        }
//        pool.shutdown();
        
    }
}
