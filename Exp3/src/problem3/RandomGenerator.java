package problem3;
import java.util.Random;

public class RandomGenerator {

	public void generator(int n){
		int temp,last=0;
		float average=0;
		String pr,av;
		pr="---";
		av="---";
		System.out.println ("[value]   [G/L than Prev.]   [average]   [G/L than Aver.]");
		Random rand = new Random();
		for (int i=0;i<n;i++) {
			temp=rand.nextInt(99)+1;
			average=(average*(i)+temp)/(i+1);
			if (i>0 && temp>last) {
			pr="Greater";
			}else if (i>0 && temp<last) {
				pr="Less";
			}else if (i>0 && temp==last) {
				pr="Equal";
			}
			
			if (i>0 && temp>average) {
				av="Greater";
			}else if (i>0 && temp<average) {
				av="Less";
			}else if (i>0 && temp==average) {
				av="Equal";
			}

			System.out.println (temp+"   "+pr+"   "+average+"   "+av);
			last=temp;
		}		
	}

	
}
