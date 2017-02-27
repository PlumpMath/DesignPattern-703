package com.company.dianping.Builder;/**
 * created by IntelliJ IDEA
 */

import java.util.List;

/**
 *
 *author：dianping
 *create：2017-02-28  上午12:11
 */
//建造者,每个产品都有一个自己的建造者
public class BMWBuilder extends  AbstractBuilder {
    private BMW bmw=new BMW();
    @Override
    public Car getCar() {
        return this.bmw;
    }

    @Override
    public void setSqeuence(List<String> sqeuence) {
        this.bmw.setSequence(sqeuence);
    }
}
