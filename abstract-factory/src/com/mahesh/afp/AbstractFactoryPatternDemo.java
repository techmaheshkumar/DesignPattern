package com.mahesh.afp;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory mobileFactory1 = FactoryProducer.getFactory(false);
        Mobile onePlus = mobileFactory1.getMobile("OnePlus");
        onePlus.getBrandName();
        AbstractFactory mobileFactory2 = FactoryProducer.getFactory(true);
        Mobile iphone = mobileFactory2.getMobile("iphone");
        iphone.getBrandName();
    }
}
