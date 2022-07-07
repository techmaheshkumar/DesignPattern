package com.mahesh.afp;

public class AndroidMobileFactory extends AbstractFactory {
    @Override
    Mobile getMobile(String model) {
        if (model.equalsIgnoreCase("OnePlus")) {
            return new OnePlus();
        }
        return null;
    }
}
