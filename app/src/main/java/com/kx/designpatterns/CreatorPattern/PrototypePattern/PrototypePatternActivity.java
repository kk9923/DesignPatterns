package com.kx.designpatterns.CreatorPattern.PrototypePattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;

public class PrototypePatternActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype_pattern);
        //   构建文档对象
        WordDocument originDoc = new WordDocument();
        originDoc.setText("文档编号一");
        originDoc.addImages("图片a");
        originDoc.addImages("图片b");
        originDoc.showWordDocument();
        System.out.println("---------------------------------------");
        //   以原始文档对象为原型，进行拷贝
        try {
            WordDocument copyDoc = originDoc.clone();
            copyDoc.showWordDocument();
            System.out.println("---------------------------------------");
            String resultString= originDoc.getText() == copyDoc.getText() ? "String是浅拷贝的" : "String是深拷贝的";
            System.out.println(resultString);
            System.out.println("---------------------------------------");
            String resultArrayList = originDoc.getImages() == copyDoc.getImages() ? "ArrayList是浅拷贝的" : "ArrayList是深拷贝的";
            System.out.println(resultArrayList);
            System.out.println("---------------------------------------");
            copyDoc.setText("修改过的文档编号一");
            copyDoc.addImages("新增图片c");
            copyDoc.showWordDocument();
            System.out.println("---------------------------------------");
            originDoc.showWordDocument();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
