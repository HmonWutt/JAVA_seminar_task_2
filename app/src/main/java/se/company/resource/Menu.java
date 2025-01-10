package se.company.resource;

public class Menu {
    public static void printMenu(){
        System.out.println( "-----------------\n"+
                "| 1) Create a new empty team\n"+
                "| 2) Add normal employee to team\n"+
                "| 3) Add John, Jane and little Jr\n"+
                "| 4) Print out work being done\n"+
                "| 5) Add super employee to team\n"+
                "| 6) Add three super employee, with powers, to team\n"+
                "| 7) Salary report\n"+
                "| m) Print menu\n"+
                "| qQ) Quit\n"+
                "-----------------\n"+
                "Enter your choice:\n");
    }
    public static void createEmployee(){
        Employee newEmployee= new Employee("Jane","IT",100);
    }
}
