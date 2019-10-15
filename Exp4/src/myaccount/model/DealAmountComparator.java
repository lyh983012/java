package myaccount.model;

import java.util.Comparator;

public class DealAmountComparator implements Comparator<Deal> {

	@Override
	public int compare(Deal o1, Deal o2) {
			if(o1.dealDate.getTime()>o2.dealDate.getTime())
				return 1;
			else
				return 0;
		}
}


