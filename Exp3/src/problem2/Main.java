package problem2;

import java.util.Scanner;

import problem2.Calculator_1;
import problem2.Calculator_2;

public class Main {
	public static void main(String arg[]) throws Exception {
		
		Calculator_1 cal=new Calculator_1();
		Calculator_2 cal2=new Calculator_2();
		try{
			cal.calculation();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		try{
			cal2.calculation();
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}
	
