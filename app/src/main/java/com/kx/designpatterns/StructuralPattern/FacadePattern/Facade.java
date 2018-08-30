package com.kx.designpatterns.StructuralPattern.FacadePattern;

/**
 * Created by admin on 2018/8/30.
 */
public class Facade {
   private ModuleA mModuleA = new ModuleA();
   private ModuleB mModuleB = new ModuleB();
   private ModuleC mModuleC = new ModuleC();
    /**
     * 下面这些是A、B、C模块对子系统外部提供的方法
     */
   public void testA(){
       mModuleA.testA();
   }
    public void testB(){
        mModuleB.testB();
    }
    public void testC(){
        mModuleC.testC();
    }
}
