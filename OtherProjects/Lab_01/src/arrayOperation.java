import java.util.Random;
import java.util.Arrays;
public class arrayOperation {
    public static void main(String[] args) {
        // Create a random number generator
        Random rand = new Random();
        // Create an empty array of size 10
        int[] myArray = new int[10];
        // Fill the array with random integers between 1 and 100
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(100) + 1;
        }
        // Print the elements of the array
        System.out.println("\nRandom array: \n" + Arrays.toString(myArray));
        Arrays.sort(myArray);
        // Print the sorted array
        System.out.println("\nSorted array: \n" + Arrays.toString(myArray));
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        // Calculate the average of the array
        double average = (double) sum / myArray.length;
        // Print the sum and average to the console
        System.out.println("\nSum: " + sum);
        System.out.println("\nAverage: " + average);
     
    }
}
