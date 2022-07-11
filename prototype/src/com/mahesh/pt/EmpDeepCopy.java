package com.mahesh.pt;

public class EmpDeepCopy implements Cloneable {
    String name;
    DeepDepartment dept;

    public EmpDeepCopy(String name, DeepDepartment dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public EmpDeepCopy clone() {
        try {
            EmpDeepCopy emp = (EmpDeepCopy) super.clone();
            emp.dept = (DeepDepartment) dept.clone();
            return emp;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "EmpDeepCopy{" +
                "name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}

class DeepDepartment implements Cloneable {
    String name;

    public DeepDepartment(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public DeepDepartment clone() {
        try {
            return (DeepDepartment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

