package com.proj;


public class SumOfTriplets {
	
	static class DNode
	{
		int data;
		DNode next;
		DNode prev;
		DNode(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	DNode head=null;
	
	public SumOfTriplets(int arr[]) {
		for(int i : arr)
		{
			addNodeToList(i);
		}
	}
	
	public void addNodeToList(int data)
	{
		DNode pointr = head;
		if(head==null)
		{
			this.head= new DNode(data);
			return;
		}
		while(pointr.next!=null)
		{
		pointr=pointr.next;
		}
		DNode newNode=new DNode(data);
		pointr.next=newNode;
		newNode.prev=pointr;
	}
	
	public static void main(String[] args) {
		SumOfTriplets s1 = new SumOfTriplets(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18});
		s1.sumOfTriplets(s1.head, 23);
		
	}
	
	void sumOfTriplets(DNode head,int x)
	{
		DNode n1=head;
		DNode lastPointer=head;
		while(lastPointer.next!=null && lastPointer.data<=x)
		lastPointer=lastPointer.next;
		while(n1!=null)
		{
			DNode ptr1=n1.next;
			DNode ptr2=lastPointer;
			while(ptr1!=null && ptr2!=null && ptr1.data<ptr2.data )
			{
				int subres=ptr1.data+ptr2.data+n1.data;
				if(x-subres==0)
				{
					System.out.println(n1.data+" "+ptr1.data+" "+ptr2.data);
					ptr1=ptr1.next;
					ptr2=ptr2.prev;
				}
				else if(x-subres>0)
				{
					ptr1=ptr1.next;
				}
				else
				{
					ptr2=ptr2.prev;
				}
			}
			n1=n1.next;
		}
	}

}
