public class HumanTest{
    public static void main( String[] args ) {
        //create
        Wizard w = new Wizard();
        Ninja n = new Ninja();
        Samurai s = new Samurai();
        //
        w.fireball(s);
        n.steal(s);
        s.meditate();
        w.displayHealth();
        n.displayHealth();
        s.displayHealth();
        w.fireball(n);
        n.displayHealth();
        s.deathBlow(n);
        s.meditate();
        w.displayHealth();
        s.displayHealth();
    }
}