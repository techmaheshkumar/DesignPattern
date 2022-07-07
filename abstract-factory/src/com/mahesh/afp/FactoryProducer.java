package com.mahesh.afp;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isApple) {
        if (isApple) {
            return new AppleMobileFactory();
        } else {
            return new AndroidMobileFactory();
        }
    }
}
