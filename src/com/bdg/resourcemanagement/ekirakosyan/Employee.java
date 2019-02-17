package com.bdg.resourcemanagement.ekirakosyan;

public class Employee {

    private SalaryDetail salaryDetail;
    private Person person;

    public Employee(SalaryDetail salaryDetail, Person person) {
        this.salaryDetail = salaryDetail;
        this.person = person;
    }

    public SalaryDetail getSalaryDetail() {
        return salaryDetail;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salaryDetail=" + salaryDetail +
                ", person=" + person +
                '}';
    }
}