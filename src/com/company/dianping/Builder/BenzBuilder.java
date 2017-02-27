package com.company.dianping.Builder;/**
 * created by IntelliJ IDEA
 */

import java.util.List;

/**
 *
 *author：dianping
 *create：2017-02-28  上午12:11
 */

public class BenzBuilder extends  AbstractBuilder {
    private Benz benz=new Benz();
    @Override
    public Car getCar() {
        return this.benz;
    }

    @Override
    public void setSqeuence(List<String> sqeuence) {
        this.benz.setSequence(sqeuence);
    }
}
