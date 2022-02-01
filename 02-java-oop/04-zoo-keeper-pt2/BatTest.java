public class BatTest{
    public static void main( String[] args ) {
        //make bat
        Bat b = new Bat();
        //attack three towns
        b.attackTown();
        b.attackTown();
        b.attackTown();
        //eat two humans...unfortunately
        b.eatHumans();
        b.eatHumans();
        //fly twice
        b.fly();
        b.fly();
        //display
        b.displayEnergy();
    }
}