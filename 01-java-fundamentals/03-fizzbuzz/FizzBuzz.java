public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"
        // or a String cast of the number itself. 
        // Hint: You can use a String method to cast the int to a String.
        for (int i = 0; i<number; i++){
            if (number % 5 ===0 && number % 3 ===0){
                String result="FizzBuzz";
            }
            else if (number % 5 ===0){
                String result="Buzz";
            }
            else if (number% 3 ===0){
                String result= "Fizz";
            }
            else
                Int result= number;
        }
        return result;
    }
    
    // NINJA BONUS:
    // Create an overloaded method for fizzBuzz
    public String fizzBuzz(int number){
        if (number% 5 == 0 && number % 3 ==0)
            String multOf15Word ="multOf15Word";
        else if (number % 5 ==0)
            String multOf5Word="multOf5Word";
        else if (number % 3 == 0)
            String multOf3Word"multOf3Word";
        else
            String numalt=number;
        return String(%s);
        // Implement the same logic, but replace "Fizz", "Buzz" and 
        // "Fizzbuzz" with the given words
    }
}

        // int number,  
        // String multOf3Word, 
        // String multOf5Word,
        // String multOf15Word