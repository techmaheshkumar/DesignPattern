package com.mahesh.pt;

public class PrototypeDemo {

    public static void main(String[] args) {
        Department dept = new Department("CS");

        // Shallow Copy.
        System.out.println("--- ShallowCopy ---");
        EmpShallowCopy emp1 = new EmpShallowCopy("Mahesh", dept);
        EmpShallowCopy emp2 = emp1.clone();
        System.out.println("emp1 : " + emp1);
        emp2.dept.name = "IT";

        // This above change emp2 will be reflected in original Employee 'emp1'
        System.out.println("emp1 : " + emp1);
        System.out.println("emp2 : " + emp2);

        //Deep Copy
        System.out.println("--- DeepCopy ---");
        DeepDepartment deepDept = new DeepDepartment("CS");
        EmpDeepCopy emp3 = new EmpDeepCopy("Tharani", deepDept);
        EmpDeepCopy emp4 = emp3.clone();
        System.out.println("emp3 : " + emp3);
        emp4.dept.name = "IT";

        // This above change emp2 will be reflected in original Employee 'emp1'
        System.out.println("emp3 : " + emp3);
        System.out.println("emp4 : " + emp4);

//        --- ShallowCopy ---
//        emp1 : EmpShallowCopy{name='Mahesh', dept=Department{name='CS'}}
//        emp1 : EmpShallowCopy{name='Mahesh', dept=Department{name='IT'}}
//        emp2 : EmpShallowCopy{name='Mahesh', dept=Department{name='IT'}}
//        --- DeepCopy ---
//        emp3 : EmpDeepCopy{name='Tharani', dept=Department{name='CS'}}
//        emp3 : EmpDeepCopy{name='Tharani', dept=Department{name='CS'}}
//        emp4 : EmpDeepCopy{name='Tharani', dept=Department{name='IT'}}
    }
}
