package com.company.dianping.TemplateMethod;/**
 * created by IntelliJ IDEA
 */

/**
 * author：dianping
 * create：2017-02-26  上午10:29
 */

public abstract class HummerModel {
    protected abstract void start();

    protected abstract void end();

    protected abstract void alarm();

    protected abstract void engineBoom();
    //钩子方法,控制模版方法的流程算法
    protected boolean isAlarm() { return true;}

    final public void run(){
        start();
        engineBoom();
        if(isAlarm()) alarm();
        end();
    }
}




