package problem4;

import java.util.Date;


abstract class Deal {

	Date dealDate= new Date();
	String dealType;
	Person person= null;
	String accoutName=null;
	String amount=null;
	String  category ="";
	String description = "";
	
	abstract public Deal parseString( String deal) ;
	abstract public String toPlainText();
	public String getAccoutName() {
		return null;
	}
	public void setAccoutName(String accout) {
	}
	public String getAmount() {
		return null;
	}
	public void setAmount(String amount) {
	}
	public String getCategory() {
		return null;
	}
	public String setCategory(String category) {
		return null;
	}
	public Date getDealDate() {
		return null;
	}
	public void setDealDate(Date dealDate ) {
	}
	public String getDealType() {
		return null;
	}
	public void setDealType(String dealType ) {
	}
	public String getDescription() {
		return null;
	}
	public void setDescription(String description ) {
	}
	public Person getPerson() {
		return null;
	}
	public void setPerson( Person person) {
	}
}

class TransferDeal extends Deal {
	Account inputAconut;
	Account outputAccount;
	
	public Deal parseString( String deal) 
	{
		return null;
		
	}
	public String toPlainText() {
		return accoutName;
		
	}
	public void getInputAconut() {
	}
	public void setInputAconut() {
	}
	public void getOutputAconut() {
	}
	public void setOutputAconut() {
	}
}

class NormalDeal extends Deal {
	
	public Deal parseString( String deal) 
	{
		return null;
		
	}
	public String toPlainText() {
		return accoutName;
		
	}
			
	
}
class StockDeal extends Deal {
	
	boolean isbuy =true;
	String stockNumber="";
	String stockName="";
	
	public boolean isbuy() {return (Boolean) null;}
	public void stebuy(boolean yes) {this.isbuy=yes;}
	public void getstockNumber() {
	}
	public void setstockNumber() {
	}
	public void getstockName() {
	}
	public void setstockName() {
	}
	
	public Deal parseString( String deal) 
	{
		return null;
		
	}
	public String toPlainText() {
		return accoutName;
		
	}
			
	
}