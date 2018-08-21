package com.kx.designpatterns.CreatorPattern.BuilderPattern;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        MacBookBuilder macBookBuilder = new MacBookBuilder();
        Director director  = new Director(macBookBuilder);
        IComputer macBook = director.construct("英特尔主板", "Retina显示器", "Mac OS X 10.12");
        System.out.println(macBook.toString());

        /*
         *  运行结果     MacComputer{mBoard='英特尔主板', mDisplay='Retina显示器', mOS='Mac OS X 10.12'}
         */


        MyComputer computer = new MyComputer.Builder().setBoard("英特尔主板").setDisplay("Retina显示器").setOS("Mac OS X 10.12").create();
        System.out.println(computer.toString());
        /*
         *  运行结果     MacComputer{mBoard='英特尔主板', mDisplay='Retina显示器', mOS='Mac OS X 10.12'}
         */


    }
}
