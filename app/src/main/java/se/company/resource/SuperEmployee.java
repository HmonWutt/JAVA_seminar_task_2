package se.company.resource;
import java.util.ArrayList;
public class SuperEmployee extends Employee{

    private ArrayList<SuperPower> power = new ArrayList();
    SuperEmployee(String name,String work){
        super(name,work,0);
    }
    public void addPower(SuperPower power){
        this.power.add(power);
    }
}