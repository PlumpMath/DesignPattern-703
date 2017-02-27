package com.company.dianping.Builder;/**
 * created by IntelliJ IDEA
 */

import com.sun.org.apache.bcel.internal.generic.IFEQ;
import sun.plugin2.main.server.JVMManager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *author：dianping
 *create：2017-02-27  下午10:32
 */
//该抽象类是一种模版方法模式的体现,产品类的抽象类
public abstract  class Car {
    private List<String> sequence;
    protected  abstract   void start();
    protected  abstract   void engineBoom();
    protected  abstract   void alarm();
    protected  abstract   void end();
    public void run(){
        for (String s  : sequence) {
            if(s.equals("start"))
                start();
            if(s.equals("engineBoom"))
                engineBoom();
            if(s.equals("alarm"))
                alarm();
            if(s.equals("end"))
                end();
        }
    }
    public void setSequence(List<String> ls){
        this.sequence=ls;
    }


}
