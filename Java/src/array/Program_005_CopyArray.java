package array;

import java.util.Arrays;

public class Program_005_CopyArray 
{
	public static void main(String[] args)
	{
		//1) Copying An Array Using for Loop :
		UsingForLoop();
		//2) Copying An Array Using copyOf() Method of java.util.Array Class :
		Using_copyOf_Method();
		//3) Copying An Array Using clone() Method :
		Using_clone_Method();
		//4) Copying An Array Using arraycopy() Method Of System Class :
		Using_arraycopy_Method();
		//5) Copying An Array Using copyOfRange() Method of java.util.Array Class :
		Using_copyOfRange_Method();
	}

	private static void Using_copyOfRange_Method() 
	{
		System.out.println("---5) Copying An Array Using copyOfRange() Method of java.util.Array Class :---");
		 //An array of int
        int[] i = {1, 21, 15, 48, 79 , 23 , 56 , 90};
        //Copying some part of array i into array i1
        int[] i1 = Arrays.copyOfRange(i, 2, 10);
        System.out.println(Arrays.toString(i1));   //Output : [15, 48, 79, 23, 56, 90, 0, 0]
        int[] i2 = Arrays.copyOfRange(i, 2, 5);
        System.out.println(Arrays.toString(i2));	//Output : [15, 48, 79]
	}

	private static void Using_arraycopy_Method() 
	{
		System.out.println("---4) Copying An Array Using arraycopy() Method Of System Class :---");
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
        //Creating an array object of same length as array 'a'
        int[] b = new int[a.length];
        //creating a copy of array 'a' using arraycopy() method of System class
        System.arraycopy(a, 0, b, 0, a.length);
        //Printing elements of array 'b'
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
        System.out.println(Arrays.toString(b));
        int[]c = new int[a.length];
        System.arraycopy(a, 0, c, 0, 2);
        System.out.println(Arrays.toString(c));
        //[12, 21, 0, 0, 0]
	}

	private static void Using_clone_Method() 
	{
		System.out.println("---3) Copying An Array Using clone() Method :---");
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
        //creating a copy of array 'a' using clone() method
        int[] b = a.clone();  
        //Printing elements of array 'b'
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
	}

	private static void Using_copyOf_Method() 
	{
		System.out.println("---2) Copying An Array Using copyOf() Method of java.util.Array Class :---");
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
        //creating a copy of array 'a' using copyOf() method of java.util.Arrays class
        int[] b = Arrays.copyOf(a, a.length);  
        //Printing elements of array 'b'
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int[]c = Arrays.copyOf(a, 2);
        System.out.println(Arrays.toString(c));
        //[12, 21]
        
        char[] ch = {'a','b','c'};
        char[] ch1 = Arrays.copyOf(ch, 10);
        System.out.println(Arrays.toString(ch1)); //Output :[a, b, c, , , , , , , ,]
	}

	private static void UsingForLoop() 
	{
		System.out.println("---1) Copying An Array Using for Loop :---");
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
        int[] b = new int[a.length];             //Declaring and instantiating another array of ints with same length
        for (int i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        //Now changing values of one array will not reflect in another array
        a[2] = 56;       //Changing value of 3rd element in array 'a'
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
        b[4] = 100;     //Changing value of 5th element in array 'b'
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
	}
}
