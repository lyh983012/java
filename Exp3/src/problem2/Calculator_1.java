package problem2;

public class Calculator_1 {
	
	public float getValue(String type) throws Exception{

			if (type.equals("cookie")) {
				return 1.11f;
			}else if (type.equals("pie")) {
				return 5.5f;
			}
			return 0;
}

	public int getValue1(String type) throws Exception{
		if (type.equals("cookie")) {
			return 10;
		}else  {
			return 20;
		}
	}
	
	public float calculation() throws Exception{
		
		float price = getValue("cookie");
		int amount = getValue1("cookie");
		System.out.println(price*amount);
		return price*amount;
		
	}
	

	
}
