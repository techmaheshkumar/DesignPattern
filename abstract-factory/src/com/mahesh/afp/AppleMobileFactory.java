package com.mahesh.afp;

public class AppleMobileFactory extends AbstractFactory {
    @Override
    public Mobile getMobile(String model) {
        if (model.equalsIgnoreCase("iphone")) {
            return new IPhone();
        }
        return null;
    }
}
