package myaccount.model;

import java.awt.List;
import java.io.Serializable;
import java.util.Date;


abstract class Account implements Serializable{
	
	private String name;
	private String type;
	private String accountNumber;
	private String description;
	private Person belongto;
	private String currency;
	private List deallist;
	
	abstract public  String tgetReport(Date start , Date end,int reportType);
	public  String getAccountNumberO() {
		return null;
	}
	public  void setAccountNumber(String accounr) {
	}
	public  Person getBelongtoO() {
		return null;
	}
	public  Person setBelongtobelongto() {
		return null;
	}
	public String getCurrencyO() {
		return  null;
		
	}
	public void setCurrency(String currency) {}
	
	public List getDealListO() {
		return null;
	}
	public void setDealList( List dealList) {}
	public String getDescription0() {
		return null;
	}
	public void setDesaription(String desciption ) {}
	public String getNameO() {
		return  null;};
	public void setName(String name) {}
	public String getTypeO(){
		return null;};
	public void setType(String type) {};
	
}

class StockDealAccount extends Account {
	
	private int  loanLimit =0;
	public int getLoanLimit() {
		return 0;
	}
	public int setLoanLimit() {
		return 0;
	}
	public String tgetReport(Date start , Date end,int reportType) 
	 {
		return null;
		 
	 }
	 
}

class currentAccount extends Account {
	

	public String tgetReport(Date start , Date end,int reportType) 
	 {
		return null;
		 
	 }
	 
}


class FixedtAccount extends Account {
	

	public String tgetReport(Date start , Date end,int reportType) 
	 {
		return null;
		 
	 }
	 
}



