package com.kx.designpatterns.SimpleFactoryPattern;

/**
 * 简单工厂的动物工厂类
 */
public class ToyFactory {

    public static  void    creatToy  (String toyName){
        IToy iToy;
        if ("ManToy".equals(toyName)){
            iToy =  new ManToy();
            System.out.println("玩具Name =  "  + iToy.getName() + "    价格 =   " + iToy.price()  );
        }else  if ("WoMenToy".equals(toyName)){
            iToy =  new WoMenToy();
            System.out.println("玩具Name =  "  + iToy.getName() + "    价格 =   " + iToy.price()  );
        }else  if ("ChildToy".equals(toyName)){
            iToy =  new ChildToy();
            System.out.println("玩具Name =  "  + iToy.getName() + "    价格 =   " + iToy.price()  );
        }
        else {
            System.out.println("无法生成该玩具");
        }
    }

    public static <T extends IToy> IToy creatToy(Class<T> clazz) {
        IToy iToy ;
        try {
            iToy = clazz.newInstance();
            return iToy;
        }catch (Exception e) {
            e.printStackTrace();
            throw new UnknownError(e.getMessage());
        }
    }

}
