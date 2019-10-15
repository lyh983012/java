package problem5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class rewrite {
	static public void main(String args[]) {
		
		Random rand=new Random(); 
		TreeSet<Integer> ts = new TreeSet<Integer>();
		while(ts.size()<80) {
			ts.add(rand.nextInt(100));
			}
		Iterator<Integer> hey=ts.iterator();
		int i=1;
		while(hey.hasNext()) {
			System.out.println("num_"+i+++" is "+hey.next());
		}
	}

}

