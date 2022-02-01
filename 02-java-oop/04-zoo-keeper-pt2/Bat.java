public class Bat extends Mammal{
    //attributes
    int energyLevel = 300;
    //fly
    public void fly(){
        System.out.println("flap flap");
        this.energyLevel = this.energyLevel - 50;
    }
    //eat humans
    public void eatHumans(){
        this.energyLevel = this.energyLevel + 25;
    }
    //attack town
    public void attackTown(){
        System.out.println("AHHHHHH!!");
        this.energyLevel = this.energyLevel - 100;
    }
    //
}