package problem4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class problem4 {
	static public void main(String args[]) {
		
		Random rand=new Random(); 
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparebysize());
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

class Comparebysize implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1>o2)
		return 1;
		else if (o1<o2)
			return -1;
		else 
			return 0;
		
	}
}