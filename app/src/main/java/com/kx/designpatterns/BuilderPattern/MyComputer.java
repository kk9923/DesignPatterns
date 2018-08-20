package com.kx.designpatterns.BuilderPattern;

/**
 * Created by admin on 2018/8/20.
 */
public class MyComputer  {
    private String mBoard;
    private String mDisplay;
    private String mOS;

    private MyComputer(Builder builder) {
        mBoard = builder.mBoard;
        mDisplay = builder.mDisplay;
        mOS = builder.mOS;
    }

    @Override
    public String toString() {
        return "MyComputer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }

    public static  class Builder {
        private String mBoard;
        private String mDisplay;
        private String mOS;

        public Builder setBoard(String board) {
            mBoard = board;
            return this;
        }

        public Builder setDisplay(String display) {
            mDisplay = display;
            return this;
        }

        public Builder setOS(String OS) {
            mOS = OS;
            return this;
        }
        public MyComputer create() {
            return new MyComputer(this);
        }
    }
}
