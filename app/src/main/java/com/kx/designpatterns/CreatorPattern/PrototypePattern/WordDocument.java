package com.kx.designpatterns.CreatorPattern.PrototypePattern;

import java.util.ArrayList;

/**
 * Created by admin on 2018/8/21.
 */
public class WordDocument implements Cloneable {
    // 文本信息
    private String mText;
    //  图片列表集合
    private ArrayList<String> mImages = new ArrayList<>();

    /**
     *  实现Cloneable接口，重写clone()方法
     */
    @Override
    public WordDocument clone() throws CloneNotSupportedException {
        WordDocument wordDocument = (WordDocument) super.clone();
        wordDocument.mImages = (ArrayList<String>) this.mImages.clone();
        return wordDocument;
    }
    public String getText() {
        return mText;
    }
    public void setText(String text) {
        mText = text;
    }
    public ArrayList<String> getImages() {
        return mImages;
    }
    public void addImages(String image) {
        this.mImages.add(image);
    }
    /**
     *  打印文档内容
     */
    public void showWordDocument(){
        System.out.println("Text =  "  +  mText );
        for (String image : mImages) {
            System.out.println(" image =  "  +   image);
        }
    }
}
