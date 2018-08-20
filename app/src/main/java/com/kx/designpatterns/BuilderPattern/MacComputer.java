package com.kx.designpatterns.BuilderPattern;

/**
 * Created by admin on 2018/8/20.
 * 具体的计算机类
 */
public  class MacComputer extends IComputer{
    public MacComputer() {

    }

    @Override
    public String toString() {
        return "MacComputer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
