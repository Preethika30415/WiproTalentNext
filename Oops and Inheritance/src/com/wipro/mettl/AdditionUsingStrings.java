package com.wipro.mettl.strings1;
import java.math.BigDecimal;

public class AdditionUsingStrings 
{
	public String addNumberStrings(String input1,String input2) {
	BigDecimal x=new BigDecimal(input1);
	BigDecimal y=new BigDecimal(input2);
	return String.valueOf(x.add(y));
	}
}
