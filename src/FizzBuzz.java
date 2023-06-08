import java.util.ArrayList;

public class FizzBuzz {
//    this method just produces an array of random integers from 1-100. You do not need to change this.
    public static int[] generateArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }
        return result;
    }
//    ALL OF YOUR WORK WILL BE DONE IN THE fizzBuzz() METHOD.
//    your method needs to return all of the altered values from the incoming Array in String format
//    it is currently set to void but you will change that to String[]
    public static void fizzBuzz(int[] testArray){
        System.out.println(testArray);
    }

    public static void main(String[] args) {
//        you can pass in any number you want to the generateArray() method and get back an array from 1 to that number
        int[] testArray = generateArray(10);
//        the below method call will run your test given the testArray
        fizzBuzz(testArray);

//        down here you should create a variable to store the return value from the fizzBuzz() and the print it to the console.

    }

}
