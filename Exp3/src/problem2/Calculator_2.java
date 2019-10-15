package problem2;

public class Calculator_2 {
	
	public float getValue(String type) throws Exception{

			if (type.equals("cookie")) {
				return 1.11f;
			}else if (type.equals("pie")) {
				return 5.5f;
			}
			return 0;
}

	public int getValue(String type,int amount) throws Exception{
		if (type.equals("cookie")) {
			return 10;
		}else  {
			return 20;
		}
	}
	
	public float calculation() throws Exception{
		float price = getValue("cookie");
		int amount = getValue("cookie",1);
		System.out.println(price*amount);
		return price*amount;
		
	}
	

	
}
