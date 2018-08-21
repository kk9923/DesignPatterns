package com.kx.designpatterns.CreatorPattern.BuilderPattern;

/**
 * Created by admin on 2018/8/20.
 *  Director类，负责构造IComputer
 */
public class Director {
    Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }
    public IComputer construct(String board,String diaplay,String os){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(diaplay);
        mBuilder.buildOS(os);
        return mBuilder.createComputer();
    }
}
