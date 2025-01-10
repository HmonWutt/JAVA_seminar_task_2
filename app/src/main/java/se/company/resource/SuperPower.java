package se.company.resource;
public class SuperPower {
    private String type;
    private String description;
    SuperPower(String type,String description){
        this.description = description;
        this.type = type;
    }
    public String useSuperPower(){
        System.out.println("Use super power");
        return "Use";
    }
    public String getType(){
        return this.type;
    }

}