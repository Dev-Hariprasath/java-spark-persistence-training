package org.revature;

public class Employee implements Comparable<Employee>{

    private int Id;
    private String Name;
    private Double Salary;


    public Employee() {
    }

    public Employee(int id, Double salary, String name) {
        Id = id;
        Salary = salary;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }


// Sort By Using Id
//    @Override
//    public int compareTo(Employee o) {
//        if(this.getId() < o.getId()) return -1;
//        if(this.getId() > o.getId()) return 1;
//        return 0;
//    }


// Sort By using Name
    @Override
    public int compareTo(Employee o) {
        return this.getName().equals(o.getName()) ? 0 : this.getName().compareTo(o.getName());
    }

//Sort By Using Salary
//    @Override
//    public int compareTo(Employee o) {
//        if(this.getName() < o.getSalary()) return -1;
//        if(this.getName() > o.getSalary()) return 1;
//        return 0;
//    }
}
