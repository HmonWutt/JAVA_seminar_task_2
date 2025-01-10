package se.company.resource;
public class Employee {
    String name;
    String work;
    int salary;
    Employee(String name, String work, int salary){
       this.name = name;
       this.work = work;
       this.salary = salary;
    }

    public String toString(){
        System.out.println("This method has not been specifed");
        return "";
    }
    public void work(){
        System.out.println("This method has not been specifed");
    }
}

