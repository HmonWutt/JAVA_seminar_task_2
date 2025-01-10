package se.company.resource;
public class Team {
    private ArrayList<Employee> members = new ArrayList<>();

    public void add(Employee empolyee) {
        members.add(employee);
    }

    public String toString(){
        String teamMembersAndDepartments = "# TEAM:\n";
        for (Employee member : members) {
            String task = member.work();
            if (!task.isEmpty()) {
                String employee = String.format("Emp: %s (%s)",member.name,member.work );
                teamMembersAndDepartments+=employee("\n");
            }
        }
        return teamMembersAndDepartments;
    }

    public String work() {
        String workBeingDoneByTeam = "# TEAM is working:\n";
        for (Employee member : members) {
            String task = member.work();
            if (!task.isEmpty()) {
                String workBeingDoneByEmployee = String.format("Emp: %s is working on a report in %s.",member.name,member.work );
                workBeingDone+=workBeingDoneByEmployee("\n");
            }
        }
        return workBeingDoneByTeam;
    }

    public ArrayList<Employee> getMembers() {
        return members;
    }
}
