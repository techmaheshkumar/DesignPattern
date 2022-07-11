package com.mahesh.b;

public class Person {

    //All final attributes
    private final String name;
    private final int age;
    private final String mno;

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.mno = builder.mno;
    }

    //Getters, and NO setter to provide immutability
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMno() {
        return mno;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mno='" + mno + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private final String name;
        private int age;
        private String mno;

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder mno(String mno) {
            this.mno = mno;
            return this;
        }

        //Return the finally constructed Person object
        public Person build() {
            return new Person(this);
        }

    }
}
