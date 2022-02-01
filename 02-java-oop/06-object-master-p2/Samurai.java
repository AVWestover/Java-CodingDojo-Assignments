public class Samurai extends Human{
    //attributes
    private int health = 200;
    private static int numOfSamurai = 0;
    //create method
    public Samurai(){
        numOfSamurai++;
    }
    //method kill/death blow
    public void deathBlow(Human enemy){
        enemy.health = 0;
        this.health = this.health / 2;
    }
    //method meditate/heal
    public void meditate(){
        this.health = this.health + (this.health / 2);
    }
    //method how many
    public int howMany(){
        System.out.println("There are " + numOfSamurai + "s");
        return numOfSamurai;
    }
}