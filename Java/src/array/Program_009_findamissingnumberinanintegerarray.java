package array;

import java.util.Arrays;

public class Program_009_findamissingnumberinanintegerarray 
{
	static int sumOfNnumbers(int n)
    {
        int sum = (n * (n+1))/ 2;
        return sum;
    }
    //Method to calculate sum of all elements of array
    static int sumOfElements(int[] array)
    {
        int sum = 0;
         for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        } 
        return sum;
    }
    public static void main(String[] args)
    {
        int n = 8;
        int[] a = {1, 4, 5, 3, 2, 8, 6};
        int sumOfNnumbers = sumOfNnumbers(n);
        int sumOfElements = sumOfElements(a);
        int missingNumber = sumOfNnumbers - sumOfElements;
        System.out.println("Input Array : "+Arrays.toString(a));
        System.out.println("Missing Number is = "+missingNumber);
    }
}
