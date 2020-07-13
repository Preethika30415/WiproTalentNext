package com.wipro.mettl.day10;

public class P_4 
{
	int MostFrequentDigit(int input1,int input2,int input3,int input4)
	{
		int arr[]={0};
		int i;
		if(input1==0&&input2==0&&input3==0&&input4==0)
			return 0;
		if(input1==0)
			arr[0]++;
		if(input2==0)
			arr[0]++;
		if(input3==0)
			arr[0]++;
		if(input4==0)
			arr[0]++;
		while(input1>0)
		{
			arr[input1%10]++;
			input1/=10;
		}
		while(input2>0)
		{
			arr[input2%10]++;
			input2/=10;
		}
		while(input3>0)
		{
			arr[input3%10]++;
			input3/=10;
		}
		while(input4>0)
		{
			arr[input4%10]++;
			input4/=10;
		}
		int index,max=-1;
			for(i=0;i<10;i++)
			{
				if(max<=arr[i])
				{
					max=arr[i];
					index=i;
				}
			}
			return index;
		}
	}