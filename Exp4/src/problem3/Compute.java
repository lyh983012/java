package problem3;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.lang.Math;

public class Compute {

static public  void main(String arg[]) {
		double[] numbers=new double[4];
		Scanner in =new Scanner(System.in);
		String input_s=in.nextLine();//输入一个整数
		StringTokenizer cutter=new StringTokenizer(input_s);
	try {
		for(	int i=0;i<4;i++) {
			numbers[i]=Double.parseDouble(cutter.nextToken(";"));			
		}}catch(Exception e) {
			System.out.println("Invalid Input String");
			return;
		}
		double cons= Math.sin(numbers[0])*
					Math.cos(numbers[1])*
				Math.sqrt(Math.pow(numbers[2], numbers[3]));
		
		System.out.println(cons);
		long cons2=Math.round(cons);
		System.out.println(cons2);
		
		SimpleDateFormat myFmt3=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 ");
		System.out.println(myFmt3.format(cons2*1000));
	}
}