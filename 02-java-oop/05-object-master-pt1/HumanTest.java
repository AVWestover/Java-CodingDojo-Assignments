public class HumanTest{
    public static void main( String[] args ) {
        //make humans
        Human bob = new Human();
        Human rob = new Human();
        //attack
        bob.attack(rob);
        //display
        rob.displayHealth();
    }
}