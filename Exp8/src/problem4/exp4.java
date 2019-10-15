package problem4;

import java.util.ArrayList;
import java.util.Random;

public class exp4 {

	static public void main(String args[]) {
		vecto throbject=new vecto(13,20);
		Thread con= new Thread(throbject,"consumer");
		Thread pro=new Thread(throbject,"producer");
		pro.start();
		con.start();
	}
}


class vecto implements Runnable {

	@Override
	public void run() {
		try {
			
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		if( Thread.currentThread().getName()=="consumer") {
			consume();
			System.out.println("Consumed and the remain is "+slist.size());
		}else if( Thread.currentThread().getName()=="producer") {
			produce();
			System.out.println("produced and the remain is "+slist.size());
		}}}catch(Exception e) {
			
		}

		
	}
	public synchronized void produce() throws InterruptedException {
		for(int i=0;i<pr;i++) {
			Random ran=new Random();
			slist.addCargo("get:  "+ran.nextInt()+"---");
		}
		this.notify();
		this.wait();
	};
	public synchronized void consume() throws InterruptedException {
		for(int i=0;i<co;i++) {
			if(slist.size()<=0) {
				this.notify();
				this.wait();
			}
			System.out.println(slist.getCargo(slist.size()-1));
			slist.removeCargo(slist.size()-1);
		}
	};
	WareHouse slist;
	boolean available;
	int co,pr;
	public vecto(int n,int m) {
		co=n;
		pr=m;
		available=false;
		slist=new WareHouse();
	}
}
