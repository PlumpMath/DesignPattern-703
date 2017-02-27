package com.company.dianping.Builder;/**
 * created by IntelliJ IDEA
 */

/**
 *
 *author：dianping
 *create：2017-02-28  上午12:07
 */

public class BMW extends Car {
    @Override
    protected void start() {
        System.out.println("bmw start");
    }

    @Override
    protected void engineBoom() {
        System.out.println("bmw engineboom");
    }

    @Override
    protected void alarm() {
        System.out.println("bmw alarm");
    }

    @Override
    protected void end() {
        System.out.println("bmw end");
    }
}
