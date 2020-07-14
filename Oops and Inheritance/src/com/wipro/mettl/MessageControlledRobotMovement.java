package com.wipro.mettl.string3;

public class MessageControlledRobotMovement 
{
	public String moveRobot(int input1,int input2,String input3,String input4)
	{
		String path[]=input3.split("-");
		int x=Integer.parseInt(path[0]);
		int y=Integer.parseInt(path[1]);
		String pos=path[2];
		String arr[]=input4.split(" ");
		int f=0;
		for(String s:arr)
		{
			if(s.equals("R"))
			{
				if(pos.equals("N"))
					pos="E";
				else if(pos.equals("E"))
					pos="S";
				else if(pos.equals("S"))
					pos="W";
				else
					pos="N";
			}
			else if(s.equals("L"))
			{
				if(pos.equals("N"))	
					pos="W";
				else if(pos.equals("E"))
					pos="N";
				else if(pos.equals("S"))
					pos="E";
				else
					pos="S";
			}
			else if(f!=1)
			{
				if(pos.equals("N"))
				{
					if(input2>y)
						y=y+1;
					else
						f=1;
				}
				else if(pos.equals("E"))
				{
					if(input1>x)
						x=x+1;
					else
						f=1;
				}
				else
				{
					if(x>0)
						x=x-1;
					else
						f=1;
				}
			}
		}
		if(f!=1)
			return String.valueOf(x)+"-"+String.valueOf(y)+"-"+String.valueOf(pos);
		else
			return String.valueOf(x)+"-"+String.valueOf(y)+"-"+String.valueOf(pos)+"-"+"ER";
	}
}