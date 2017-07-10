package com.revature.question7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Sort two employees based on their name, department, and age using the Comparator interface.*/
public class employSort {

    public static void main(String[] args) {
        Employee[] e = {new Employee("John","Biology",21),new Employee("John","Biology",23)};
        Arrays.parallelSort(e ,Comparator.comparing(Employee::getName).thenComparing(Employee::getDepartment)
        		.thenComparing(Employee::getAge));
        Arrays.asList(e).stream().forEach(System.out::println);
    }

    }

class Employee{
    private String name,department;
    private int age;

    public Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}
