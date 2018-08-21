package com.kx.designpatterns.CreatorPattern.BuilderPattern;

/**
 * Created by admin on 2018/8/20.
 *  具体的Builder类
 */
public  class MacBookBuilder extends Builder{
    private IComputer mComputer = new MacComputer();
    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS(String os) {
        mComputer.setOS(os);
    }

    @Override
    public IComputer createComputer() {
        return mComputer;
    }
}
