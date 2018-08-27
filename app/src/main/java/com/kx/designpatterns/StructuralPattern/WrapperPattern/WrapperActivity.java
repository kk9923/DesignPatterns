package com.kx.designpatterns.StructuralPattern.WrapperPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;

public class WrapperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrapper);
        // 构造被装饰的组件对象
        Hamburger hamburger = new ChickenBurger();
        // 输出  被装饰组件对象的   Name 和  Price
        System.out.println(hamburger.getName()+"  价钱："+hamburger.getPrice());

        // 根据 被装饰的组件对象构造装饰者
        Lettuce lettuce = new Lettuce(hamburger);
        //  输出装饰后的   Name 和  Price
        System.out.println(lettuce.getName()+"  价钱："+lettuce.getPrice());

        //  以下同理
        Chili chili = new Chili(hamburger);
        System.out.println(chili.getName()+"  价钱："+ chili.getPrice());
        chili.addMoreChili();

        Chili chili2 = new Chili(lettuce);
        System.out.println(chili2.getName()+"  价钱："+ chili2.getPrice());

    }
}
