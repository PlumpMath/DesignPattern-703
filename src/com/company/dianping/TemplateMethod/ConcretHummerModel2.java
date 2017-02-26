package com.company.dianping.TemplateMethod;/**
 * created by IntelliJ IDEA
 */

/**
 * author：dianping
 * create：2017-02-26  上午10:41
 */

public class ConcretHummerModel2 extends HummerModel {
    private boolean isAlarm=true;
    @Override
    protected void start() {
        System.out.println("hummer2 start");
    }

    @Override
    protected void end() {
        System.out.println("hummer2 end");
    }

    @Override
    protected void alarm() {
        System.out.println("hummer2 alarm");

    }

    @Override
    protected boolean isAlarm() {
        return this.isAlarm;
    }

    @Override
    protected void engineBoom() {
        System.out.println("hummer2 engineBoom");
    }
    public void setAlarm(boolean isAlarm){
        this.isAlarm=isAlarm;
    }
}
