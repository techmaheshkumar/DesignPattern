package com.mahesh.pt;

public class EmpShallowCopy implements Cloneable {
    String name;
    Department dept;

    public EmpShallowCopy(String name, Department dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public EmpShallowCopy clone() {
        try {
            return (EmpShallowCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "EmpShallowCopy{" +
                "name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}


