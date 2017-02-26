package com.company.dianping.TemplateMethod;/**
 * created by IntelliJ IDEA
 */

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * author：dianping
 * create：2017-02-26  上午10:41
 */

public class ConcretHummerModel1 extends HummerModel {
    private boolean isAlarm=true;
    @Override
    protected void start() {
        System.out.println("hummer1 start");
    }

    @Override
    protected void end() {
        System.out.println("hummer1 end");
    }

    @Override
    protected void alarm() {
        System.out.println("hummer1 alarm");

    }

    @Override
    protected boolean isAlarm() {
        return this.isAlarm;
    }

    @Override
    protected void engineBoom() {
        System.out.println("hummer1 engineBoom");
    }
    public void setAlarm(boolean isAlarm){
        this.isAlarm=isAlarm;
    }
}
