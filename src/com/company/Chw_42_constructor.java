package com.company;

class NewEmployee{
    private int id;
    private String name;

    private int salary;

    public NewEmployee(int MyId, String MyName,int MySalary) {
        this.id = MyId;
        this.name = MyName;
        this.salary = MySalary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}



public class Chw_42_constructor {
    public static void main(String[] args) {
        NewEmployee employee = new NewEmployee(3,"PrommingWithVishangi",10000);
//        employee.setId(1);
//        employee.setName("Code with Vishangi");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
