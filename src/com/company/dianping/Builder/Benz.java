package com.company.dianping.Builder;/**
 * created by IntelliJ IDEA
 */

/**
 *
 *author：dianping
 *create：2017-02-28  上午12:03
 */
//具体的产品类
public class Benz extends Car {
    @Override
    protected void start() {
        System.out.println("benz start");
    }

    @Override
    protected void engineBoom() {
        System.out.println("benz engineBoom");
    }

    @Override
    protected void alarm() {
        System.out.println("benz alarm");
    }

    @Override
    protected void end() {
        System.out.println("benz end");
    }
}
