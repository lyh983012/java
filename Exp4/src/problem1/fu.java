package problem1;

abstract class danpianji{
	
public String CPU_name;
public long CPU_frequence;
public long clock_frequence;
public long RAM;
public abstract void LED();
	
}

class danpinaji_51 extends danpianji{
 public void LED() {
	 System.out.println("i dont have LED");
 }
 
 public void danpianji_51() {
	 this.CPU_name="made in china";
	 this.CPU_frequence=10000000;
	 this.clock_frequence=1000;
	 this.RAM=120323;
 }
 
}

class danpinaji_52 extends danpianji{
	 public void LED() {
		 System.out.println("i have no LED");
	 }
	 
	 public void danpianji_51() {
		 this.CPU_name="made by rabbit";
		 this.CPU_frequence=0;
		 this.clock_frequence=0;
		 this.RAM=0;
	 }
	 
	}

class Arduino extends danpianji{
	 public void LED() {
		 System.out.println("i have LED");
	 }
	 
	 public void danpianji_51() {
		 this.CPU_name="made in Italy";
	 }
	 
	}
