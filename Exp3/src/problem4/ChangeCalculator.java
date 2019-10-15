package problem4;

import java.util.Scanner;

public class ChangeCalculator {

	private static final Exception WrongFormat = new WrongFormatException();
	private static final Exception IntPutOutOfRange = new InputOutOfRangeException();
	final double coinlist[]= {200,100,20,10,2,1};
	final double coinlists[]= {2.00,1.00,0.20,0.10,0.02,0.01};
	
	public void findCoin() throws Exception {
		Scanner sc = new Scanner(System.in);
		while( 1==1 )
		{
			try {
			check(sc.nextFloat());
			}catch (Exception e) {
			e.printStackTrace();
			if (e instanceof InputOutOfRangeException) {
				break;
		}}}
	}
	public int check(float n) throws Exception{
		n=5-n;
		int nn=(int) (100*(n+0.0001));
		if (nn>500 || n<0)
		 {
			System.out.println("Input out of range");
			throw IntPutOutOfRange;
		}
		float x= nn-100*n;
		x=x>0?x:-x;
		System.out.println(x+"  "+nn+"  "+n  );
		if(x>0.01) {
			System.out.println("Wrong format");
			throw WrongFormat;
		}

		int temp=0;
		for(int i=0;i<=5;) {
		nn-=coinlist[i];
		temp++;
		if (nn<0){
			temp--;
			nn+=coinlist[i];
			if (temp!=0) {	
				System.out.println(coinlists[i]+": "+temp);
			}
			temp=0;
			i++;
		}
		if (nn==0){
			if (temp!=0) {
				System.out.println(coinlists[i]+": "+temp);
			}
			temp=0;
			break;
		}
		}
			
		return 0;
			
		
			
	}
}
