package com.wipro.mettl.day9;

public class EXAM_3 
{
	public int createPIN(int input1,int input2,int input3)
	{
		int u1=input1%10,u2=input2%10,u3=input3%10;
		int t1=(input1/10)%10,t2=(input2/10)%10,t3=(input3/10)%10;
		int h1=input1/100,h2=input2/100,h3=input3/100;
		int u=Math.min(u1,Math.min(u2,u3));
		int t=Math.min(t1,Math.min(t2, t3));
		int h=Math.min(h1, Math.min(h2, h3));
		int th=Math.max(u1, Math.max(u2, Math.max(u3, Math.max(t1, Math.max(t2, Math.max(t3,Math.max(h1, Math.max(h2, h3))))))));
		int num=th*1000+h*100+t*10+u;
		return num;
	}

}
