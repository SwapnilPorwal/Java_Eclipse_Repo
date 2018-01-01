package array;

import java.util.Arrays;

//Write a java program to find second largest element in an array of integers?
public class Program_002_findsecondlargestnumberinanintegerarray 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,45,67,89,1,2,3,4,333,333,44,};
		int Firstlargest;
		int Secondlargest;
		if(arr[0]>arr[1])
		{
			Firstlargest = arr[0];
			Secondlargest = arr[1];
		}
		else
		{
			Firstlargest = arr[1];
			Secondlargest = arr[0];
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>Firstlargest)
			{
				Secondlargest=Firstlargest;
				Firstlargest = arr[i];
			}
			else if(arr[i]<Firstlargest && arr[i]>Secondlargest )
			{
				Secondlargest=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Second largest : "+Secondlargest);
	}
}
