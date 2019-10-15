package problem1;

public class test_thread {

	static public void main(String args[]) {
	printer_1 pt1=new printer_1 (1000000);
	printer_2 pt2=new printer_2 (1000);
	pt2.setPriority(10);
	pt1.run();
	pt2.run();
	}
}

class printer_1 implements Runnable{

	int end;
	printer_1(int i){
		this.end=i;
	}
	@Override
	public void run() {
		for(int i=0;i<=end;i++) {
			System.out.println("p1: "+i);
		}
		
	}

		
}
class printer_2 extends Thread{

	int end;
	printer_2(int i){
		this.end=i;
	}
	public void run() {
		for(int i=0;i<=end;i++) {
			System.out.println("p2: "+i);
		}
		
	}

		
}