package problem3;

import java.util.ArrayList;
import java.util.Random;

public class exp3 {

	static public void main(String args[]) {
		vecto throbject=new vecto(20,11);
		cosumer con= new cosumer(throbject);
		producer pro= new producer(throbject);
		pro.start();
		con.start();
	}
}
 
class producer extends Thread {

	
	producer(vecto stoe){
		storage=stoe;
	}
	vecto storage;
	
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		synchronized(storage) {
			try {
			System.out.println("producing..");
			for(int i=0;i<storage.pr;i++) {
				Random ran=new Random();
				storage.slist.add("get:  "+ran.nextInt()+"---");
				}
			System.out.println("produce finished, now the storage is"+ storage.slist.size());
			this.notify();
			this.wait();
			}catch(Exception e) {}
			}
		}
	};
	
}

class cosumer extends Thread {
	
	
	vecto storage;
	
	cosumer(vecto stoe){
		storage=stoe;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		synchronized(storage) {
			try {
			System.out.println("consuming..");
			for(int i=0;i<storage.co;i++) {
				if(storage.slist.size()<=0) {
					this.notify();
					this.wait();
				}
				System.out.println(storage.slist.get(storage.slist.size()-1));
				storage.slist.remove(storage.slist.size()-1);
				}
			System.out.println("After consuming ,the size is:"+storage.slist.size());
			}catch(Exception e) {	}
			}
		}
	};
	
}

class vecto implements Runnable{

	ArrayList<String> slist;
	boolean available;
	int co,pr;
	public vecto(int n,int m) {
		co=n;
		pr=m;
		available=false;
		slist=new ArrayList<String>();
	}
	@Override
	synchronized public void run() {
	}
}
