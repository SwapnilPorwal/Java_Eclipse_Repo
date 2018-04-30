package array;
//Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number?
public class Program_003_FindAllPairsOfElementsInAnArrayWhoseSumIsEqualToAGivenNumber 
{
	public static void main(String[] args) 
	{
		int[] arr = {4, 6, 5, -10, 8, 5, 20 , 10};
		int number = 10;
		for(int i = 0 ; i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==number)
				{
					System.out.println(arr[i]+"+"+arr[j]+"="+number);
				}
			}
		}
	}
}
