package com.array;

public class KadaneAlgorithm {

	
	public static void main(String[] args) {
		
		int arr[]= new int[]{-100,10,-2,5,7,-1,4,-9,3,4,5,-2,9,-40,45};
		int result[] = (new KadaneAlgorithm()).findMaxSubarray(arr);
		System.out.println(result[0]+" "+result[1]+" "+result[2]+" ");
	}
	
	public int[] findMaxSubarray(int arr[])
	{
		int[] result = new int[3];
		int sumTillNow=Integer.MIN_VALUE;
		int tempSum=0;
		int tempStartIndex=0;
		
		for(int j=0;j<arr.length;j++)
		{
			tempSum+=arr[j];
			if(tempSum>sumTillNow)
			{
				sumTillNow=tempSum;
				result[0]=tempStartIndex;
				result[1]=j;
				result[2]=sumTillNow;
			}
			if(tempSum<0)
			{
				tempSum=0;
				tempStartIndex=j+1;
			}
			
		}
		return result;
	}
	
	
}
