package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Write a java program to find duplicate elements in an array?
public class Program_001_FindDuplicateElements 
{
	public static void main(String[] args) 
	{
		//First Method : Using Brute Force Method
		//method_1();
		//Second Method : Using HashSet
		//method_2();
		//Third method : using Hashmap
		method_3();
	}

	private static void method_3() 
	{	
		System.out.println("-----method_3-----");
		String[] strArray = {"java","jdbc","java","jdbc","qtp","java","selenium"};
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		for(String arrayElement : strArray)
		{
			if(hashmap.containsKey(arrayElement))
			{
				hashmap.put(arrayElement, hashmap.get(arrayElement)+1);
			}
			else
			{
				hashmap.put(arrayElement, 1);
			}
		}
		Set<String> set = hashmap.keySet();
		for(String element : set)
		{
			if(hashmap.get(element)>1)
			{
				System.out.println("Element is duplicate : "+element);
			}
		}
	}

	private static void method_2() 
	{
		System.out.println("-----method_2-----");
		String[] strArray = {"java","jdbc","java","jdbc","qtp","java","selenium"};
		HashSet<String> set = new HashSet<String>();
		for(String arrayElement : strArray)
		{
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is : "+arrayElement);
			}
		}
	}

	private static void method_1() 
	{
		System.out.println("-----method_1-----");
		String[] strArray = {"java","jdbc","java","jdbc","qtp","java","selenium"};
		
		for(int i=0;i<strArray.length-1;i++)
		{
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i].equals(strArray[j])&& (i!=j))
				{
					System.out.println("Duplicate Element is : "+strArray[j]);
				}
			}
		}	
	}
}

