package com.example;

import com.example.domain.Employee;
import com.example.domain.Worker;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSalary(120_345.27);
        emp.setSsn("012-34-5678");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee salary: " + emp.getSalary());

        System.out.println("--------------------------------");

        Worker w = new Worker();

        w.setId(55);
        w.setName("John Worker");
        w.setSalary(80_000.00);

        System.out.println("Worker ID: " + w.getId());
        System.out.println("Worker Name: " + w.getName());
        System.out.println("Worker salary: " + w.getSalary());
    }
}
