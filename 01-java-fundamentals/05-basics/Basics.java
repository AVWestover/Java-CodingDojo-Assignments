public class Basic {
    //1. Write a method that prints all the numbers from 1 to 255.
    for (int i = 1; i<256;i++){
        print(i);
    }
    //2. Write a method that prints all the odd numbers from 1 to 255.
    for (int i = 1; i <256; i++){
        if (i%2 !=0){
            print(i);
        }
        else;
    }
    //3. Sigma of 255 AKA Sum to 255
    public int getSum(){
        int sum = 0;
        for (int i=1; i<256; i++){
            sum= sum+1;
        }
        return sum;
    }
    //4. Iterating through an array
    public int getArray(inputArray){
        for (i=0; i< inputArray.length; i++){
            print(inputArray[i]);
        }
    }
    //5. Find Max
    public int getArrayMax(inputArray){
        max=inputArray[0];
        for (i=0; i<inputArray.length; i++){
            if (inputArray[i]>max){
                max=inputArray[i];
            }
        }
        print(max);
        return max;
    }
    //6. Array with Odd Numbers
    import java.util.ArrayList;
    ArrayList<Object> myList = new ArrayList<Object>();
    for (i= 1;i<256; i++){
        if (i %2 != 0){
            myList.add(i);
        }
    }
    print(myList);
    //I understand the material, not going to do the optional bonuses

}