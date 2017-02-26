package com.company.dianping.TemplateMethod;/**
 * created by IntelliJ IDEA
 */

/**
 *
 *author：fei.wang
 *create：2017-02-26  上午9:43
 */

public class Main {
    /*模版方法
    * 定义一个操作中的算法框架,将一些步骤延迟到子类中,使得子类可以不改变算法结构即可重定义算法中的某些特定步骤
    * 基本方法:由子类自定义的方法,protected类型
    * 模版方法:final不能重写的,一般一个或者几个,完成对算法的调度,public类型
    * 特点 1 封装不变的部分,拓展可变的部分
    *      2 行为由父类控制,子类实现
    * 使用场景:
    *  多个子类有共有的方法,并且逻辑基本相同时
    *  重要的,复杂的,可以把核心算法设计为模版方法,周边的各个细节可以由子类实现
    *  重构时,模版方法经常使用,可以把相同的代码抽取到父类,然后通过钩子函数约束其行为
    *
    * */
    public static void main(String[] args){
        ConcretHummerModel1 h1=new ConcretHummerModel1();
        ConcretHummerModel2 h2=new ConcretHummerModel2();
        h1.setAlarm(true);
        h2.setAlarm(false);
        h1.run();
        System.out.println("============");
        h2.run();
    }
}
