package myaccount.model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;



public class test {

	
	
	static public void main_for_iterator(String args[]) {
		
	ArrayList<Deal> deals=new ArrayList<Deal>();
	
	String[]	 DealType= {"stock","normal","transfer"};
	String[]	 category= {"stock","normal","transfer"};
	Random rand = new Random();
	int choose;
	for(int i=0;i<10;i++){
		choose=rand.nextInt(1001)%3;
		Integer amount2=rand.nextInt(1000);
		if(choose ==0) {
			deals.add(new TransferDeal(new FixedtAccount(),new Person("bob"+amount2.toString()),new FixedtAccount(),amount2.toString()));
		}
		else if(choose ==1) {
			deals.add(new NormalDeal("what?",new Person("catlin"+amount2.toString()),amount2.toString()));
		}
		else if(choose ==2) {
			deals.add(new StockDeal("what?",amount2.toString(),amount2.toString(),new Person("Kate"+amount2.toString()))) ;
		}
	}
	Iterator<Deal> it = deals.iterator();//接口 just like a super class

	while( it.hasNext())
	{
		Deal thi=it.next();
		System.out.println(thi.amount);
	}
	System.out.println("-------");
	
	it = deals.iterator();//接口 just like a super class
	while(it.hasNext()) {
		Deal temp=it.next();
		if(new Integer(temp.amount)<500 ) {
			it.remove();
		}

	}
	System.out.println("-------");
	it = deals.iterator();//接口 just like a super class
	while( it.hasNext())
	{
		Deal thi=it.next();
		System.out.println(thi.amount);
	}
}
	
	static public void main_for_file_writer(String arg[]) {
		try {
			RandomDealWriter.main1();
			TextDealWriter.main1();
			DealZipWriter.main1();
		}catch(Exception e) {
		e.printStackTrace();
		}
		
	}
	
	static public void main_for_random_generator() {
		String[]	 DealType= {"stock","normal","transfer"};
		String[]	 category= {"stock","normal","transfer"};
		
		Deal deals[]=new Deal[10];
		Random rand = new Random();
		int choose;
		for(int i=0;i<10;i++){
			choose=rand.nextInt(1001)%3;
			Integer amount2=rand.nextInt(1000000);
			Integer amount1=rand.nextInt(10);
			if(choose ==0) {
				deals[i]=new TransferDeal(new FixedtAccount(),new Person("bob"+amount1.toString()),new FixedtAccount(),amount2.toString());
			}
			else if(choose ==1) {
				deals[i]=new NormalDeal("what?",new Person("catlin"+amount2.toString()),amount2.toString());
			}
			else if(choose ==2) {
				 deals[i]=new StockDeal("what?",amount2.toString(),amount2.toString(),new Person("Kate"+amount2.toString())) ;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(deals[i].toPlainText());
		}
		System.out.println(" ");
		System.out.println("swap");
		System.out.println(" ");
		
		for(int i=0;i<100;i++) {
				swap(deals,rand.nextInt(10),rand.nextInt(10));
		}
		for(int i=0;i<10;i++) {
			System.out.println(deals[i].toPlainText());
		}
		
		System.out.println(" ");
		System.out.println("sort_by_money");
		System.out.println(" ");
		
		for(int i=0;i<10;i++) {
			for(int j=i;j<10;j++) {
				if(deals[i].compareTo_money(deals[j])==1) 
					swap(deals,i,j);
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(deals[i].toPlainText());
		}
		}
	
	public static void swap(Deal[] deals,int i ,int j) {
		Deal temp=deals[i];
		deals[i]=deals[j];
		deals[j]=temp;
		
	}
}



class RandomDealWriter{
	
	public static void main1() throws IOException {
		String[]	 DealType= {"stock","normal","transfer"};
		String[]	 category= {"stock","normal","transfer"};
		FileOutputStream out = new FileOutputStream("deal.dat");                    
		ObjectOutputStream s =  new ObjectOutputStream(out);
		Deal deals[]=new Deal[10];
		Random rand = new Random();
		int choose;
		for(int i=0;i<10;i++){
			choose=rand.nextInt(101)%3;
			Integer amount2=rand.nextInt(1000000);
			Integer amount1=rand.nextInt(10);
			if(choose ==0) {
				deals[i]=new TransferDeal(new FixedtAccount(),new Person("bob"+amount1.toString()),new FixedtAccount(),amount2.toString());
			}
			else if(choose ==1) {
				deals[i]=new NormalDeal("what?",new Person("catlin"+amount2.toString()),amount2.toString());
			}
			else if(choose ==2) {
				 deals[i]=new StockDeal("what?",amount2.toString(),amount2.toString(),new Person("Kate"+amount2.toString())) ;
			}
			s.writeObject(deals[i]);
		}

		s.flush();
	}
	

	public static void swap(Deal[] deals,int i ,int j) {
			Deal temp=deals[i];
			deals[i]=deals[j];
			deals[j]=temp;	
		}
		
}

class TextDealWriter{
	public static void main1() throws IOException {
		FileInputStream in = new FileInputStream("deal.dat");  
		ObjectInputStream ino= new ObjectInputStream(in);
		Object temp;
		FileOutputStream out = new FileOutputStream("deal.txt");       
		PrintStream text=new PrintStream(out);
		try {
		while((temp=ino.readObject())!=null)
		{ text.println(temp.toString());}
		}catch(Exception e) {
	
		}           
		text.flush();
	}
	
}

class DealZipWriter{
	public static void main1() throws IOException {
		String dest="test.zip";
		ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
		String[] aimfiles= {"deal.dat","deal.txt"};
		for(int i = 0; i < aimfiles.length; i++) {
				
			System.out.println("Writing file " + aimfiles[i]);
		       BufferedInputStream in =new BufferedInputStream( new FileInputStream(aimfiles[i]));
		       out.putNextEntry(new ZipEntry(aimfiles[i])); 
		       int c;
		       while((c = in.read()) != -1) {  
		    	   out.write(c); 
		       System.out.println(c);
		       }
		       in.close();
		}
	}
}
