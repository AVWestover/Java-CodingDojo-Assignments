public class Project{
    //name and desc feilds
    private String name;
    private String description;
    //return name and desc separated by colon
    public String elevatorPitch() {
        String elevatorPitchString= this.name + " : " + this.description;
        return elevatorPitchString;
    }
    //overload methods
    public Project() {}
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    //getters / setters
    public String getName(){
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    //
}