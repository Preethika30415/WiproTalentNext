package com.wipro.mettl.level3;

public class P__3 
{
	public int findPassword(int input1,int input2,int input3,int input4,int input5)
	{
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		int arr3[]=new int[10];
		int arr4[]=new int[10];
		int arr5[]=new int[10];
		int t1=input1,t2=input2,t3=input3,t4=input4,t5=input5;
		int stable_sum=0,unstable_sum=0,i;
		while(input1>0)
		{
			arr1[input1%10]++;
			input1/=10;
		}
		while(input2>0)
		{
			arr2[input2%10]++;
			input2/=10;
		}
		while(input3>0)
		{
			arr3[input3%10]++;
			input3/=10;
		}
		while(input4>0)
		{
			arr4[input4%10]++;
			input4/=10;
		}
		while(input5>0)
		{
			arr5[input5%10]++;
			input5/=10;
		}
		for(i=0;i<10;i++)
		{
			System.out.println(arr1[i]+""+arr2[i]+""+arr3[i]+""+arr4[i]+""+arr5[i]);
		}
		int count=0;
		for(i=0;i<10;i++)
		{
			if(arr1[i]!=0)
			{
				count=arr1[i];
				break;
			}
		}
		for(i=0;i<10;i++)
		{
			if(arr1[i]!=0)
			{
				if(count!=arr1[i])
				{
					unstable_sum+=t1;
					break;
				}
			}
		}
		if(i==10)
			stable_sum+=t1;
		for(i=0;i<10;i++)
		{
			if(arr2[i]!=0)
			{
				count=arr2[i];
				break;
			}
		}
		for(i=0;i<10;i++)
		{
			if(arr2[i]!=0)
			{
				if(count!=arr2[i])
				{
					unstable_sum+=t2;
					break;
				}
			}
		}
		if(i==10)
			stable_sum+=t2;
		for(i=0;i<10;i++)
		{
			if(arr3[i]!=0)
			{
				count=arr3[i];
				break;
			}
		}
		for(i=0;i<10;i++)
		{
			if(arr3[i]!=0)
			{
				if(count!=arr3[i])
				{
					unstable_sum+=t3;
					break;
				}
			}
		}
		if(i==10)
			stable_sum+=t3;
		for(i=0;i<10;i++)
		{
			if(arr4[i]!=0)
			{
				count=arr4[i];
				break;
			}
		}
		for(i=0;i<10;i++)
		{
			if(arr4[i]!=0)
			{
				if(count!=arr4[i])
				{
					unstable_sum+=t4;
					break;
				}
			}
		}
		if(i==10)
			stable_sum+=t4;
		for(i=0;i<10;i++)
		{
			if(arr5[i]!=0)
			{
				count=arr5[i];
				break;
			}
		}
		for(i=0;i<10;i++)
		{
			if(arr5[i]!=0)
			{
				if(count!=arr5[i])
				{
					unstable_sum+=t5;
					break;
				}
			}
		}
		if(i==10)
			stable_sum+=t5;
		System.out.println(stable_sum);
		System.out.println(unstable_sum);
		return stable_sum-unstable_sum;
	}
}
