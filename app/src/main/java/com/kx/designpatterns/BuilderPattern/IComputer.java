package com.kx.designpatterns.BuilderPattern;

/**
 * Created by admin on 2018/8/20.
 * 计算机抽象 -----  即Product角色
 */
public abstract class IComputer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected IComputer() {
    }
    public void setBoard(String board) {
        mBoard = board;
    }

    public void setDisplay(String display) {
        mDisplay = display;
    }

    public void setOS(String OS) {
        mOS = OS;
    }
}
