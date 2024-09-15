package com.company;

class MYEmployee{
    private int id;
    private String name;

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
}

public class Accessmodifier {
    public static void main(String[] args) {
        MYEmployee myEmployee = new MYEmployee();
        myEmployee.setId(3);
        System.out.println(myEmployee.getId());
        myEmployee.setName("Vishangi");
        System.out.println(myEmployee.getName());
    }
}
