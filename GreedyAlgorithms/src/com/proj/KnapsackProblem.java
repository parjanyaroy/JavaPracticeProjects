package com.proj;

public class KnapsackProblem {

	
	
	public static void main(String[] args) {
	int items[] = new int[]{3,5,2};
	int profit[] =new int[]{8,1,6};
	int maxWeight=6;
	System.out.println(getMaximumOfItems(items, profit, items.length, maxWeight));
	}
	/*
	 * Function Parameter -> (weight[],itemProfil[],int nItems,int maxWeight)
	 * 
	 * Check if current item weight is lesser than maxWeight , 
	 * if not then 
	 * call function again without item (decreasing nItems count)
	 * if yes
	 * calculate profit by keeping item
	 * calculate profile by not considering item
	 * return the max from the two above.
	 * 
	 * 
	 */
	
	public static int getMaximumOfItems(int weight[],int profit[],int curItem,int maxWeight)
	{
		if(maxWeight==0 || curItem==0)
			return 0;
		else
		{
			if(weight[curItem-1]>maxWeight)
				return getMaximumOfItems(weight, profit, curItem-1, maxWeight);
			else
			{
				int including = profit[curItem-1]+getMaximumOfItems(weight, profit, curItem-1, maxWeight-weight[curItem-1]);
				int excluding = getMaximumOfItems(weight, profit, curItem-1, maxWeight);
				return Math.max(including, excluding);
				
			}
		}
	}
	
}
