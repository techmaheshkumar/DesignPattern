package com.mahesh.b;

public class BuilderDemo {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder("mahesh").build();
        System.out.println("person1:" + person1.toString());
        Person person2 = new Person.PersonBuilder("mahesh").age(35).mno("9952262062").build();
        System.out.println("person2:" + person2.toString());
// Output
//        person1:Person{name='mahesh', age=0, mno='null'}
//        person2:Person{name='mahesh', age=35, mno='9952262062'}
    }
}
