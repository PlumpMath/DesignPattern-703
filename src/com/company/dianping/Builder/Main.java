package com.company.dianping.Builder;/**
 * created by IntelliJ IDEA
 */

import com.company.dianping.TemplateMethod.ConcretHummerModel1;
import com.company.dianping.TemplateMethod.ConcretHummerModel2;

/**
 * author：fei.wang
 * create：2017-02-26  上午9:43
 */

public class Main {
    /*建造者模式
    将一个复杂对象的构建和它的表示分离,使得同样的创建过程可以创建不同的表示
    建造者模式一般可以和模版方法模式一起使用.
    建造着模式关注的是对象根据不同的顺序,建造不同的对象,并把这个顺序的对象的创建过程进行封装,而工厂方法模式只是为了创建对象

    在建造着模式中一般有四个角色:
    Product类:这个类通常实现了一个产品的抽象类(是模版方法实现的,里面有基础方法和模版方法)
    建造着的抽象类:规定建造者的规范抽象
    具体的建造者:专门用于实现不同Product类的具体建造者
    导演类:根据不同的顺序,创建不同的建造者,并直接返回指定顺序的Product类
    *
    * */
    public static void main(String[] args) {
        Director d = new Director();
        Benz benz1 = (Benz) d.getBenzSequence1Car();
        benz1.run();
        System.out.println("======");
        Benz benz2 = (Benz) d.getBenzSequence2Car();
        benz2.run();
        System.out.println("======");
        BMW bmw1 = (BMW) d.getBMWSequence1Car();
        bmw1.run();
        System.out.println("======");
        BMW bmw2 = (BMW) d.getBMWSequence2Car();
        bmw2.run();
    }
}
