package problem1;

public class _1_project{
	public static void run() {
		int result = 0;
		int j=-100;
		for (int i=0;i<=100;i++) {
			if(i%3==0)	
				j=i;
			else {			
				j=i*2;
				while(j>=0) {
					j--;
					result+=j;
				}
			}
			if (i%3==1) {
				result--;
				continue;
			}
			result+=1;
			if(result>0) {

				break;
			}

		}
	System.out.println("result of first "+result);
	}
	

}
	
