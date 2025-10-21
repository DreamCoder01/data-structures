package org.coreconcepts;

import java.util.Arrays;
import java.util.List;

public class ArraysExamples {

    public static void main(String[] args) {

        //Arrays have a fixed length
        int[] nums = new int[5];
        //Once created, an array's length is immutable.
        //When instantiating an array, you must know the size of the array or the elements within it.
        System.out.println(nums.length);

        //You can change the values of the elements of the array by accessing their respective index and assigning a value.
        //Array indices are 0 based, so to access the first element in an array, its index location is 0
        nums[0] = 1;
        nums[1] = 2;
        //To print out the values of an array to the console, you must first stringify the array
        System.out.println(Arrays.toString(nums));
        //To access a specific element you can print it to the console by referencing its index number
        System.out.println(nums[3]); //returns 0
        //System.out.println(nums[5]); //runtime error, as this index is out of bounds

        //If you know the elements, e.g. a collection of constants, then you can instantiate the array as follows
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums2));
        //Because Java is a strongly typed language, you cannot change the datatype of an array once it has been created
        //nums2[3] = "Compilation Error";

        //There are multiple ways to iterate through an array
        //Classic For Loop (Backwards iteration)
        for (int i = nums2.length - 1; i >= 0; i--) {
            System.out.println(nums2[i]);
        }
        //"Enhanced For Loop" or For-Each Loop
        for(int i : nums2) {
            System.out.println(i);
        }
        //Using streams + Foreach with method referencing
        Arrays.stream(nums2).forEach(System.out::println);

        //The Arrays class has numerous utility methods
        //To verify if two arrays are identical use the equals method
        boolean isEqual = Arrays.equals(nums, nums2);
        System.out.println(isEqual);// returns false; length and elements are different
        int[] nums2Clone = nums2;
        isEqual = Arrays.equals(nums2, nums2Clone);
        System.out.println(isEqual); //returns true; length, elements, and ordering are identical

        //Compare two arrays
        System.out.println(Arrays.compare(nums, nums2));//returns -1; nums.length < nums2.length
        System.out.println(Arrays.compare(nums2, nums));//returns 1; nums2.length > nums.length
        System.out.println(Arrays.compare(nums2, nums2Clone));//returns 0; length, elements, and order of elements are identical
        //Changing a value in an array created from another array, changes the original array and vice versa
        //as they point to the same object in memory.
        nums2Clone[3] = 5;
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums2Clone));
        System.out.println(Arrays.compare(nums2, nums2Clone));
        System.out.println("============");
        nums2[3] = 9;
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums2Clone));
        System.out.println(Arrays.compare(nums2, nums2Clone));
        //Comparing 2 arrays that are equal in length but not values of elements
        int[] nums3 = {1,2,3,7};
        System.out.println(Arrays.compare(nums2, nums3));//returns 1; last index value of nums2 = 9, last index value of nums3 = 7; 9 > 7
        System.out.println(Arrays.compare(nums3, nums2));//returns -1; 7 < 9

        //Sort an array
        int[] intArray = {100,55,20,1000,99,0,5};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        //Convert an array to a list
        System.out.println(Arrays.asList(intArray)); //returns original array as an object, not list of values
        List intListBad = Arrays.asList(intArray);//List of Objects
        for (Object i : intListBad) {
            System.out.println(i);//i is an object, not a collection, therefore it is non-iterable
                /*
                    for (int j : i) {
                        System.out.println("This doesn't work.");
                    }
                 */
        }
        List<int[]> intListGood = Arrays.asList(intArray);
        for (int[] a : intListGood) {
            System.out.println(Arrays.toString(a));
            for (int b : a){
                System.out.println(b);
            }
        }

        //Binary Search
        int intTarget = 99;
        System.out.println(
                intTarget + " located at index: "
                        + Arrays.binarySearch(intArray, intTarget)
        ); //returns index of target value

        //copyOf() allows you to copy an existing array to a new array and define the new array's length
        int[] copyOfArray = Arrays.copyOf(intArray, 10);
        System.out.println(Arrays.toString(copyOfArray));
        //Proof of new array
        copyOfArray[3] = 11;
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(copyOfArray));//this is a new object in memory





    }
}