public class Gorilla extends Mammal{
    //throw
    public void throwSomething(){
        System.out.println("The gorilla threw something, look out!");
        this.energyLevel = this.energyLevel - 5;
    }
    //eat
    public void eatBananas(){
        System.out.println("The gorilla is satisfied eating bananas.");
        this.energyLevel = this.energyLevel + 10;
    }
    //climb
    public void climb(){
        System.out.println("The gorilla is climbing a tree.");
        this.energyLevel = this.energyLevel - 10;
    }
    //
}