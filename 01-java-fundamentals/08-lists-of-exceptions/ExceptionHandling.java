import java.util.Random;
import java.util.ArrayList;
class CastingException extends Exception{}
public class ExceptionHandling{
    public static void main( String[] args ) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for( int i = 0; i < myList.size(); i++ ) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Array assignment try successful");
            } catch ( CastingException e ) {
                System.out.println("Assignment fail, casting error" );
            }
        }
    }
}
