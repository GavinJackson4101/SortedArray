import java.util.Arrays;
public class Main {

    public static boolean isSorted(int[] a) // Function which takes an integer array as argument and returns a boolean value

    {

        for(int i = 1; i < a.length; i++){ // Iterating through the array

            if (a[i-1] > a[i]) { // Checking if the value to the left of the current index is greater than the current element

                return false;   // Not ascending

            }

        }

        return true; // No such pair is found where the value to the left of the current index is greater than the current element

    }

    public static void main(String[] args)

    {

        int arr[] = {23,24,51,12,66,32,13,38,25}; // Initializing the array

        System.out.println("Original Array :"+ Arrays.toString(arr)); // Displaying the original array

        System.out.println("Array is sorted :"+ Boolean.toString(isSorted(arr))); // Displaying whether the array is sorted in ascending order or not by calling a method isSorted

        Arrays.sort(arr); // Sorting the array using sort()  method in java.util.Arrays class.

        System.out.println("Sorted Array :"+ Arrays.toString(arr)); //Displaying the sorted array

        System.out.println("Array is sorted :"+ Boolean.toString(isSorted(arr)));  // Displaying whether the array is sorted in ascending order or not by calling a method isSorted

    }

}