public class PuzzleJava{
    // You will need to import the Random library from java.util
    import java.util.Random;
    import java.util.ArrayList;
    
// To use methods from the Random library you will need to create an instance of Random
    Random randMachine = new Random();
    //getTenRolls
    public Object getArray10(){
        myArray = new int[10];
        for (int i= 0; i< 10;i++){
            num=Math.random() * (21 - 1) + 1;
            myArray[i]=num;
        }
        return myArray;
    }
    //getRandomLetter
    public String getRandomLetter(){
        int[] myArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        function getRandomInt(min, max) {
            min = Math.ceil(min);
            max = Math.floor(max);
        return Math.floor(Math.random() * (max - min) + min);
        int num= getRandomInt(0,25);
        String randLetter=myArray[num];
    }
    //generatePassword
    public Object generatePassword{
        function getRandomInt(min, max) {
            min = Math.ceil(min);
            max = Math.floor(max);
        return Math.floor(Math.random() * (max - min) + min);
        myArray= new int[8]
        for (int i=0;i<9;i++){
        randnum= getRandomInt(0,9);
        myArray[i]=randnum;
    }
    }
    //getNewPasswordSet
    ArrayList<Object> myList = new ArrayList<Object>();
    public Object getNewPasswordSet(number){
        for (int i=0, i<number,i++){
            public Object generatePassword{
                function getRandomInt(min, max) {
                    min = Math.ceil(min);
                    max = Math.floor(max);
                return Math.floor(Math.random() * (max - min) + min);
                }
                myArray= new int[8]
                for (int i=0;i<9;i++){
                    randnum= getRandomInt(0,9);
                    myArray[i]=randnum;
                return myArray;
            }
            myList.add(myArray);
        }
        return myList;
    }
}