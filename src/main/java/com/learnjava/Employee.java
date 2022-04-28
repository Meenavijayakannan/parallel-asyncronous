package com.learnjava;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String ename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int age;

    public String getEname() {
        return ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && getAge() == employee.getAge() && getEname().equals(employee.getEname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEname(), getAge());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                '}';
    }
}
