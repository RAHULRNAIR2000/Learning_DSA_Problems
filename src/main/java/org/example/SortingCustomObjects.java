package org.example;

import java.util.Arrays;

class Employee implements Comparable<Employee>{

    private int id;
    private String name;

     public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }
}

public class SortingCustomObjects {
    public static void main(String[] args) {
        Employee [] empArr= new Employee[5];
        empArr[0]=new Employee(1,"rahul");
        empArr[1]=new Employee(44,"joseph");
        empArr[2]=new Employee(22,"amal");
        empArr[3]=new Employee(16,"krishna");
        empArr[4]=new Employee(9,"jelly");
        empArr[5]=new Employee(92,"jithin");

        System.out.println("unsorted array  = "+Arrays.toString(empArr));

        Arrays.sort(empArr);
        System.out.println("sorted array  = "+Arrays.toString(empArr));

    }
}
