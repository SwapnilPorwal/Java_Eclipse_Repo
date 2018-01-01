package array;

import java.util.Arrays;
import java.util.HashSet;

public class Program_013_JavaProgramToFindUnionAndIntersectionOfMultipleArrays 
{
	public static void main(String[] args)
    {    
        int[] inputArray1 = {2, 3, 4, 7, 1};
        int[] inputArray2 = {4, 1, 3, 5};
        int[] inputArray3 = {8, 4, 6, 2, 1};
        int[] inputArray4 = {7, 9, 4, 1};
        union(inputArray1, inputArray2, inputArray3, inputArray4);
        
        Integer[] iinputArray1 = {2, 3, 4, 7, 1};
        Integer[] iinputArray2 = {4, 1, 3, 5};
        Integer[] iinputArray3 = {8, 4, 6, 2, 1};
        Integer[] iinputArray4 = {7, 9, 4, 1};
        intersection(iinputArray1, iinputArray2, iinputArray3, iinputArray4);
    }
	
	static void union(int[] ... inputArrays)
    {
        HashSet<Integer> unionSet = new HashSet<Integer>(); 
        System.out.println("Input Arrays :");
        System.out.println("======================");
        for (int[] inputArray : inputArrays) 
        {
            System.out.println(Arrays.toString(inputArray));
            for (int i : inputArray)
            {
                unionSet.add(i);
            }
        }
        System.out.println("==========================="); 
        System.out.println("Union Of All Input Arrays :");
        System.out.println("===========================");
        System.out.println(unionSet);
    }
	
	static void intersection(Integer[] ... inputArrays)
    {    
        //Printing input arrays
        System.out.println("Input Arrays :");
        System.out.println("======================");
        for (Integer[] inputArray : inputArrays) 
        {
            System.out.println(Arrays.toString(inputArray));
        }
        //Creating HashSet object for first input array 
        HashSet<Integer> intersectionSet = new HashSet<>(Arrays.asList(inputArrays[0]));
        //Calling retainAll() method of first object by passing 2nd, 3rd, 4th... objects
        for (int i = 1; i < inputArrays.length; i++) 
        {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArrays[i]));
            intersectionSet.retainAll(set);
        }
        System.out.println("==========================="); 
        System.out.println("Intersection Of All Input Arrays :");
        System.out.println("===========================");
        System.out.println(intersectionSet);
    }
}
