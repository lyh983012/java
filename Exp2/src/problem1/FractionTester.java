
package problem1;

class FractionTester{

	public static void main (String arg[])
	{
	
		Fraction num=new Fraction(7232,8321);
		Fraction num1=new Fraction(3123,7);
		num=num.add(num,num1);
		num.ease();
		System.out.println(num.toString());
		num=num.minus(num,num1);
		num.ease();
		System.out.println(num.toString());
		num=num.time(num,num1);
		num.ease();
		System.out.println(num.toString());
		num=num.add(num,num1);
		num=num.divide(num,num1);
		num.ease();
		System.out.println(num.toString());
		for(int i =1;true;i++)
		{
		}
	}
}