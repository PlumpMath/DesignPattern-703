package com.company.dianping.Builder;/**
 * created by IntelliJ IDEA
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 *author：dianping
 *create：2017-02-28  上午12:14
 */
//管家类,用于产生各种顺序的建造者,并又建造者直接产生不同的产品
public class Director {
    private List<String> sequence=new ArrayList<String>();
    private BenzBuilder benzBuilder=new BenzBuilder();
    private BMWBuilder bmwBuilder=new BMWBuilder();

    //管家的方法,直接封装产生不同对象,对外屏蔽实现
    public Car getBenzSequence1Car(){
        sequence.clear();
        sequence.add("start");
        sequence.add("end");
        benzBuilder.setSqeuence(sequence);
        return benzBuilder.getCar();
    }
    public Car getBenzSequence2Car(){
        sequence.clear();
        sequence.add("start");
        sequence.add("alarm");
        benzBuilder.setSqeuence(sequence);
        return benzBuilder.getCar();
    }
    public Car getBMWSequence1Car(){
        sequence.clear();
        sequence.add("start");
        sequence.add("end");
        bmwBuilder.setSqeuence(sequence);
        return bmwBuilder.getCar();
    }
    public Car getBMWSequence2Car(){
        sequence.clear();
        sequence.add("engineBoom");
        sequence.add("end");
        bmwBuilder.setSqeuence(sequence);
        return bmwBuilder.getCar();
    }

}
