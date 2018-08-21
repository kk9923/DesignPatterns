package com.kx.designpatterns.CreatorPattern.BuilderPattern;

/**
 * Created by admin on 2018/8/20.
 *  抽象的Builder类
 */
public abstract  class Builder {
    public abstract void  buildBoard(String board);
    public abstract void  buildDisplay(String display);
    public abstract void  buildOS(String os);
    public abstract IComputer createComputer();
}
