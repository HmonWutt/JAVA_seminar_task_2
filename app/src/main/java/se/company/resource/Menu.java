package se.company.resource;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private Team team = new Team()
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

    public void run() {
        try {
            do {
                printMenu(); // Display the menu options
                choice = getChoice(); // Get user's choice

                switch (choice) {
                    case "1": // Create a new empty team
                        team = new Team();
                        System.out.println("New team created: " + team.toString());
                        break;

                    case "2": // Add normal employee to the team
                        System.out.println("# Create new NormalEmployee");
                        System.out.print(" Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print(" Enter work: ");
                        String work = scanner.nextLine();

                        int salary;
                        while (true) {
                            System.out.print(" Enter salary: ");
                            try {
                                salary = Integer.parseInt(scanner.nextLine().trim());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a valid number for salary.");
                            }
                        }

                        NormalEmployee newEmployee = new NormalEmployee(name, work, salary);
                        team.add(newEmployee);
                        System.out.println(team.toString());
                        break;

                    case "3": // Add predefined employees and print the team
                        team.add(new NormalEmployee("Jane Doe", "IT", 50000));
                        team.add(new NormalEmployee("John Doe", "Economic", 60000));
                        team.add(new NormalEmployee("Little JR Doe", "Trainee", 30000));
                        System.out.println(team.toString());
                        break;

                    case "4": // Print out work being done
                        System.out.println(team.work());
                        break;

                    case "5": // Add super employee to the team
                        System.out.println("# Create new SuperEmployee");
                        System.out.print(" Enter name: ");
                        String superName = scanner.nextLine();
                        System.out.print(" Enter work: ");
                        String superWork = scanner.nextLine();

                        SuperEmployee superEmployee = new SuperEmployee(superName, superWork);
                        team.add(superEmployee);
                        System.out.println(team.toString());
                        break;

                    case "6": // Add three super employees with powers to the team
                        System.out.println("# Adding three super employees with powers to the team...");

                        // Define super powers
                        SuperPower flight = new SuperPower("Flight", "Fly at supersonic speeds.");
                        SuperPower strength = new SuperPower("Strength", "Exhibit superhuman strength.");
                        SuperPower invisibility = new SuperPower("Invisibility", "Become invisible to the naked eye.");

                        // Create super employees
                        SuperEmployee clark = new SuperEmployee("Clark Kent", "IT");
                        clark.addPower(flight);
                        clark.addPower(strength);

                        SuperEmployee jessica = new SuperEmployee("Jessica Jones", "Investigations");
                        jessica.addPower(strength);
                        jessica.addPower(flight);

                        SuperEmployee wade = new SuperEmployee("Wade Wilson", "Public relations");
                        wade.addPower(invisibility);
                        wade.addPower(strength);

                        // Add to team
                        team.add(clark);
                        team.add(jessica);
                        team.add(wade);

                        // Print updated team
                        System.out.println(team.toString());
                        break;

                    case "7": // Salary report
                        System.out.println("# TEAM Salary " + new SimpleDateFormat("yyyy MMMM").format(new Date()));
                        System.out.println("--------------------------------");

                        int index = 1;
                        int totalSalary = 0;

                        // Loop through all team members and print their salary
                        for (Employee member : team.getMembers()) {
                            System.out.printf(" (%d) %-20s %d\n", index++, member.getName(), member.getSalary());
                            totalSalary += member.getSalary();
                        }

                        System.out.println("--------------------------------");
                        System.out.printf("Total salary is          %d\n", totalSalary);

                        // Print the report date
                        System.out.println("Report generated " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                        break;

                    case "q": // Quit the program
                        System.out.println("Exiting the program.");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } while (!choice.equals("q") );
        } finally {
            scanner.close(); // Close the scanner to free resources
        }
    }
    public String getChoice() {
        System.out.print("Enter your choice: ");
        choice = scanner.nextLine();
        return choice;
    }
}
